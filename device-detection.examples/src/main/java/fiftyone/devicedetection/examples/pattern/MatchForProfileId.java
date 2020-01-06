/* *********************************************************************
 * This Original Work is copyright of 51 Degrees Mobile Experts Limited.
 * Copyright 2019 51 Degrees Mobile Experts Limited, 5 Charlotte Close,
 * Caversham, Reading, Berkshire, United Kingdom RG4 7BY.
 *
 * This Original Work is licensed under the European Union Public Licence (EUPL) 
 * v.1.2 and is subject to its terms as set out below.
 *
 * If a copy of the EUPL was not distributed with this file, You can obtain
 * one at https://opensource.org/licenses/EUPL-1.2.
 *
 * The 'Compatible Licences' set out in the Appendix to the EUPL (as may be
 * amended by the European Commission) shall be deemed incompatible for
 * the purposes of the Work and the provisions of the compatibility
 * clause in Article 5 of the EUPL shall not apply.
 * 
 * If using the Work as, or as part of, a network application, by 
 * including the attribution notice(s) required under Article 5 of the EUPL
 * in the end user terms of the application under an appropriate heading, 
 * such notice(s) shall fulfill the requirements of that article.
 * ********************************************************************* */

package fiftyone.devicedetection.examples.pattern;

import fiftyone.devicedetection.DeviceDetectionPipelineBuilder;
import fiftyone.devicedetection.examples.ExampleBase;
import fiftyone.devicedetection.examples.ProgramBase;
import fiftyone.devicedetection.shared.DeviceData;
import fiftyone.pipeline.core.data.FlowData;
import fiftyone.pipeline.core.flowelements.Pipeline;
import fiftyone.pipeline.engines.Constants;

/**
 * @example pattern/MatchForProfileId.java
 *
 * Match for profile id example of using 51Degrees device detection.
 *
 * The example shows how to:
 *
 * 1. Build a new Pipeline to use an on-premise Pattern engine with the low memory
 * performance profile.
 * ```
 * Pipeline pipeline = new DeviceDetectionPipelineBuilder()
 *     .useOnPremise("51Degrees-LiteV3.2.dat", false)
 *     .setAutoUpdate(false)
 *     .setPerformanceProfile(Constants.PerformanceProfiles.LowMemory)
 *     .build();
 * ```
 *
 * 2. Create a new FlowData instance ready to be populated with evidence for the
 * Pipeline.
 * ```
 * FlowData data = pipeline.createFlowData();
 * ```
 *
 * 3. Process a single HTTP User-Agent string and extract the device id (a list
 * of profile ids uniquely describing the device) for later lookup.
 * ```
 * data.addEvidence("header.user-agent", mobileUserAgent)
 *     .process();
 *
 * String deviceId = data.get(DeviceData.class).getDeviceId();
 * ```
 * 4. Create a new FlowData instance process the device id extracted earlier.
 * ```
 * FlowData data = pipeline.createFlowData();
 * data.addEvidence("query.51D_ProfileIds", deviceId)
 * .process();
 * ```
 *
 * 5. Extract the value of a property as a string from the results.
 * ```
 * println("IsMobile: " + data.get(DeviceData.class).getIsMobile());
 * ```
 *
 */

public class MatchForProfileId extends ProgramBase {

    public static void main(String[] args) throws Exception {
        String dataFile = args.length > 0 ? args[0] :
            getDefaultFilePath("51Degrees-LiteV3.2.dat").getAbsolutePath();

        new Example(true).run(dataFile);
        System.out.println("Complete. Press enter to exit.");
        System.in.read();
    }

    public static class Example extends ExampleBase {
        private String mobileUserAgent =
            "Mozilla/5.0 (iPhone; CPU iPhone OS 7_1 like Mac OS X) " +
                "AppleWebKit/537.51.2 (KHTML, like Gecko) Version/7.0 Mobile" +
                "/11D167 Safari/9537.53";

        public Example(boolean printOutput) {
            super(printOutput);
        }

        public void run(String dataFile) throws Exception {
            println("Constructing pipeline with engine " +
                "from file " + dataFile);
            // Create a simple pipeline to access the engine with.
            Pipeline pipeline = new DeviceDetectionPipelineBuilder()
                .useOnPremise(dataFile, false)
                .setAutoUpdate(false)
                // Prefer low memory profile where all data streamed
                // from disk on-demand. Experiment with other profiles.
                //.setPerformanceProfile(Constants.PerformanceProfiles.HighPerformance)
                .setPerformanceProfile(Constants.PerformanceProfiles.LowMemory)
                //.setShareUsage(false)
                //.setPerformanceProfile(Constants.PerformanceProfiles.Balanced)
                .build();

            // Get the device id from an iPhone User-Agent.
            String deviceId;
            FlowData data = pipeline.createFlowData();
            data.addEvidence(
                "header.user-agent",
                mobileUserAgent)
                .process();
            deviceId = data.get(DeviceData.class).getDeviceId().getValue();

            // Process the device id which has been pre-calculated.
            data = pipeline.createFlowData();
            data.addEvidence(
                "query.51D_ProfileIds",
                deviceId)
                .process();
            println("DeviceId: " + deviceId);
            println("IsMobile: " + data.get(DeviceData.class).getIsMobile().getValue());
        }
    }
}
