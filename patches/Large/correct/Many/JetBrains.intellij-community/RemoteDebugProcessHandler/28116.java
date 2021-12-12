diff --git a/debugger/impl/com/intellij/debugger/engine/RemoteDebugProcessHandler.java b/debugger/impl/com/intellij/debugger/engine/RemoteDebugProcessHandler.java
index 2b9c0f0..9d6b6ff 100644
--- a/debugger/impl/com/intellij/debugger/engine/RemoteDebugProcessHandler.java
+++ b/debugger/impl/com/intellij/debugger/engine/RemoteDebugProcessHandler.java
@@ -34,7 +34,7 @@
     finally {
       // in case we added our listener too late, we may have lost processDetached notification,
       // so check here if process is detached
-      if (!debugProcess.isAttached()) {
+      if (!debugProcess.isDetached()) {
         debugProcess.removeDebugProcessListener(listener);
         notifyProcessDetached();
       }
