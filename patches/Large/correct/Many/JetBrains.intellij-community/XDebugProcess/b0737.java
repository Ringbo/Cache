diff --git a/platform/xdebugger-api/src/com/intellij/xdebugger/XDebugProcess.java b/platform/xdebugger-api/src/com/intellij/xdebugger/XDebugProcess.java
index 20ce93f..c16a68e 100644
--- a/platform/xdebugger-api/src/com/intellij/xdebugger/XDebugProcess.java
+++ b/platform/xdebugger-api/src/com/intellij/xdebugger/XDebugProcess.java
@@ -167,7 +167,7 @@
   }
 
   @NotNull
-  public Promise<Void> stopAsync() {
+  public Promise<Object> stopAsync() {
     stop();
     return Promises.resolvedPromise();
   }
