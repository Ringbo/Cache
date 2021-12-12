diff --git a/app/src/processing/app/syntax/PdeKeywords.java b/app/src/processing/app/syntax/PdeKeywords.java
index ea7692e..2f7ce32 100644
--- a/app/src/processing/app/syntax/PdeKeywords.java
+++ b/app/src/processing/app/syntax/PdeKeywords.java
@@ -102,7 +102,7 @@
    */
   public void addColoring(String keyword, String coloring) {
     if (keywordColoring == null) {
-      keywordColoring = new KeywordMap(true);
+      keywordColoring = new KeywordMap(false);
     }
     // text will be KEYWORD or LITERAL
     boolean isKey = (coloring.charAt(0) == 'K');
