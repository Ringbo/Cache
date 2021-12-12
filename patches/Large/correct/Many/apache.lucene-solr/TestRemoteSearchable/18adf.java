diff --git a/src/test/org/apache/lucene/search/TestRemoteSearchable.java b/src/test/org/apache/lucene/search/TestRemoteSearchable.java
index d1e0f2b..8c35d1f 100644
--- a/src/test/org/apache/lucene/search/TestRemoteSearchable.java
+++ b/src/test/org/apache/lucene/search/TestRemoteSearchable.java
@@ -54,7 +54,7 @@
   private static void startServer() throws Exception {
     // construct an index
     RAMDirectory indexStore = new RAMDirectory();
-    IndexWriter writer = new IndexWriter(indexStore,new SimpleAnalyzer(),true);
+    IndexWriter writer = new IndexWriter(indexStore,new SimpleAnalyzer(),true, IndexWriter.MaxFieldLength.LIMITED);
     Document doc = new Document();
     doc.add(new Field("test", "test text", Field.Store.YES, Field.Index.TOKENIZED));
     doc.add(new Field("other", "other test text", Field.Store.YES, Field.Index.TOKENIZED));
