diff --git a/python/src/com/jetbrains/python/testing/doctest/PythonDocTestCommandLineState.java b/python/src/com/jetbrains/python/testing/doctest/PythonDocTestCommandLineState.java
index f01d099..eecdd8e 100644
--- a/python/src/com/jetbrains/python/testing/doctest/PythonDocTestCommandLineState.java
+++ b/python/src/com/jetbrains/python/testing/doctest/PythonDocTestCommandLineState.java
@@ -38,7 +38,7 @@
       pythonPath.add(1, myConfig.getFolderName());
     }
     else {
-      pythonPath.add(1, new File(myConfig.getWorkingDirectory(), myConfig.getScriptName()).getParent());
+      pythonPath.add(1, new File(myConfig.getScriptName()).getParent());
     }
     return pythonPath;
   }
