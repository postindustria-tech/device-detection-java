package fiftyone.devicedetection.examples.shared;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExampleTestHelper {

    /**
     * Prepare evidence for use in examples
     */
    public static List<Map<String, String>> setUpEvidence() {
        Map<String, String> evidence1 = new HashMap<>();
        evidence1.put("header.user-agent",
                "Mozilla/5.0 (Linux; Android 9; SAMSUNG SM-G960U) " +
                        "AppleWebKit/537.36 (KHTML, like Gecko) " +
                        "SamsungBrowser/10.1 Chrome/71.0.3578.99 Mobile " +
                        "Safari/537.36");
        Map<String, String> evidence2 = new HashMap<>();
        evidence2.put("header.user-agent",
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                        "AppleWebKit/537.36 (KHTML, like Gecko) " +
                        "Chrome/78.0.3904.108 Safari/537.36");
        Map<String, String> evidence3 = new HashMap<>();
        evidence3.put("header.user-agent",
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                        "AppleWebKit/537.36 (KHTML, like Gecko) " +
                        "Chrome/98.0.4758.102 Safari/537.36");
        evidence3.put("header.sec-ch-ua-mobile", "?0");
        evidence3.put("header.sec-ch-ua",
                "\" Not A; Brand\";v=\"99\", \"Chromium\";v=\"98\", " +
                        "\"Google Chrome\";v=\"98\"");
        evidence3.put("header.sec-ch-ua-platform", "\"Windows\"");
        evidence3.put("header.sec-ch-ua-platform-version", "\"14.0.0\"");
        List<Map<String, String>> evidence = new ArrayList<>();
        evidence.add(evidence1);
        evidence.add(evidence2);
        evidence.add(evidence3);

        return evidence;
    }
}