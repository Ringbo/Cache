diff --git a/src/test/org/apache/lucene/search/TestWildcard.java b/src/test/org/apache/lucene/search/TestWildcard.java
index ecc2be4..43cd1e9 100644
--- a/src/test/org/apache/lucene/search/TestWildcard.java
+++ b/src/test/org/apache/lucene/search/TestWildcard.java
@@ -139,7 +139,7 @@
   private RAMDirectory getIndexStore(String field, String[] contents)
       throws IOException {
     RAMDirectory indexStore = new RAMDirectory();
-    IndexWriter writer = new IndexWriter(indexStore, new SimpleAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(indexStore, new SimpleAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     for (int i = 0; i < contents.length; ++i) {
       Document doc = new Document();
       doc.add(new Field(field, contents[i], Field.Store.YES, Field.Index.TOKENIZED));
@@ -197,7 +197,7 @@
 
     // prepare the index
     RAMDirectory dir = new RAMDirectory();
-    IndexWriter iw = new IndexWriter(dir, new WhitespaceAnalyzer());
+    IndexWriter iw = new IndexWriter(dir, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
     for (int i = 0; i < docs.length; i++) {
       Document doc = new Document();
       doc.add(new Field(field,docs[i],Store.NO,Index.TOKENIZED));
