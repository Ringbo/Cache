diff --git a/python/src/com/jetbrains/python/testing/attest/PythonAtTestCommandLineState.java b/python/src/com/jetbrains/python/testing/attest/PythonAtTestCommandLineState.java
index 3ea1c08..58a12a6 100644
--- a/python/src/com/jetbrains/python/testing/attest/PythonAtTestCommandLineState.java
+++ b/python/src/com/jetbrains/python/testing/attest/PythonAtTestCommandLineState.java
@@ -38,7 +38,7 @@
       pythonPath.add(1, myConfig.getFolderName());
     }
     else {
-      pythonPath.add(1, new File(myConfig.getWorkingDirectory(), myConfig.getScriptName()).getParent());
+      pythonPath.add(1, new File(myConfig.getScriptName()).getParent());
     }
     return pythonPath;
   }
