diff --git a/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/OutputDumpHandler.java b/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/OutputDumpHandler.java
index 67be26b..b0af6b9 100644
--- a/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/OutputDumpHandler.java
+++ b/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/OutputDumpHandler.java
@@ -68,7 +68,7 @@
           System.out.println(StringTools.getContext(match.getFromPos(), match.getToPos(), text, CONTEXT_SIZE));
           i++;
           errorCount++;
-          if (maxErrors > 0 && errorCount > maxErrors) {
+          if (maxErrors > 0 && errorCount >= maxErrors) {
             throw new ErrorLimitReachedException(maxErrors);
           }
         }
