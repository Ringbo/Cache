diff --git a/src/test/org/apache/lucene/search/TestSetNorm.java b/src/test/org/apache/lucene/search/TestSetNorm.java
index 604f516..5725d04 100644
--- a/src/test/org/apache/lucene/search/TestSetNorm.java
+++ b/src/test/org/apache/lucene/search/TestSetNorm.java
@@ -37,7 +37,7 @@
 
   public void testSetNorm() throws Exception {
     RAMDirectory store = new RAMDirectory();
-    IndexWriter writer = new IndexWriter(store, new SimpleAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(store, new SimpleAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
     // add the same document four times
     Fieldable f1 = new Field("field", "word", Field.Store.YES, Field.Index.TOKENIZED);
