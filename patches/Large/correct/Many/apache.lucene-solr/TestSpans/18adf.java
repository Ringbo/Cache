diff --git a/src/test/org/apache/lucene/search/spans/TestSpans.java b/src/test/org/apache/lucene/search/spans/TestSpans.java
index 9791df5..fd4f8d2 100644
--- a/src/test/org/apache/lucene/search/spans/TestSpans.java
+++ b/src/test/org/apache/lucene/search/spans/TestSpans.java
@@ -38,7 +38,7 @@
   public void setUp() throws Exception {
     super.setUp();
     RAMDirectory directory = new RAMDirectory();
-    IndexWriter writer= new IndexWriter(directory, new WhitespaceAnalyzer(), true);
+    IndexWriter writer= new IndexWriter(directory, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     for (int i = 0; i < docFields.length; i++) {
       Document doc = new Document();
       doc.add(new Field(field, docFields[i], Field.Store.YES, Field.Index.TOKENIZED));
