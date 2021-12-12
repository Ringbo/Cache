diff --git a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/ForkingGradleHandle.java b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/ForkingGradleHandle.java
index 68a7d33..eabc876 100644
--- a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/ForkingGradleHandle.java
+++ b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/ForkingGradleHandle.java
@@ -171,7 +171,7 @@
         if (didFail != expectFailure) {
             String message = String.format("Gradle execution %s in %s with: %s %s%nOutput:%n%s%n-----%nError:%n%s%n-----%nExecution result:%n%s%n-----%n",
                 expectFailure ? "did not fail" : "failed", execHandle.getDirectory(), execHandle.getCommand(), execHandle.getArguments(), output, error, execResult.toString());
-            Exception exception = executionResult instanceof OutputScrapingExecutionFailure ? ((OutputScrapingExecutionFailure) execResult).getException() : null;
+            Exception exception = executionResult instanceof OutputScrapingExecutionFailure ? ((OutputScrapingExecutionFailure) executionResult).getException() : null;
             throw exception == null ? new UnexpectedBuildFailure(message) : new UnexpectedBuildFailure(message, exception);
         }
 
