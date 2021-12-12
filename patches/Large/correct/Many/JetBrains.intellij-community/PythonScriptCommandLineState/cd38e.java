diff --git a/python/src/com/jetbrains/python/run/PythonScriptCommandLineState.java b/python/src/com/jetbrains/python/run/PythonScriptCommandLineState.java
index 5a96c95..1bffc65 100644
--- a/python/src/com/jetbrains/python/run/PythonScriptCommandLineState.java
+++ b/python/src/com/jetbrains/python/run/PythonScriptCommandLineState.java
@@ -69,7 +69,7 @@
                                  final CommandLinePatcher... patchers) throws ExecutionException {
     if (myConfig.showCommandLineAfterwards() && !myConfig.emulateTerminal()) {
       if (executor.getId() == DefaultDebugExecutor.EXECUTOR_ID) {
-        return super.execute(executor, ArrayUtil.append(patchers, new CommandLinePatcher() {
+        return super.execute(executor, processStarter, ArrayUtil.append(patchers, new CommandLinePatcher() {
           @Override
           public void patchCommandLine(GeneralCommandLine commandLine) {
             commandLine.getParametersList().getParamsGroup(PythonCommandLineState.GROUP_DEBUGGER).addParameterAt(1, "--cmd-line");
@@ -109,7 +109,7 @@
       return new DefaultExecutionResult(executeConsole, processHandler, AnAction.EMPTY_ARRAY);
     }
     else {
-      return super.execute(executor, patchers);
+      return super.execute(executor, processStarter, patchers);
     }
   }
 
