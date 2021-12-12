diff --git a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/ForkingGradleHandle.java b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/ForkingGradleHandle.java
index 0d650b7..813a333 100644
--- a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/ForkingGradleHandle.java
+++ b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/ForkingGradleHandle.java
@@ -194,7 +194,7 @@
         
         // Exit value is unreliable for determination of process failure.
         // On rare occasions, exitValue == 0 when the process is expected to fail, and the error output indicates failure.
-        boolean buildFailed = execResult.getExitValue() != 0 || OutputScrapingExecutionFailure.hasFailure(error);
+        boolean buildFailed = execResult.getExitValue() != 0 || OutputScrapingExecutionFailure.hasFailure(output);
         ExecutionResult executionResult = buildFailed ? toExecutionFailure(output, error) : toExecutionResult(output, error);
 
         if (expectFailure && !buildFailed) {
