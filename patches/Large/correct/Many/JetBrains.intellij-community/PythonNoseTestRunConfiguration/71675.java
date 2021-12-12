diff --git a/python/src/com/jetbrains/python/testing/nosetest/PythonNoseTestRunConfiguration.java b/python/src/com/jetbrains/python/testing/nosetest/PythonNoseTestRunConfiguration.java
index 33e1565..9086436 100644
--- a/python/src/com/jetbrains/python/testing/nosetest/PythonNoseTestRunConfiguration.java
+++ b/python/src/com/jetbrains/python/testing/nosetest/PythonNoseTestRunConfiguration.java
@@ -79,7 +79,7 @@
   public void checkConfiguration() throws RuntimeConfigurationException {
     super.checkConfiguration();
     if (!PyTestFrameworksUtil.isNoseTestInstalled(getProject(), getSdkHome()))
-      throw new RuntimeConfigurationError("No nosetest runner found in selected interpreter");
+      throw new RuntimeConfigurationWarning("No nosetest runner found in selected interpreter");
   }
 
   public boolean useParam() {
