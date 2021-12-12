diff --git a/src/com/goide/runconfig/testing/GoTestRunningState.java b/src/com/goide/runconfig/testing/GoTestRunningState.java
index d779ebc..e1aa1e6 100644
--- a/src/com/goide/runconfig/testing/GoTestRunningState.java
+++ b/src/com/goide/runconfig/testing/GoTestRunningState.java
@@ -56,7 +56,7 @@
     consoleView.addMessageFilter(new GoTestConsoleFilter(myModule, myConfiguration.getWorkingDirectory()));
 
     DefaultExecutionResult executionResult = new DefaultExecutionResult(consoleView, processHandler);
-    executionResult.setRestartActions(new ToggleAutoTestAction());
+    executionResult.setRestartActions(new ToggleAutoTestAction(getEnvironment()));
     return executionResult;
   }
 
