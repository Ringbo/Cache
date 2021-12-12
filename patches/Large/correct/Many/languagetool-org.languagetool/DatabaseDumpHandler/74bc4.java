diff --git a/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/DatabaseDumpHandler.java b/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/DatabaseDumpHandler.java
index a9b10af..f8c94d6 100644
--- a/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/DatabaseDumpHandler.java
+++ b/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/DatabaseDumpHandler.java
@@ -113,7 +113,7 @@
           prepSt.setString(9, URL_PREFIX.replaceAll(LANG_MARKER, langCode) + title);
           prepSt.executeUpdate();
           errorCount++;
-          if (maxErrors > 0 && errorCount > maxErrors) {
+          if (maxErrors > 0 && errorCount >= maxErrors) {
             throw new ErrorLimitReachedException(maxErrors);
           }
         }
