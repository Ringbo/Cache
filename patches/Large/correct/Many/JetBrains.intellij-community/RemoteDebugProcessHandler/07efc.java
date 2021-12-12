diff --git a/debugger/impl/com/intellij/debugger/engine/RemoteDebugProcessHandler.java b/debugger/impl/com/intellij/debugger/engine/RemoteDebugProcessHandler.java
index 9d6b6ff..a9faa36 100644
--- a/debugger/impl/com/intellij/debugger/engine/RemoteDebugProcessHandler.java
+++ b/debugger/impl/com/intellij/debugger/engine/RemoteDebugProcessHandler.java
@@ -34,7 +34,7 @@
     finally {
       // in case we added our listener too late, we may have lost processDetached notification,
       // so check here if process is detached
-      if (!debugProcess.isDetached()) {
+      if (debugProcess.isDetached()) {
         debugProcess.removeDebugProcessListener(listener);
         notifyProcessDetached();
       }
