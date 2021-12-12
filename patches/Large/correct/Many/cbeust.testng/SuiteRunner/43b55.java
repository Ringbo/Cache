diff --git a/src/main/java/org/testng/SuiteRunner.java b/src/main/java/org/testng/SuiteRunner.java
index 5bb1397..798fa8a 100644
--- a/src/main/java/org/testng/SuiteRunner.java
+++ b/src/main/java/org/testng/SuiteRunner.java
@@ -569,7 +569,7 @@
       }
 
       for (ITestListener itl : m_failureGenerators) {
-        testRunner.addListener(itl);
+        testRunner.addTestListener(itl);
       }
       for (IConfigurationListener cl : m_configuration.getConfigurationListeners()) {
         testRunner.addConfigurationListener(cl);
