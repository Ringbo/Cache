diff --git a/python/src/com/jetbrains/python/debugger/PyDebugProcess.java b/python/src/com/jetbrains/python/debugger/PyDebugProcess.java
index eef512e..097c2f5 100644
--- a/python/src/com/jetbrains/python/debugger/PyDebugProcess.java
+++ b/python/src/com/jetbrains/python/debugger/PyDebugProcess.java
@@ -335,7 +335,7 @@
 
   @Override
   public void stop() {
-    myDebugger.disconnect();
+    myDebugger.close();
   }
 
   @Override
