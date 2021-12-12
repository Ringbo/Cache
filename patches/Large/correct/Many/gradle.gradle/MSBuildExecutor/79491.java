diff --git a/subprojects/ide-native/src/integTest/groovy/org/gradle/ide/visualstudio/fixtures/MSBuildExecutor.java b/subprojects/ide-native/src/integTest/groovy/org/gradle/ide/visualstudio/fixtures/MSBuildExecutor.java
index 33af08a..8d3e68c 100644
--- a/subprojects/ide-native/src/integTest/groovy/org/gradle/ide/visualstudio/fixtures/MSBuildExecutor.java
+++ b/subprojects/ide-native/src/integTest/groovy/org/gradle/ide/visualstudio/fixtures/MSBuildExecutor.java
@@ -108,7 +108,7 @@
                 output = "";
             } else {
                 results.add(OutputScrapingExecutionResult.from(output.substring(0, next), error));
-                output = output.substring(first + SEPARATOR.length());
+                output = output.substring(next + SEPARATOR.length());
             }
             error = "";
         }
