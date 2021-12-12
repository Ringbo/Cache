diff --git a/smack-integration-test/src/main/java/org/igniterealtime/smack/inttest/TestResult.java b/smack-integration-test/src/main/java/org/igniterealtime/smack/inttest/TestResult.java
index 4dd585c..8626795 100644
--- a/smack-integration-test/src/main/java/org/igniterealtime/smack/inttest/TestResult.java
+++ b/smack-integration-test/src/main/java/org/igniterealtime/smack/inttest/TestResult.java
@@ -29,7 +29,7 @@
 
     public TestResult(Method testMethod, long startTime, long endTime, List<String> logMessages) {
         this.testMethod = testMethod;
-        assert (endTime > startTime);
+        assert (endTime >= startTime);
         this.startTime = startTime;
         this.endTime = endTime;
         this.duration = endTime - startTime;
