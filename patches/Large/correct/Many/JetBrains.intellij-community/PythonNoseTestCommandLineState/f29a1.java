diff --git a/python/src/com/jetbrains/python/testing/nosetest/PythonNoseTestCommandLineState.java b/python/src/com/jetbrains/python/testing/nosetest/PythonNoseTestCommandLineState.java
index b5b2759..80e36e2 100644
--- a/python/src/com/jetbrains/python/testing/nosetest/PythonNoseTestCommandLineState.java
+++ b/python/src/com/jetbrains/python/testing/nosetest/PythonNoseTestCommandLineState.java
@@ -72,7 +72,7 @@
     ParamsGroup script_params = cmd.getParametersList().getParamsGroup(GROUP_SCRIPT);
     assert script_params != null;
     if (myConfig.useParam() && !StringUtil.isEmptyOrSpaces(myConfig.getParams()))
-      script_params.addParameter(myConfig.getParams());
+      script_params.addParametersString(myConfig.getParams());
 
   }
 }
