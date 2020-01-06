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

import fiftyone.devicedetection.examples.ExampleBase;
import fiftyone.devicedetection.examples.ProgramBase;
import fiftyone.devicedetection.shared.DeviceData;
import fiftyone.pipeline.core.configuration.PipelineOptions;
import fiftyone.pipeline.core.data.FlowData;
import fiftyone.pipeline.core.flowelements.Pipeline;
import fiftyone.pipeline.engines.data.AspectPropertyValue;
import fiftyone.pipeline.engines.fiftyone.flowelements.FiftyOnePipelineBuilder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * @example pattern/ConfigureFromFile.java
 *
 * Configure from file example of using 51Degrees device detection.
 *
 * The example shows how to:
 *
 * 1. Create a Pipeline configuration from an XML file.
 * ```
 * File file = new File("pattern.xml");
 * JAXBContext jaxbContext = JAXBContext.newInstance(PipelineOptions.class);
 * Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
 * PipelineOptions options = (PipelineOptions) unmarshaller.unmarshal(file);
 * ```
 *
 * 2. Build a new Pipeline from the configuration.
 * ```
 * Pipeline pipeline = new FiftyOnePipelineBuilder()
 *     .buildFromConfiguration(options);
 * ```
 *
 * 3. Create a new FlowData instance ready to be populated with evidence for the
 * Pipeline.
 * ```
 * FlowData data = pipeline.createFlowData();
 * ```
 *
 * 4. Process a single HTTP User-Agent string to retrieve the values associated
 * with the User-Agent for the selected properties.
 * ```
 * data.addEvidence("header.User-Agent", mobileUserAgent)
 *     .process();
 * ```
 *
 * 5. Extract the value of a property as a string from the results.
 * ```
 * println("IsMobile: " + data.get(DeviceData.class).getIsMobile());
 * ```
 */

public class ConfigureFromFile extends ProgramBase {

    public static void main(String[] args) throws Exception {
        new Example(true).run();
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

        public void run() throws Exception {
            // Create the configuration object
            File file = new File(getClass().getClassLoader().getResource("pattern.xml").getFile());
            JAXBContext jaxbContext = JAXBContext.newInstance(PipelineOptions.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            // Bind the configuration to a pipeline options instance
            PipelineOptions options = (PipelineOptions) unmarshaller.unmarshal(file);

            FiftyOnePipelineBuilder builder = new FiftyOnePipelineBuilder();
            // Create a simple pipeline to access the engine with.
            try (Pipeline pipeline = builder
                .buildFromConfiguration(options)) {
                FlowData data = pipeline.createFlowData();
                data.addEvidence(
                    "header.user-agent",
                    mobileUserAgent)
                    .process();
                AspectPropertyValue<Boolean> isMobile =
                    data.get(DeviceData.class).getIsMobile();
                if (isMobile.hasValue()) {
                    println("IsMobile: " + isMobile.getValue());
                } else {
                    println(isMobile.getNoValueMessage());
                }
            }
        }
    }
}
