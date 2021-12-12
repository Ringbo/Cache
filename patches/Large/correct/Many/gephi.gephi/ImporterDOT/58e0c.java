diff --git a/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/file/ImporterDOT.java b/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/file/ImporterDOT.java
index c6a9dd2..4507381 100644
--- a/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/file/ImporterDOT.java
+++ b/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/file/ImporterDOT.java
@@ -229,7 +229,7 @@
 
         if (streamTokenizer.ttype == ']' || streamTokenizer.ttype == StreamTokenizer.TT_EOF) {
             return;
-        } else if (streamTokenizer.ttype == StreamTokenizer.TT_WORD) {
+        } else if (streamTokenizer.ttype == StreamTokenizer.TT_WORD || streamTokenizer.ttype == '"') {
 
             if (streamTokenizer.sval.equalsIgnoreCase("label")) {
                 streamTokenizer.nextToken();
@@ -367,7 +367,7 @@
 
         if (streamTokenizer.ttype == ']' || streamTokenizer.ttype == StreamTokenizer.TT_EOF) {
             return;
-        } else if (streamTokenizer.ttype == StreamTokenizer.TT_WORD) {
+        } else if (streamTokenizer.ttype == StreamTokenizer.TT_WORD || streamTokenizer.ttype == '"') {
             if (streamTokenizer.sval.equalsIgnoreCase("label")) {
                 streamTokenizer.nextToken();
                 if (streamTokenizer.ttype == '=') {
