diff --git a/src/test/org/apache/lucene/search/TestTimeLimitingCollector.java b/src/test/org/apache/lucene/search/TestTimeLimitingCollector.java
index 64a557d..4f4ccd1 100644
--- a/src/test/org/apache/lucene/search/TestTimeLimitingCollector.java
+++ b/src/test/org/apache/lucene/search/TestTimeLimitingCollector.java
@@ -84,7 +84,8 @@
     searcher = new IndexSearcher(directory, true);
 
     String qtxt = "one";
-    for (int i = 0; i < docText.length; i++) {
+    // start from 1, so that the 0th doc never matches
+    for (int i = 1; i < docText.length; i++) {
       qtxt += ' ' + docText[i]; // large query so that search will be longer
     }
     QueryParser queryParser = new QueryParser(Version.LUCENE_CURRENT, FIELD_NAME, new WhitespaceAnalyzer());
