diff --git a/python/src/com/jetbrains/python/run/PythonScriptCommandLineState.java b/python/src/com/jetbrains/python/run/PythonScriptCommandLineState.java
index 5f8e8b1..ff4ff77 100644
--- a/python/src/com/jetbrains/python/run/PythonScriptCommandLineState.java
+++ b/python/src/com/jetbrains/python/run/PythonScriptCommandLineState.java
@@ -27,7 +27,7 @@
     assert exe_options != null;
     exe_options.addParametersString(myConfig.getInterpreterOptions());
 
-    ParamsGroup script_parameters = parametersList.getParamsGroup(GROUP_EXE_OPTIONS);
+    ParamsGroup script_parameters = parametersList.getParamsGroup(GROUP_SCRIPT);
     assert script_parameters != null;
     if (!StringUtil.isEmptyOrSpaces(myConfig.getScriptName())) {
       script_parameters.addParameter(myConfig.getScriptName());
