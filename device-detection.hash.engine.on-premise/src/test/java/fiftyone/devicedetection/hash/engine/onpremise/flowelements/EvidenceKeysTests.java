/* *********************************************************************
 * This Original Work is copyright of 51 Degrees Mobile Experts Limited.
 * Copyright 2025 51 Degrees Mobile Experts Limited, Davidson House,
 * Forbury Square, Reading, Berkshire, United Kingdom RG1 3EU.
 *
 * This Original Work is licensed under the European Union Public Licence
 * (EUPL) v.1.2 and is subject to its terms as set out below.
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

package fiftyone.devicedetection.hash.engine.onpremise.flowelements;

import fiftyone.devicedetection.hash.engine.onpremise.TestsBase;
import fiftyone.devicedetection.shared.testhelpers.flowelements.EvidenceKeyTests;
import fiftyone.pipeline.engines.Constants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assume.assumeFalse;

public class EvidenceKeysTests extends TestsBase {

    @Before
    public void init() throws Exception {
        testInitialize(Constants.PerformanceProfiles.HighPerformance);
    }

    @After
    public void cleanup() {
        testCleanup();
    }

    @Test
    public void EvidenceKeys_Hash_ContainsUserAgent() {
        EvidenceKeyTests.containsUserAgent(getWrapper());
    }

    @Test
    public void EvidenceKeys_Hash_ContainsHeaderNames() {
        EvidenceKeyTests.containsHeaderNames(getWrapper());
    }

    @Test
    public void EvidenceKeys_Hash_ContainsOverrides() {
        assumeFalse("Need to run test with Enterprise data",
                getWrapper().getEngine().getDataSourceTier().equals("Lite"));
        EvidenceKeyTests.containsOverrides(getWrapper());
    }

    @Test
    public void EvidenceKeys_Hash_CaseInsensitiveKeys() {
        EvidenceKeyTests.caseInsensitiveKeys(getWrapper());
    }
}
