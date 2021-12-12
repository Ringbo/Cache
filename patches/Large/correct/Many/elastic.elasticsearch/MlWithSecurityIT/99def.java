diff --git a/qa/smoke-test-ml-with-security/src/test/java/org/elasticsearch/smoketest/MlWithSecurityIT.java b/qa/smoke-test-ml-with-security/src/test/java/org/elasticsearch/smoketest/MlWithSecurityIT.java
index 0932034..04a764f 100644
--- a/qa/smoke-test-ml-with-security/src/test/java/org/elasticsearch/smoketest/MlWithSecurityIT.java
+++ b/qa/smoke-test-ml-with-security/src/test/java/org/elasticsearch/smoketest/MlWithSecurityIT.java
@@ -37,7 +37,7 @@
     private static final String TEST_ADMIN_PASSWORD = "changeme";
 
     @After
-    public void clearMlState() throws IOException {
+    public void clearMlState() throws Exception {
         new MlRestTestStateCleaner(logger, adminClient(), this).clearMlMetadata();
     }
 
