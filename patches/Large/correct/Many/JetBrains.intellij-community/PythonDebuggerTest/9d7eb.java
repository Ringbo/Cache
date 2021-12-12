diff --git a/python/testSrc/com/jetbrains/env/python/PythonDebuggerTest.java b/python/testSrc/com/jetbrains/env/python/PythonDebuggerTest.java
index 38afc99..aa12082 100644
--- a/python/testSrc/com/jetbrains/env/python/PythonDebuggerTest.java
+++ b/python/testSrc/com/jetbrains/env/python/PythonDebuggerTest.java
@@ -82,7 +82,7 @@
   @Test
   @Staging
   public void testPydevTests_Debugger() {
-    unittests("tests_pydevd_python/test_debugger.py", null);
+    unittests("tests_pydevd_python/test_debugger.py", null, true);
   }
 
   @Test
@@ -1395,7 +1395,7 @@
         setScriptName("test1");
         setWaitForTermination(false);
 
-        myRunConfiguration.setInterpreterOptions("-m");
+        myRunConfiguration.setModuleMode(true);
       }
     });
   }
