diff --git a/src/test/org/apache/lucene/search/TestBoolean2.java b/src/test/org/apache/lucene/search/TestBoolean2.java
index 9ea6205..8ed71e7 100644
--- a/src/test/org/apache/lucene/search/TestBoolean2.java
+++ b/src/test/org/apache/lucene/search/TestBoolean2.java
@@ -46,7 +46,7 @@
   public void setUp() throws Exception {
     super.setUp();
     RAMDirectory directory = new RAMDirectory();
-    IndexWriter writer= new IndexWriter(directory, new WhitespaceAnalyzer(), true);
+    IndexWriter writer= new IndexWriter(directory, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     for (int i = 0; i < docFields.length; i++) {
       Document doc = new Document();
       doc.add(new Field(field, docFields[i], Field.Store.NO, Field.Index.TOKENIZED));
