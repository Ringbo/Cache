diff --git a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/OutputScrapingExecutionResult.java b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/OutputScrapingExecutionResult.java
index 5d5785b..7e85677 100644
--- a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/OutputScrapingExecutionResult.java
+++ b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/OutputScrapingExecutionResult.java
@@ -51,10 +51,10 @@
     private static final String TASK_LOGGER_DEBUG_PATTERN = "(?:.*\\s+\\[LIFECYCLE\\]\\s+\\[class org\\.gradle\\.TaskExecutionLogger\\]\\s+)?";
 
     //for example: ':a SKIPPED' or ':foo:bar:baz UP-TO-DATE' but not ':a'
-    private final Pattern skippedTaskPattern = Pattern.compile(TASK_LOGGER_DEBUG_PATTERN + "(:\\S+?(:\\S+?)*)\\s+((SKIPPED)|(UP-TO-DATE)|(NO-SOURCE)|(FROM-CACHE))");
+    private final Pattern skippedTaskPattern = Pattern.compile(TASK_LOGGER_DEBUG_PATTERN + "(> Task )?(:\\S+?(:\\S+?)*)\\s+((SKIPPED)|(UP-TO-DATE)|(NO-SOURCE)|(FROM-CACHE))");
 
     //for example: ':hey' or ':a SKIPPED' or ':foo:bar:baz UP-TO-DATE' but not ':a FOO'
-    private final Pattern taskPattern = Pattern.compile(TASK_LOGGER_DEBUG_PATTERN + "(:\\S+?(:\\S+?)*)((\\s+SKIPPED)|(\\s+UP-TO-DATE)|(\\s+FROM-CACHE)|(\\s+NO-SOURCE)|(\\s+FAILED)|(\\s*))");
+    private final Pattern taskPattern = Pattern.compile(TASK_LOGGER_DEBUG_PATTERN + "(> Task )?(:\\S+?(:\\S+?)*)((\\s+SKIPPED)|(\\s+UP-TO-DATE)|(\\s+FROM-CACHE)|(\\s+NO-SOURCE)|(\\s+FAILED)|(\\s*))");
 
     private static final Pattern BUILD_RESULT_PATTERN = Pattern.compile("BUILD (SUCCESSFUL|FAILED)( \\d+[smh])+");
 
@@ -215,7 +215,7 @@
                 java.util.regex.Matcher matcher = pattern.matcher(s);
                 if (matcher.matches()) {
                     String taskStatusLine = matcher.group();
-                    String taskName = matcher.group(1);
+                    String taskName = matcher.group(2);
                     if (!taskName.contains(":buildSrc:")) {
                         // The task status line may appear twice - once for the execution, once for the UP-TO-DATE/SKIPPED/etc
                         // So don't add to the task list if this is an update to a previously added task.
