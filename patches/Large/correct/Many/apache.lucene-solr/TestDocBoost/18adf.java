diff --git a/src/test/org/apache/lucene/search/TestDocBoost.java b/src/test/org/apache/lucene/search/TestDocBoost.java
index f2b3705..40c7617 100644
--- a/src/test/org/apache/lucene/search/TestDocBoost.java
+++ b/src/test/org/apache/lucene/search/TestDocBoost.java
@@ -36,7 +36,7 @@
 
   public void testDocBoost() throws Exception {
     RAMDirectory store = new RAMDirectory();
-    IndexWriter writer = new IndexWriter(store, new SimpleAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(store, new SimpleAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
     Fieldable f1 = new Field("field", "word", Field.Store.YES, Field.Index.TOKENIZED);
     Fieldable f2 = new Field("field", "word", Field.Store.YES, Field.Index.TOKENIZED);
