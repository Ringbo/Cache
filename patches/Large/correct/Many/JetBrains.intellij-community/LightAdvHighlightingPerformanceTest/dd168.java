diff --git a/java/java-tests/testSrc/com/intellij/codeInsight/daemon/LightAdvHighlightingPerformanceTest.java b/java/java-tests/testSrc/com/intellij/codeInsight/daemon/LightAdvHighlightingPerformanceTest.java
index 92ce7d6..a331e33 100644
--- a/java/java-tests/testSrc/com/intellij/codeInsight/daemon/LightAdvHighlightingPerformanceTest.java
+++ b/java/java-tests/testSrc/com/intellij/codeInsight/daemon/LightAdvHighlightingPerformanceTest.java
@@ -119,7 +119,7 @@
 
   public void testAClassLoader() throws Exception {
     List<HighlightInfo> errors = doTest(Math.max(1000, 10000 - JobSchedulerImpl.CORES_COUNT * 1000));
-    if (174 != errors.size()) {
+    if (173 != errors.size()) {
       doTest(getFilePath("_hl"), false, false);
       fail("Actual: " + errors.size());
     }
