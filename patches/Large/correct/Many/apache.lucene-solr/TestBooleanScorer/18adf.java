diff --git a/src/test/org/apache/lucene/search/TestBooleanScorer.java b/src/test/org/apache/lucene/search/TestBooleanScorer.java
index 479f70c..6b1246a 100644
--- a/src/test/org/apache/lucene/search/TestBooleanScorer.java
+++ b/src/test/org/apache/lucene/search/TestBooleanScorer.java
@@ -47,7 +47,7 @@
     String[] values = new String[] { "1", "2", "3", "4" };
 
     try {
-      IndexWriter writer = new IndexWriter(directory, new WhitespaceAnalyzer(), true);
+      IndexWriter writer = new IndexWriter(directory, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       for (int i = 0; i < values.length; i++) {
         Document doc = new Document();
         doc.add(new Field(FIELD, values[i], Field.Store.YES, Field.Index.UN_TOKENIZED));
