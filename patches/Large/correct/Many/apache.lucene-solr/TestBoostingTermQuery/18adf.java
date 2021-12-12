diff --git a/src/test/org/apache/lucene/search/payloads/TestBoostingTermQuery.java b/src/test/org/apache/lucene/search/payloads/TestBoostingTermQuery.java
index 47dafec..93b5c63 100644
--- a/src/test/org/apache/lucene/search/payloads/TestBoostingTermQuery.java
+++ b/src/test/org/apache/lucene/search/payloads/TestBoostingTermQuery.java
@@ -86,7 +86,7 @@
     RAMDirectory directory = new RAMDirectory();
     PayloadAnalyzer analyzer = new PayloadAnalyzer();
     IndexWriter writer
-            = new IndexWriter(directory, analyzer, true);
+            = new IndexWriter(directory, analyzer, true, IndexWriter.MaxFieldLength.LIMITED);
     writer.setSimilarity(similarity);
     //writer.infoStream = System.out;
     for (int i = 0; i < 1000; i++) {
