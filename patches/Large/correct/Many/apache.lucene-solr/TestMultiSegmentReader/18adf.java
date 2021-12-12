diff --git a/src/test/org/apache/lucene/index/TestMultiSegmentReader.java b/src/test/org/apache/lucene/index/TestMultiSegmentReader.java
index c85d678..d35518b 100644
--- a/src/test/org/apache/lucene/index/TestMultiSegmentReader.java
+++ b/src/test/org/apache/lucene/index/TestMultiSegmentReader.java
@@ -150,7 +150,7 @@
   }
 
   private void addDoc(RAMDirectory ramDir1, String s, boolean create) throws IOException {
-    IndexWriter iw = new IndexWriter(ramDir1, new StandardAnalyzer(), create);
+    IndexWriter iw = new IndexWriter(ramDir1, new StandardAnalyzer(), create, IndexWriter.MaxFieldLength.LIMITED);
     Document doc = new Document();
     doc.add(new Field("body", s, Field.Store.YES, Field.Index.TOKENIZED));
     iw.addDocument(doc);
