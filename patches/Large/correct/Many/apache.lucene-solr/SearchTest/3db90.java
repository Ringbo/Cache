diff --git a/src/test/org/apache/lucene/SearchTest.java b/src/test/org/apache/lucene/SearchTest.java
index ea8f5f1..f1b2db0 100644
--- a/src/test/org/apache/lucene/SearchTest.java
+++ b/src/test/org/apache/lucene/SearchTest.java
@@ -31,7 +31,7 @@
     try {
       Directory directory = new RAMDirectory();  
       Analyzer analyzer = new SimpleAnalyzer();
-      IndexWriter writer = new IndexWriter(directory, analyzer, true);
+      IndexWriter writer = new IndexWriter(directory, analyzer, true, IndexWriter.MaxFieldLength.LIMITED);
 
       String[] docs = {
         "a b c d e",
