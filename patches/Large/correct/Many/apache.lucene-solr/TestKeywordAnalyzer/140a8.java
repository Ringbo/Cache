diff --git a/src/test/org/apache/lucene/analysis/TestKeywordAnalyzer.java b/src/test/org/apache/lucene/analysis/TestKeywordAnalyzer.java
index cfa552b..e225d87 100644
--- a/src/test/org/apache/lucene/analysis/TestKeywordAnalyzer.java
+++ b/src/test/org/apache/lucene/analysis/TestKeywordAnalyzer.java
@@ -40,7 +40,7 @@
     directory = new RAMDirectory();
     IndexWriter writer = new IndexWriter(directory,
                                          new SimpleAnalyzer(),
-                                         true);
+                                         true, IndexWriter.MaxFieldLength.LIMITED);
 
     Document doc = new Document();
     doc.add(new Field("partnum", "Q36", Field.Store.YES, Field.Index.UN_TOKENIZED));
@@ -67,7 +67,7 @@
 
   public void testMutipleDocument() throws Exception {
     RAMDirectory dir = new RAMDirectory();
-    IndexWriter writer = new IndexWriter(dir,new KeywordAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(dir,new KeywordAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     Document doc = new Document();
     doc.add(new Field("partnum", "Q36", Field.Store.YES, Field.Index.TOKENIZED));
     writer.addDocument(doc);
