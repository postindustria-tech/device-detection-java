package fiftyone.devicedetection.hash.engine.onpremise.flowelements;

import fiftyone.devicedetection.hash.engine.onpremise.TestsBase;
import fiftyone.devicedetection.hash.engine.onpremise.interop.swig.*;
import fiftyone.devicedetection.shared.DeviceDataBase;
import fiftyone.devicedetection.shared.DeviceDataBaseOnPremise;
import fiftyone.pipeline.core.data.FlowData;
import fiftyone.pipeline.engines.Constants;
import fiftyone.pipeline.engines.exceptions.PropertyMissingException;
import fiftyone.pipeline.engines.services.MissingPropertyReason;
import fiftyone.pipeline.engines.services.MissingPropertyResult;
import fiftyone.pipeline.engines.services.MissingPropertyService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

public class DeviceData extends TestsBase {

    private static final Logger logger = mock(Logger.class);

    private static final MissingPropertyService missingPropertyService =
        mock(MissingPropertyService.class);

    @Before
    public void init() throws Exception {
        testInitialize(Constants.PerformanceProfiles.HighPerformance);
        when(missingPropertyService.getMissingPropertyReason(anyString(), anyList()))
            .thenReturn(new MissingPropertyResult(
                MissingPropertyReason.PropertyExcludedFromEngineConfiguration,
                "test description"));
    }

    @After
    public void cleanup() {
        testCleanup();
    }

    /**
     * Check that a DeviceData is closed by the FlowData which contains it, and
     * that it in turn closes the native results.
     * @throws Exception
     */
    @Test
    public void DeviceData_ResultsClose() throws Exception {
        try (FlowData flowData = getWrapper().getPipeline().createFlowData()) {
	        DeviceDataHashDefault data = new DeviceDataHashDefault(
	            logger,
	            flowData,
	            getWrapper().getEngine(),
	            missingPropertyService);
	
	        ResultsHashSwig results = mock(ResultsHashSwig.class);
	        data.setResults(results);
	        flowData.getOrAdd(
	            getWrapper().getEngine().getTypedDataKey(),
	            arg -> data);
	        flowData.close();
	        verify(results, times(1)).close();
        }            
    }

    /**
     * Verify that the {@link ResultsHashSwig#containsProperty(String)} method
     * is called the expected number of times when the target method is called
     * on the {@link DeviceDataHashDefault} instance.
     * @param data instance to call method on
     * @param results to be checked
     * @param getMethod to call on the data
     * @param expectedCount number of calls to results
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    private void verifyCallsToContainsProperty(
        DeviceDataHashDefault data,
        ResultsHashSwig results,
        Method getMethod,
        int expectedCount)
        throws InvocationTargetException, IllegalAccessException {
        clearInvocations(results);
        getMethod.invoke(data, "InvalidProperty");
        verify(results, times(expectedCount))
            .containsProperty(anyString(), anyLong());
    }

    /**
     * Configure the mock native results to return an empty value for all getter
     * types.
     * @param results to set up
     */
    private void configureNativeGettersNoValue(ResultsHashSwig results) {
        StringValueSwig stringValue = mock(StringValueSwig.class);
        BoolValueSwig boolValue = mock(BoolValueSwig.class);
        IntegerValueSwig intValue = mock(IntegerValueSwig.class);
        DoubleValueSwig doubleValue = mock(DoubleValueSwig.class);
        VectorStringValuesSwig vectorValue = mock(VectorStringValuesSwig.class);

        when(stringValue.hasValue()).thenReturn(false);
        when(boolValue.hasValue()).thenReturn(false);
        when(intValue.hasValue()).thenReturn(false);
        when(doubleValue.hasValue()).thenReturn(false);
        when(vectorValue.hasValue()).thenReturn(false);

        when(results.getValueAsString(anyString(), anyLong())).thenReturn(stringValue);
        when(results.getValueAsBool(anyString(), anyLong())).thenReturn(boolValue);
        when(results.getValueAsInteger(anyString(), anyLong())).thenReturn(intValue);
        when(results.getValueAsDouble(anyString(), anyLong())).thenReturn(doubleValue);
        when(results.getValues(anyString(), anyLong())).thenReturn(vectorValue);
    }

    /**
     * Check that when there is only one native result, the
     * {@link ResultsHashSwig#containsProperty(String)} method is not called
     * when calling the protected get methods.
     */
    @Test
    public void DeviceData_ContainsProperty_SingleResult()
        throws Exception {
        try (FlowData flowData = getWrapper().getPipeline().createFlowData()) {
	        DeviceDataHashDefault data = new DeviceDataHashDefault(
	            logger,
	            flowData,
	            getWrapper().getEngine(),
	            missingPropertyService);
	
	        ResultsHashSwig results = mock(ResultsHashSwig.class);
	        configureNativeGettersNoValue(results);
	        when(results.containsProperty(anyString(), anyLong())).thenReturn(false);
	        data.setResults(results);
	
	        for (Method method : data.getClass().getMethods()) {
	            if (method.getName().startsWith("getValue") &&
	                method.getParameterCount() == 1 &&
	                method.getParameterTypes()[0].equals(String.class)) {
	                verifyCallsToContainsProperty(
	                    data,
	                    results,
	                    method,
	                    0);
	            }
	        }
        }
    }

    /**
     * Check that when there are multiple native results, the
     * {@link ResultsHashSwig#containsProperty(String)} method is called once
     * when calling the protected get methods.
     */
    @Test
    public void DeviceData_ContainsProperty_MultipleResults()
        throws Exception {
        try (FlowData flowData = getWrapper().getPipeline().createFlowData()) {
	        DeviceDataHashDefault data = new DeviceDataHashDefault(
	            logger,
	            flowData,
	            getWrapper().getEngine(),
	            missingPropertyService);
	
	        ResultsHashSwig results1 = mock(ResultsHashSwig.class);
	        configureNativeGettersNoValue(results1);
	        when(results1.containsProperty(anyString(), anyLong())).thenReturn(false);
	        ResultsHashSwig results2 = mock(ResultsHashSwig.class);
	        configureNativeGettersNoValue(results2);
	        when(results2.containsProperty(anyString(), anyLong())).thenReturn(false);
	
	        data.setResults(results1);
	        data.setResults(results2);
	
	        for (Method method : data.getClass().getMethods()) {
	            if (method.getName().startsWith("getValue") &&
	                method.getParameterCount() == 1 &&
	                method.getParameterTypes()[0].equals(String.class)) {
	                verifyCallsToContainsProperty(
	                    data,
	                    results1,
	                    method,
	                    1);
	                verifyCallsToContainsProperty(
	                    data,
	                    results2,
	                    method,
	                    1);
	            }
	        }
        }
    }

    /**
     * Check that when there is only one native results, the
     * {@link ResultsHashSwig#containsProperty(String)} method is called once
     * when calling the public get method, and a {@link PropertyMissingException}
     * is thrown when it does not the property.
     */
    @Test
    public void DeviceData_MissingProperty_SingleResult() throws Exception {
        try (FlowData flowData = getWrapper().getPipeline().createFlowData()) {
	        DeviceDataHashDefault data = new DeviceDataHashDefault(
	            logger,
	            flowData,
	            getWrapper().getEngine(),
	            missingPropertyService);
	
	        ResultsHashSwig results = mock(ResultsHashSwig.class);
	        when(results.containsProperty(anyString(), anyLong())).thenReturn(false);
	        data.setResults(results);
	
	        try {
	            data.get("Invalid");
	            fail("A missing property exception should have been thrown");
	        }
	        catch (PropertyMissingException e) {
	
	        }
	        verify(
	            results, times(1))
	            .containsProperty(anyString(), anyLong());	        
        }
    }

    /**
     * Check that when there are multiple native results, the
     * {@link ResultsHashSwig#containsProperty(String)} method is called once
     * when calling the public get method, and a {@link PropertyMissingException}
     * is thrown when none contain the property.
     */
    @Test
    public void DeviceData_MissingProperty_MultipleResults() throws Exception {
        try (FlowData flowData = getWrapper().getPipeline().createFlowData()) {
	        DeviceDataHashDefault data = new DeviceDataHashDefault(
	            logger,
	            flowData,
	            getWrapper().getEngine(),
	            missingPropertyService);
	
	        ResultsHashSwig results1 = mock(ResultsHashSwig.class);
	        when(results1.containsProperty(anyString(), anyLong())).thenReturn(false);
	        ResultsHashSwig results2 = mock(ResultsHashSwig.class);
	        when(results2.containsProperty(anyString(), anyLong())).thenReturn(false);
	
	        data.setResults(results1);
	        data.setResults(results2);
	
	        try {
	            data.get("Invalid");
	            fail("A missing property exception should have been thrown");
	        }
	        catch (PropertyMissingException e) {
	
	        }
	        verify(
	            results1, times(1))
	            .containsProperty(anyString(), anyLong());
	        verify(
	            results2, times(1))
	            .containsProperty(anyString(), anyLong());
        }
    }

    /**
     * Interface used for lambda in
     * {@link #checkThrowsIllegalState(DeviceDataHashDefault, DeviceDataHashCall)}.
     */
    private interface DeviceDataHashCall {
        void call(DeviceDataHashDefault instance);
    }

    /**
     * Call a method and check that an {@link IllegalStateException} is thrown.
     * @param instance to call method on
     * @param methodCall lambda to call on instance
     * @throws Exception
     */
    private void checkThrowsIllegalState(
        DeviceDataHashDefault instance,
        DeviceDataHashCall methodCall) throws Exception {
        try {
            methodCall.call(instance);
            fail("An exception was not thrown by even though the instance " +
                "was closed.");
        } catch (Exception e) {
            if (e instanceof IllegalStateException ||
                (e.getCause() != null && e.getCause() instanceof IllegalStateException)) {
                // This is the exception we want.
            }
            else {
                throw e;
            }
        }
    }

    /**
     * Check that once a {@link DeviceDataHashDefault} instance has been closed,
     * an {@link IllegalStateException} is throw when calling get methods.
     * @throws Exception
     */
    @Test
    public void DeviceData_Closed() throws Exception {
        try (FlowData flowData = getWrapper().getPipeline().createFlowData()) {
	        DeviceDataHashDefault data = new DeviceDataHashDefault(
	            logger,
	            flowData,
	            getWrapper().getEngine(),
	            missingPropertyService);
	
	        ResultsHashSwig results = mock(ResultsHashSwig.class);
	        data.setResults(results);       
	        
            data.close();
            
	        checkThrowsIllegalState(
	            data,
	            (d) -> d.get("ismobile"));
	        checkThrowsIllegalState(
	            data,
	            DeviceDataBase::getIsMobile);
	        checkThrowsIllegalState(
	            data,
	            DeviceDataBaseOnPremise::asKeyMap);
        }
    }
}