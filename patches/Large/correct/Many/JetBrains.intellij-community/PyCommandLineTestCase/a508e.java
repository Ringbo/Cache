diff --git a/python/testSrc/com/jetbrains/python/fixtures/PyCommandLineTestCase.java b/python/testSrc/com/jetbrains/python/fixtures/PyCommandLineTestCase.java
index f5485aa..b0c5401 100644
--- a/python/testSrc/com/jetbrains/python/fixtures/PyCommandLineTestCase.java
+++ b/python/testSrc/com/jetbrains/python/fixtures/PyCommandLineTestCase.java
@@ -56,7 +56,7 @@
       final PythonCommandLineState state = (PythonCommandLineState)configuration.getState(executor, new ExecutionEnvironment());
       PyDebugRunner debugRunner = (PyDebugRunner)RunnerRegistry.getInstance().findRunnerById(PyDebugRunner.PY_DEBUG_RUNNER);
       final GeneralCommandLine generalCommandLine =
-        state.generateCommandLine(debugRunner.createCommandLinePatchers(state, configuration, PORT));
+        state.generateCommandLine(PyDebugRunner.createCommandLinePatchers(state, configuration, PORT));
       return generalCommandLine.getParametersList().getList();
     }
     catch (ExecutionException e) {
