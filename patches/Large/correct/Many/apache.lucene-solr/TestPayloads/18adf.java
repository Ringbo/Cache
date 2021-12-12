diff --git a/src/test/org/apache/lucene/index/TestPayloads.java b/src/test/org/apache/lucene/index/TestPayloads.java
index 6b21388..f0f4969 100644
--- a/src/test/org/apache/lucene/index/TestPayloads.java
+++ b/src/test/org/apache/lucene/index/TestPayloads.java
@@ -95,7 +95,7 @@
     public void testPayloadFieldBit() throws Exception {
         Directory ram = new RAMDirectory();
         PayloadAnalyzer analyzer = new PayloadAnalyzer();
-        IndexWriter writer = new IndexWriter(ram, analyzer, true);
+        IndexWriter writer = new IndexWriter(ram, analyzer, true, IndexWriter.MaxFieldLength.LIMITED);
         Document d = new Document();
         // this field won't have any payloads
         d.add(new Field("f1", "This field has no payloads", Field.Store.NO, Field.Index.TOKENIZED));
@@ -123,7 +123,7 @@
         
         // now we add another document which has payloads for field f3 and verify if the SegmentMerger
         // enabled payloads for that field
-        writer = new IndexWriter(ram, analyzer, true);
+        writer = new IndexWriter(ram, analyzer, true, IndexWriter.MaxFieldLength.LIMITED);
         d = new Document();
         d.add(new Field("f1", "This field has no payloads", Field.Store.NO, Field.Index.TOKENIZED));
         d.add(new Field("f2", "This field has payloads in all docs", Field.Store.NO, Field.Index.TOKENIZED));
@@ -164,7 +164,7 @@
     // different tests to verify the payload encoding
     private void performTest(Directory dir) throws Exception {
         PayloadAnalyzer analyzer = new PayloadAnalyzer();
-        IndexWriter writer = new IndexWriter(dir, analyzer, true);
+        IndexWriter writer = new IndexWriter(dir, analyzer, true, IndexWriter.MaxFieldLength.LIMITED);
         
         // should be in sync with value in TermInfosWriter
         final int skipInterval = 16;
@@ -301,7 +301,7 @@
         
         // test long payload
         analyzer = new PayloadAnalyzer();
-        writer = new IndexWriter(dir, analyzer, true);
+        writer = new IndexWriter(dir, analyzer, true, IndexWriter.MaxFieldLength.LIMITED);
         String singleTerm = "lucene";
         
         d = new Document();
@@ -474,7 +474,7 @@
         final ByteArrayPool pool = new ByteArrayPool(numThreads, 5);
         
         Directory dir = new RAMDirectory();
-        final IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer());
+        final IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
         final String field = "test";
         
         Thread[] ingesters = new Thread[numThreads];
