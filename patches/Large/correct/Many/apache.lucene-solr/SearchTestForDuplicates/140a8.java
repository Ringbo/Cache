diff --git a/src/test/org/apache/lucene/SearchTestForDuplicates.java b/src/test/org/apache/lucene/SearchTestForDuplicates.java
index 44602ea..557ebb5 100644
--- a/src/test/org/apache/lucene/SearchTestForDuplicates.java
+++ b/src/test/org/apache/lucene/SearchTestForDuplicates.java
@@ -38,7 +38,7 @@
     try {
       Directory directory = new RAMDirectory();
       Analyzer analyzer = new SimpleAnalyzer();
-      IndexWriter writer = new IndexWriter(directory, analyzer, true);
+      IndexWriter writer = new IndexWriter(directory, analyzer, true, IndexWriter.MaxFieldLength.LIMITED);
 
       final int MAX_DOCS = 225;
 
