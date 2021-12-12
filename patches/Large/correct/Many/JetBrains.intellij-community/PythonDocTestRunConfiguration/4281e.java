diff --git a/python/src/com/jetbrains/python/testing/doctest/PythonDocTestRunConfiguration.java b/python/src/com/jetbrains/python/testing/doctest/PythonDocTestRunConfiguration.java
index f1c2f19..9b3a3a1 100644
--- a/python/src/com/jetbrains/python/testing/doctest/PythonDocTestRunConfiguration.java
+++ b/python/src/com/jetbrains/python/testing/doctest/PythonDocTestRunConfiguration.java
@@ -133,19 +133,19 @@
     super.checkConfiguration();
 
     if (StringUtil.isEmptyOrSpaces(myFolderName) && myTestType == TestType.TEST_FOLDER) {
-      throw new RuntimeConfigurationException(PyBundle.message("runcfg.unittest.no_folder_name"));
+      throw new RuntimeConfigurationError(PyBundle.message("runcfg.unittest.no_folder_name"));
     }
 
     if (StringUtil.isEmptyOrSpaces(getScriptName()) && myTestType != TestType.TEST_FOLDER) {
-      throw new RuntimeConfigurationException(PyBundle.message("runcfg.unittest.no_script_name"));
+      throw new RuntimeConfigurationError(PyBundle.message("runcfg.unittest.no_script_name"));
     }
 
     if (StringUtil.isEmptyOrSpaces(myClassName) && (myTestType == TestType.TEST_METHOD || myTestType == TestType.TEST_CLASS)) {
-      throw new RuntimeConfigurationException(PyBundle.message("runcfg.unittest.no_class_name"));
+      throw new RuntimeConfigurationError(PyBundle.message("runcfg.unittest.no_class_name"));
     }
 
     if (StringUtil.isEmptyOrSpaces(myMethodName) && myTestType == TestType.TEST_METHOD) {
-      throw new RuntimeConfigurationException(PyBundle.message("runcfg.unittest.no_method_name"));
+      throw new RuntimeConfigurationError(PyBundle.message("runcfg.unittest.no_method_name"));
     }
   }
 
