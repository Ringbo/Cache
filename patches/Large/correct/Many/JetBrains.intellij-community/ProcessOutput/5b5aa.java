diff --git a/platform/platform-api/src/com/intellij/execution/process/ProcessOutput.java b/platform/platform-api/src/com/intellij/execution/process/ProcessOutput.java
index 8260200..6fb27bc 100644
--- a/platform/platform-api/src/com/intellij/execution/process/ProcessOutput.java
+++ b/platform/platform-api/src/com/intellij/execution/process/ProcessOutput.java
@@ -90,7 +90,7 @@
    * @return true iff exit code is zero
    */
   public boolean checkSuccess(@NotNull final Logger logger) {
-    if (getExitCode() != 0) {
+    if (getExitCode() != 0 || isTimeout()) {
       logger.info(getStderr() + (isTimeout()? "\nTimed out" : "\nExit code " + getExitCode()));
       return false;
     }
