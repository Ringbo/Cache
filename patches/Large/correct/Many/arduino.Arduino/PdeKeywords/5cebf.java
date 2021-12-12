diff --git a/app/src/processing/app/syntax/PdeKeywords.java b/app/src/processing/app/syntax/PdeKeywords.java
index 3f3016d..2edc312 100644
--- a/app/src/processing/app/syntax/PdeKeywords.java
+++ b/app/src/processing/app/syntax/PdeKeywords.java
@@ -98,7 +98,7 @@
         //String htmlFilename = second.substring(tab + 1).trim();
         String coloring = pieces[1].trim();
 
-        if (coloring.length() > 0) {
+        if (coloring.length() > 0 && Character.isDigit(coloring.charAt(coloring.length() - 1))) {
           // text will be KEYWORD or LITERAL
           boolean isKey = (coloring.charAt(0) == 'K');
           // KEYWORD1 -> 0, KEYWORD2 -> 1, etc
