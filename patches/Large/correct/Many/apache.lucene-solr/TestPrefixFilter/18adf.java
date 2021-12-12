diff --git a/src/test/org/apache/lucene/search/TestPrefixFilter.java b/src/test/org/apache/lucene/search/TestPrefixFilter.java
index e2dd60a..cb93c8b 100644
--- a/src/test/org/apache/lucene/search/TestPrefixFilter.java
+++ b/src/test/org/apache/lucene/search/TestPrefixFilter.java
@@ -39,7 +39,7 @@
                                         "/Computers/Mac/One",
                                         "/Computers/Mac/Two",
                                         "/Computers/Windows"};
-    IndexWriter writer = new IndexWriter(directory, new WhitespaceAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(directory, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     for (int i = 0; i < categories.length; i++) {
       Document doc = new Document();
       doc.add(new Field("category", categories[i], Field.Store.YES, Field.Index.UN_TOKENIZED));
