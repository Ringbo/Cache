diff --git a/src/test/org/apache/lucene/search/TestPrefixQuery.java b/src/test/org/apache/lucene/search/TestPrefixQuery.java
index 54ec827..2d79891 100644
--- a/src/test/org/apache/lucene/search/TestPrefixQuery.java
+++ b/src/test/org/apache/lucene/search/TestPrefixQuery.java
@@ -37,7 +37,7 @@
     String[] categories = new String[] {"/Computers",
                                         "/Computers/Mac",
                                         "/Computers/Windows"};
-    IndexWriter writer = new IndexWriter(directory, new WhitespaceAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(directory, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     for (int i = 0; i < categories.length; i++) {
       Document doc = new Document();
       doc.add(new Field("category", categories[i], Field.Store.YES, Field.Index.UN_TOKENIZED));
