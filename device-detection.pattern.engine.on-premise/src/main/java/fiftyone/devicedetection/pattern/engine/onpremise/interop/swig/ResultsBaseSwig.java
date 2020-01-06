/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package fiftyone.devicedetection.pattern.engine.onpremise.interop.swig;

public class ResultsBaseSwig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ResultsBaseSwig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ResultsBaseSwig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        DeviceDetectionPatternEngineModuleJNI.delete_ResultsBaseSwig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int getAvailableProperties() {
    return DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_getAvailableProperties(swigCPtr, this);
  }

  public boolean containsProperty(String propertyName) {
    return DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_containsProperty__SWIG_0(swigCPtr, this, propertyName);
  }

  public VectorStringSwig getProperties() {
    return new VectorStringSwig(DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_getProperties(swigCPtr, this), true);
  }

  public String getPropertyName(int requiredPropertyIndex) {
    return DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_getPropertyName(swigCPtr, this, requiredPropertyIndex);
  }

  public VectorStringValuesSwig getValues(String propertyName) {
    return new VectorStringValuesSwig(DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_getValues__SWIG_0(swigCPtr, this, propertyName), true);
  }

  public VectorStringValuesSwig getValues(int requiredPropertyIndex) {
    return new VectorStringValuesSwig(DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_getValues__SWIG_1(swigCPtr, this, requiredPropertyIndex), true);
  }

  public StringValueSwig getValueAsString(String propertyName) {
    return new StringValueSwig(DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_getValueAsString__SWIG_0(swigCPtr, this, propertyName), true);
  }

  public StringValueSwig getValueAsString(int requiredPropertyIndex) {
    return new StringValueSwig(DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_getValueAsString__SWIG_1(swigCPtr, this, requiredPropertyIndex), true);
  }

  public BoolValueSwig getValueAsBool(String propertyName) {
    return new BoolValueSwig(DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_getValueAsBool__SWIG_0(swigCPtr, this, propertyName), true);
  }

  public BoolValueSwig getValueAsBool(int requiredPropertyIndex) {
    return new BoolValueSwig(DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_getValueAsBool__SWIG_1(swigCPtr, this, requiredPropertyIndex), true);
  }

  public IntegerValueSwig getValueAsInteger(String propertyName) {
    return new IntegerValueSwig(DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_getValueAsInteger__SWIG_0(swigCPtr, this, propertyName), true);
  }

  public IntegerValueSwig getValueAsInteger(int requiredPropertyIndex) {
    return new IntegerValueSwig(DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_getValueAsInteger__SWIG_1(swigCPtr, this, requiredPropertyIndex), true);
  }

  public DoubleValueSwig getValueAsDouble(String propertyName) {
    return new DoubleValueSwig(DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_getValueAsDouble__SWIG_0(swigCPtr, this, propertyName), true);
  }

  public DoubleValueSwig getValueAsDouble(int requiredPropertyIndex) {
    return new DoubleValueSwig(DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_getValueAsDouble__SWIG_1(swigCPtr, this, requiredPropertyIndex), true);
  }

  public StringValueSwig getValueAsString(String propertyName, long propertyNameLength) {
    return new StringValueSwig(DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_getValueAsString__SWIG_2(swigCPtr, this, propertyName, propertyNameLength), true);
  }

  public VectorStringValuesSwig getValues(String propertyName, long propertyNameLength) {
    return new VectorStringValuesSwig(DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_getValues__SWIG_2(swigCPtr, this, propertyName, propertyNameLength), true);
  }

  public BoolValueSwig getValueAsBool(String propertyName, long propertyNameLength) {
    return new BoolValueSwig(DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_getValueAsBool__SWIG_2(swigCPtr, this, propertyName, propertyNameLength), true);
  }

  public IntegerValueSwig getValueAsInteger(String propertyName, long propertyNameLength) {
    return new IntegerValueSwig(DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_getValueAsInteger__SWIG_2(swigCPtr, this, propertyName, propertyNameLength), true);
  }

  public DoubleValueSwig getValueAsDouble(String propertyName, long propertyNameLength) {
    return new DoubleValueSwig(DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_getValueAsDouble__SWIG_2(swigCPtr, this, propertyName, propertyNameLength), true);
  }

  public boolean containsProperty(String propertyName, long propertyNameLength) {
    return DeviceDetectionPatternEngineModuleJNI.ResultsBaseSwig_containsProperty__SWIG_1(swigCPtr, this, propertyName, propertyNameLength);
  }

}
