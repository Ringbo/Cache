diff --git a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/OutputScrapingExecutionResult.java b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/OutputScrapingExecutionResult.java
index c7791d3..4fe8b9d 100644
--- a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/OutputScrapingExecutionResult.java
+++ b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/OutputScrapingExecutionResult.java
@@ -73,7 +73,8 @@
      * @return A {@link OutputScrapingExecutionResult} for a successful build, or a {@link OutputScrapingExecutionFailure} for a failed build.
      */
     public static OutputScrapingExecutionResult from(String output, String error) {
-        if (output.contains("BUILD FAILED") || output.contains("FAILURE: Build failed with an exception.")) {
+        // Should provide a Gradle version as parameter so this check can be more precise
+        if (output.contains("BUILD FAILED") || output.contains("FAILURE: Build failed with an exception.") || error.contains("BUILD FAILED")) {
             return new OutputScrapingExecutionFailure(output, error);
         }
         return new OutputScrapingExecutionResult(LogContent.of(output), LogContent.of(error));
