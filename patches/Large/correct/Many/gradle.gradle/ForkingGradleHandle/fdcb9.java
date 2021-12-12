diff --git a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/ForkingGradleHandle.java b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/ForkingGradleHandle.java
index eabc876..10b22e9 100644
--- a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/ForkingGradleHandle.java
+++ b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/ForkingGradleHandle.java
@@ -167,7 +167,7 @@
         String error = getErrorOutput();
 
         boolean didFail = execResult.getExitValue() != 0;
-        ExecutionResult executionResult = expectFailure ? toExecutionFailure(output, error) : toExecutionResult(output, error);
+        ExecutionResult executionResult = didFail ? toExecutionFailure(output, error) : toExecutionResult(output, error);
         if (didFail != expectFailure) {
             String message = String.format("Gradle execution %s in %s with: %s %s%nOutput:%n%s%n-----%nError:%n%s%n-----%nExecution result:%n%s%n-----%n",
                 expectFailure ? "did not fail" : "failed", execHandle.getDirectory(), execHandle.getCommand(), execHandle.getArguments(), output, error, execResult.toString());
