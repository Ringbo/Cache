diff --git a/src/test/org/apache/lucene/search/TestNot.java b/src/test/org/apache/lucene/search/TestNot.java
index 566345c..77a6799 100644
--- a/src/test/org/apache/lucene/search/TestNot.java
+++ b/src/test/org/apache/lucene/search/TestNot.java
@@ -38,7 +38,7 @@
 
   public void testNot() throws Exception {
     RAMDirectory store = new RAMDirectory();
-    IndexWriter writer = new IndexWriter(store, new SimpleAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(store, new SimpleAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
     Document d1 = new Document();
     d1.add(new Field("field", "a b", Field.Store.YES, Field.Index.TOKENIZED));
