diff --git a/src/com/goide/runconfig/GoRunningState.java b/src/com/goide/runconfig/GoRunningState.java
index 464c9e6..b9185fa 100644
--- a/src/com/goide/runconfig/GoRunningState.java
+++ b/src/com/goide/runconfig/GoRunningState.java
@@ -49,7 +49,7 @@
   protected ProcessHandler startProcess() throws ExecutionException {
     GoExecutor executor = patchExecutor(createCommonExecutor());
     GeneralCommandLine commandLine = executor.withParameterString(myConfiguration.getParams()).createCommandLine();
-    KillableColoredProcessHandler handler = new KillableColoredProcessHandler(commandLine);
+    KillableColoredProcessHandler handler = new KillableColoredProcessHandler(commandLine, true);
     ProcessTerminatedListener.attach(handler);
     return handler;
   }
