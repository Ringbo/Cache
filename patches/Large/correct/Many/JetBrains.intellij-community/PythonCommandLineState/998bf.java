diff --git a/python/src/com/jetbrains/python/run/PythonCommandLineState.java b/python/src/com/jetbrains/python/run/PythonCommandLineState.java
index f326c05..17fda94 100644
--- a/python/src/com/jetbrains/python/run/PythonCommandLineState.java
+++ b/python/src/com/jetbrains/python/run/PythonCommandLineState.java
@@ -141,7 +141,7 @@
   protected void addTracebackFilter(Project project, ConsoleView consoleView, ProcessHandler processHandler) {
     if (PySdkUtil.isRemote(myConfig.getSdk())) {
       assert processHandler instanceof RemoteProcessHandlerBase;
-      consoleView.addMessageFilter(new PyRemoteTracebackFilter(project, (RemoteProcessHandlerBase) processHandler));
+      consoleView.addMessageFilter(new PyRemoteTracebackFilter(project, null, (RemoteProcessHandlerBase) processHandler));
     }
     else {
       consoleView.addMessageFilter(new PythonTracebackFilter(project, myConfig.getWorkingDirectory()));
