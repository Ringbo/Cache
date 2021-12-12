diff --git a/src/test/org/apache/lucene/search/TestPhrasePrefixQuery.java b/src/test/org/apache/lucene/search/TestPhrasePrefixQuery.java
index 5d8674e..6362504 100644
--- a/src/test/org/apache/lucene/search/TestPhrasePrefixQuery.java
+++ b/src/test/org/apache/lucene/search/TestPhrasePrefixQuery.java
@@ -51,7 +51,7 @@
         throws IOException
     {
         RAMDirectory indexStore = new RAMDirectory();
-        IndexWriter writer = new IndexWriter(indexStore, new SimpleAnalyzer(), true);
+        IndexWriter writer = new IndexWriter(indexStore, new SimpleAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         Document doc1 = new Document();
         Document doc2 = new Document();
         Document doc3 = new Document();
