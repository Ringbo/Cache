diff --git a/src/test/org/apache/lucene/search/TestTermScorer.java b/src/test/org/apache/lucene/search/TestTermScorer.java
index 6aca86c..3ed284b 100644
--- a/src/test/org/apache/lucene/search/TestTermScorer.java
+++ b/src/test/org/apache/lucene/search/TestTermScorer.java
@@ -51,7 +51,7 @@
         directory = new RAMDirectory();
 
 
-        IndexWriter writer = new IndexWriter(directory, new WhitespaceAnalyzer(), true);
+        IndexWriter writer = new IndexWriter(directory, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         for (int i = 0; i < values.length; i++)
         {
             Document doc = new Document();
