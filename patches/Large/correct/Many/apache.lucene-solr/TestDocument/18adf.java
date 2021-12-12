diff --git a/src/test/org/apache/lucene/document/TestDocument.java b/src/test/org/apache/lucene/document/TestDocument.java
index ef1d85e..95073cc 100644
--- a/src/test/org/apache/lucene/document/TestDocument.java
+++ b/src/test/org/apache/lucene/document/TestDocument.java
@@ -160,7 +160,7 @@
     public void testGetValuesForIndexedDocument() throws Exception
     {
         RAMDirectory dir = new RAMDirectory();
-        IndexWriter writer = new IndexWriter(dir, new StandardAnalyzer(), true);
+        IndexWriter writer = new IndexWriter(dir, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         writer.addDocument(makeDocumentWithFields());
         writer.close();
 
@@ -231,7 +231,7 @@
       doc.add(new Field("keyword", "test", Field.Store.YES, Field.Index.UN_TOKENIZED));
 
       RAMDirectory dir = new RAMDirectory();
-      IndexWriter writer = new IndexWriter(dir, new StandardAnalyzer(), true);
+      IndexWriter writer = new IndexWriter(dir, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       writer.addDocument(doc);
       field.setValue("id2");
       writer.addDocument(doc);
