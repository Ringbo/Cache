diff --git a/debugger/impl/com/intellij/debugger/impl/DebuggerManagerImpl.java b/debugger/impl/com/intellij/debugger/impl/DebuggerManagerImpl.java
index 54ae84d..c5a2163 100644
--- a/debugger/impl/com/intellij/debugger/impl/DebuggerManagerImpl.java
+++ b/debugger/impl/com/intellij/debugger/impl/DebuggerManagerImpl.java
@@ -209,7 +209,7 @@
       // so we shouldn't add the listener to avoid calling stop() twice
       processHandler.addProcessListener(new ProcessAdapter() {
         public void processWillTerminate(ProcessEvent event, boolean willBeDestroyed) {
-          if (ApplicationManager.getApplication().isUnitTestMode()) {
+          if (!willBeDestroyed || ApplicationManager.getApplication().isUnitTestMode()) {
             final DebugProcessImpl debugProcess = getDebugProcess(event.getProcessHandler());
             if (debugProcess != null) {
               // if current thread is a "debugger manager thread", stop will execute synchronously
