diff --git a/python/testSrc/com/jetbrains/env/python/PythonDebuggerTest.java b/python/testSrc/com/jetbrains/env/python/PythonDebuggerTest.java
index 8620d2a..72480fa 100644
--- a/python/testSrc/com/jetbrains/env/python/PythonDebuggerTest.java
+++ b/python/testSrc/com/jetbrains/env/python/PythonDebuggerTest.java
@@ -502,7 +502,7 @@
       @Override
       public void before() throws Exception {
         toggleBreakpoint(getScriptPath(), 9);
-        toggleBreakpoint(getScriptPath(), 13);
+        toggleBreakpoint(getScriptPath(), 15);
       }
 
       @Override
