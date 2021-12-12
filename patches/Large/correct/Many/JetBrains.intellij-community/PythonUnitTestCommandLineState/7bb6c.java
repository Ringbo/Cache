diff --git a/python/src/com/jetbrains/python/testing/unittest/PythonUnitTestCommandLineState.java b/python/src/com/jetbrains/python/testing/unittest/PythonUnitTestCommandLineState.java
index 6d859b4..372b295 100644
--- a/python/src/com/jetbrains/python/testing/unittest/PythonUnitTestCommandLineState.java
+++ b/python/src/com/jetbrains/python/testing/unittest/PythonUnitTestCommandLineState.java
@@ -42,7 +42,7 @@
       pythonPath.add(1, myConfig.getFolderName());
     }
     else {
-      pythonPath.add(1, new File(myConfig.getWorkingDirectory(), myConfig.getScriptName()).getParent());
+      pythonPath.add(1, new File(myConfig.getScriptName()).getParent());
     }
     return pythonPath;
   }
