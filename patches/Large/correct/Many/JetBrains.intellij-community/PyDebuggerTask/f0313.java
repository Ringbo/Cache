diff --git a/python/testSrc/com/jetbrains/env/python/debug/PyDebuggerTask.java b/python/testSrc/com/jetbrains/env/python/debug/PyDebuggerTask.java
index 5159cf1..65b4cdc 100644
--- a/python/testSrc/com/jetbrains/env/python/debug/PyDebuggerTask.java
+++ b/python/testSrc/com/jetbrains/env/python/debug/PyDebuggerTask.java
@@ -104,7 +104,7 @@
       @Override
       protected void run(Result<ExecutionResult> result) throws Throwable {
         final ExecutionResult res =
-          pyState.execute(executor, PyDebugRunner.createCommandLinePatchers(pyState, profile, serverLocalPort));
+          pyState.execute(executor, PyDebugRunner.createCommandLinePatchers(myFixture.getProject(), pyState, profile, serverLocalPort));
 
         mySession = XDebuggerManager.getInstance(getProject()).
           startSession(runner, env, env.getContentToReuse(), new XDebugProcessStarter() {
