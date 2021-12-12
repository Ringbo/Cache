diff --git a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/OutputScrapingExecutionResult.java b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/OutputScrapingExecutionResult.java
index 77a1633..3febba9 100644
--- a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/OutputScrapingExecutionResult.java
+++ b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/OutputScrapingExecutionResult.java
@@ -167,7 +167,7 @@
                 java.util.regex.Matcher matcher = pattern.matcher(s);
                 if (matcher.matches()) {
                     String taskName = matcher.group(1);
-                    if (!taskName.startsWith(":buildSrc:")) {
+                    if (!taskName.contains(":buildSrc:")) {
                         //for INFO/DEBUG level the task may appear twice - once for the execution, once for the UP-TO-DATE
                         //so I'm not adding the task to the list if it is the same as previously added task.
                         if (tasks.size() == 0 || !tasks.getLast().equals(taskName)) {
