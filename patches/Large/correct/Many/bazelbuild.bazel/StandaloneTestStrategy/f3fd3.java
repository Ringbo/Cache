diff --git a/src/main/java/com/google/devtools/build/lib/exec/StandaloneTestStrategy.java b/src/main/java/com/google/devtools/build/lib/exec/StandaloneTestStrategy.java
index 7675da1..f63d519 100644
--- a/src/main/java/com/google/devtools/build/lib/exec/StandaloneTestStrategy.java
+++ b/src/main/java/com/google/devtools/build/lib/exec/StandaloneTestStrategy.java
@@ -244,7 +244,7 @@
     for (int i = 0; i < data.getFailedLogsCount(); i++) {
       dataBuilder.addFailedLogs(data.getFailedLogs(i));
     }
-    if (data.hasTestPassed()) {
+    if (data.getTestPassed()) {
       dataBuilder.setPassedLog(data.getPassedLog());
     }
     dataBuilder.addTestTimes(data.getTestTimes(0));
