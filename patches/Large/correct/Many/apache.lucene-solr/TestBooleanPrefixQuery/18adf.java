diff --git a/src/test/org/apache/lucene/search/TestBooleanPrefixQuery.java b/src/test/org/apache/lucene/search/TestBooleanPrefixQuery.java
index ae3bbaa..7bd1a27 100644
--- a/src/test/org/apache/lucene/search/TestBooleanPrefixQuery.java
+++ b/src/test/org/apache/lucene/search/TestBooleanPrefixQuery.java
@@ -65,7 +65,7 @@
     Query rw2 = null;
     try {
       IndexWriter writer = new IndexWriter(directory, new
-                                           WhitespaceAnalyzer(), true);
+                                           WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       for (int i = 0; i < categories.length; i++) {
         Document doc = new Document();
         doc.add(new Field("category", categories[i], Field.Store.YES, Field.Index.UN_TOKENIZED));
