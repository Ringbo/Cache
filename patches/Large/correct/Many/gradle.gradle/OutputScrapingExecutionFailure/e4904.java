diff --git a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/OutputScrapingExecutionFailure.java b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/OutputScrapingExecutionFailure.java
index f684967..ba2fab0 100644
--- a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/OutputScrapingExecutionFailure.java
+++ b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/OutputScrapingExecutionFailure.java
@@ -52,14 +52,14 @@
     public OutputScrapingExecutionFailure(String output, String error) {
         super(output, error);
 
-        java.util.regex.Matcher matcher = FAILURE_PATTERN.matcher(error);
+        java.util.regex.Matcher matcher = FAILURE_PATTERN.matcher(output);
         if (matcher.find()) {
             if (matcher.find()) {
                 throw new AssertionError("Found multiple failure sections in build error output.");
             }
         }
 
-        matcher = LOCATION_PATTERN.matcher(error);
+        matcher = LOCATION_PATTERN.matcher(output);
         if (matcher.find()) {
             fileName = matcher.group(1).trim();
             lineNumber = matcher.group(3);
@@ -68,7 +68,7 @@
             lineNumber = "";
         }
 
-        matcher = DESCRIPTION_PATTERN.matcher(error);
+        matcher = DESCRIPTION_PATTERN.matcher(output);
         if (matcher.find()) {
             String problemStr = matcher.group(1);
             Problem problem = extract(problemStr);
@@ -83,20 +83,20 @@
             description = "";
         }
 
-        matcher = RESOLUTION_PATTERN.matcher(error);
+        matcher = RESOLUTION_PATTERN.matcher(output);
         if (!matcher.find()) {
             resolution = "";
         } else {
             resolution = matcher.group(1).trim();
         }
 
-        matcher = EXCEPTION_PATTERN.matcher(error);
+        matcher = EXCEPTION_PATTERN.matcher(output);
         if (!matcher.find()) {
             exception = null;
         } else {
             String exceptionClass = matcher.group(1).trim();
             String exceptionMessage = matcher.group(2).trim();
-            matcher = EXCEPTION_CAUSE_PATTERN.matcher(error);
+            matcher = EXCEPTION_CAUSE_PATTERN.matcher(output);
             exception = recreateException(exceptionClass, exceptionMessage, matcher);
         }
     }
