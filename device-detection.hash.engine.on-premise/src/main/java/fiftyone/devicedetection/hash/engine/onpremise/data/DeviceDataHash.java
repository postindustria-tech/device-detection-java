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

package fiftyone.devicedetection.hash.engine.onpremise.data;

import fiftyone.devicedetection.shared.DeviceData;
import fiftyone.pipeline.engines.data.AspectPropertyValue;

import java.util.List;

public interface DeviceDataHash extends DeviceData {

    AspectPropertyValue<List<String>> getValues(String propertyName);

    /**
     * The method used to determine the result from the evidence
     * provided e.g. exact or predictive. Where multiple items of evidence
     * are supplied, this returns the worst matching method that was used
     * for an evidence item.
     */
    AspectPropertyValue<String> getMethod();

    /**
     * The total difference in matching hash values found in the evidence.
     * The higher this value, the less accurate the results should be
     * considered.
     */
    AspectPropertyValue<Integer> getDifference();

    /**
     * Returns the maximum drift for a matched substring from the character
     * position where it was expected to be found.The higher this value, the
     * less accurate the results should be considered.
     */
    AspectPropertyValue<Integer> getDrift();

    /**
     * Returns the number of hash nodes matched within the evidence.
     */
    AspectPropertyValue<Integer> getMatchedNodes();

    AspectPropertyValue<Integer> getIterations();

}
