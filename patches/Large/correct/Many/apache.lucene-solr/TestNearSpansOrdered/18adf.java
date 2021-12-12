diff --git a/src/test/org/apache/lucene/search/spans/TestNearSpansOrdered.java b/src/test/org/apache/lucene/search/spans/TestNearSpansOrdered.java
index fd5890e..5c560b0 100644
--- a/src/test/org/apache/lucene/search/spans/TestNearSpansOrdered.java
+++ b/src/test/org/apache/lucene/search/spans/TestNearSpansOrdered.java
@@ -51,7 +51,7 @@
   public void setUp() throws Exception {
     super.setUp();
     RAMDirectory directory = new RAMDirectory();
-    IndexWriter writer= new IndexWriter(directory, new WhitespaceAnalyzer(), true);
+    IndexWriter writer= new IndexWriter(directory, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     for (int i = 0; i < docFields.length; i++) {
       Document doc = new Document();
       doc.add(new Field(FIELD, docFields[i], Field.Store.NO, Field.Index.TOKENIZED));
