diff --git a/src/test/org/apache/lucene/index/TestLazyProxSkipping.java b/src/test/org/apache/lucene/index/TestLazyProxSkipping.java
index 229241b..0b46b9c 100755
--- a/src/test/org/apache/lucene/index/TestLazyProxSkipping.java
+++ b/src/test/org/apache/lucene/index/TestLazyProxSkipping.java
@@ -49,7 +49,7 @@
         int numDocs = 500;
         
         Directory directory = new RAMDirectory();
-        IndexWriter writer = new IndexWriter(directory, new WhitespaceAnalyzer(), true);
+        IndexWriter writer = new IndexWriter(directory, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         writer.setMaxBufferedDocs(10);
         for (int i = 0; i < numDocs; i++) {
             Document doc = new Document();
@@ -109,7 +109,7 @@
     
     public void testSeek() throws IOException {
         Directory directory = new RAMDirectory();
-        IndexWriter writer = new IndexWriter(directory, new WhitespaceAnalyzer(), true);
+        IndexWriter writer = new IndexWriter(directory, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         for (int i = 0; i < 10; i++) {
             Document doc = new Document();
             doc.add(new Field(this.field, "a b", Field.Store.YES, Field.Index.TOKENIZED));
