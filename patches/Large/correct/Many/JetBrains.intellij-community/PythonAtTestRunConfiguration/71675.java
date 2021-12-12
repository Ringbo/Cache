diff --git a/python/src/com/jetbrains/python/testing/attest/PythonAtTestRunConfiguration.java b/python/src/com/jetbrains/python/testing/attest/PythonAtTestRunConfiguration.java
index 2274435..24bff2f 100644
--- a/python/src/com/jetbrains/python/testing/attest/PythonAtTestRunConfiguration.java
+++ b/python/src/com/jetbrains/python/testing/attest/PythonAtTestRunConfiguration.java
@@ -62,6 +62,6 @@
   public void checkConfiguration() throws RuntimeConfigurationException {
     super.checkConfiguration();
     if (!PyTestFrameworksUtil.isAtTestInstalled(getProject(), getSdkHome()))
-      throw new RuntimeConfigurationError("No attest runner found in selected interpreter");
+      throw new RuntimeConfigurationWarning("No attest runner found in selected interpreter");
   }
 }
