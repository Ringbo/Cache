diff --git a/python/src/com/jetbrains/python/testing/pytest/PyTestRunConfiguration.java b/python/src/com/jetbrains/python/testing/pytest/PyTestRunConfiguration.java
index cfb1068..f70a131 100644
--- a/python/src/com/jetbrains/python/testing/pytest/PyTestRunConfiguration.java
+++ b/python/src/com/jetbrains/python/testing/pytest/PyTestRunConfiguration.java
@@ -115,7 +115,7 @@
       throw new RuntimeConfigurationError("Please specify target folder or script");
     }
     if (!PyTestFrameworksUtil.isPyTestInstalled(getProject(), getSdkHome()))
-      throw new RuntimeConfigurationError("No py.test runner found in selected interpreter");
+      throw new RuntimeConfigurationWarning("No py.test runner found in selected interpreter");
   }
 
   @Override
