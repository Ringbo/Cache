diff --git a/qa/smoke-test-rank-eval-with-mustache/src/test/java/org/elasticsearch/smoketest/SmokeTestRankEvalWithMustacheYAMLTestSuiteIT.java b/qa/smoke-test-rank-eval-with-mustache/src/test/java/org/elasticsearch/smoketest/SmokeTestRankEvalWithMustacheYAMLTestSuiteIT.java
index 6fc2829..92c60b6 100644
--- a/qa/smoke-test-rank-eval-with-mustache/src/test/java/org/elasticsearch/smoketest/SmokeTestRankEvalWithMustacheYAMLTestSuiteIT.java
+++ b/qa/smoke-test-rank-eval-with-mustache/src/test/java/org/elasticsearch/smoketest/SmokeTestRankEvalWithMustacheYAMLTestSuiteIT.java
@@ -36,7 +36,7 @@
 
     @ParametersFactory
     public static Iterable<Object[]> parameters() throws IOException, ClientYamlTestParseException {
-        return ESClientYamlSuiteTestCase.createParameters(0, 1);
+        return ESClientYamlSuiteTestCase.createParameters();
     }
 
 }
