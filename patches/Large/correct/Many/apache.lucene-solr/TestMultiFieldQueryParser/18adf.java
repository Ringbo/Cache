diff --git a/src/test/org/apache/lucene/queryParser/TestMultiFieldQueryParser.java b/src/test/org/apache/lucene/queryParser/TestMultiFieldQueryParser.java
index 19e35de..da19b45 100644
--- a/src/test/org/apache/lucene/queryParser/TestMultiFieldQueryParser.java
+++ b/src/test/org/apache/lucene/queryParser/TestMultiFieldQueryParser.java
@@ -282,7 +282,7 @@
   public void testStopWordSearching() throws Exception {
     Analyzer analyzer = new StandardAnalyzer();
     Directory ramDir = new RAMDirectory();
-    IndexWriter iw =  new IndexWriter(ramDir, analyzer, true);
+    IndexWriter iw =  new IndexWriter(ramDir, analyzer, true, IndexWriter.MaxFieldLength.LIMITED);
     Document doc = new Document();
     doc.add(new Field("body", "blah the footest blah", Field.Store.NO, Field.Index.TOKENIZED));
     iw.addDocument(doc);
