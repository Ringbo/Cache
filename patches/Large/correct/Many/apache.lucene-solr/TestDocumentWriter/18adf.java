diff --git a/src/test/org/apache/lucene/index/TestDocumentWriter.java b/src/test/org/apache/lucene/index/TestDocumentWriter.java
index 788dc3c..418f747 100644
--- a/src/test/org/apache/lucene/index/TestDocumentWriter.java
+++ b/src/test/org/apache/lucene/index/TestDocumentWriter.java
@@ -51,7 +51,7 @@
     Document testDoc = new Document();
     DocHelper.setupDoc(testDoc);
     Analyzer analyzer = new WhitespaceAnalyzer();
-    IndexWriter writer = new IndexWriter(dir, analyzer, true);
+    IndexWriter writer = new IndexWriter(dir, analyzer, true, IndexWriter.MaxFieldLength.LIMITED);
     writer.addDocument(testDoc);
     writer.flush();
     SegmentInfo info = writer.newestSegment();
@@ -106,7 +106,7 @@
       }
     };
 
-    IndexWriter writer = new IndexWriter(dir, analyzer, true);
+    IndexWriter writer = new IndexWriter(dir, analyzer, true, IndexWriter.MaxFieldLength.LIMITED);
 
     Document doc = new Document();
     doc.add(new Field("repeated", "repeated one", Field.Store.YES, Field.Index.TOKENIZED));
@@ -166,7 +166,7 @@
       }
     };
 
-    IndexWriter writer = new IndexWriter(dir, analyzer, true);
+    IndexWriter writer = new IndexWriter(dir, analyzer, true, IndexWriter.MaxFieldLength.LIMITED);
 
     Document doc = new Document();
     doc.add(new Field("f1", "a 5 a a", Field.Store.YES, Field.Index.TOKENIZED));
@@ -191,7 +191,7 @@
 
 
   public void testPreAnalyzedField() throws IOException {
-    IndexWriter writer = new IndexWriter(dir, new SimpleAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(dir, new SimpleAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     Document doc = new Document();
     
     doc.add(new Field("preanalyzed", new TokenStream() {
@@ -246,7 +246,7 @@
     doc.add(new Field("f2", "v2", Store.YES, Index.UN_TOKENIZED, TermVector.NO));
 
     RAMDirectory ram = new RAMDirectory();
-    IndexWriter writer = new IndexWriter(ram, new StandardAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(ram, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     writer.addDocument(doc);
     writer.close();
 
