diff --git a/src/test/org/apache/lucene/search/spans/TestSpansAdvanced.java b/src/test/org/apache/lucene/search/spans/TestSpansAdvanced.java
index a93e4d2..1c63959 100644
--- a/src/test/org/apache/lucene/search/spans/TestSpansAdvanced.java
+++ b/src/test/org/apache/lucene/search/spans/TestSpansAdvanced.java
@@ -56,7 +56,7 @@
 
         // create test index
         mDirectory = new RAMDirectory();
-        final IndexWriter writer = new IndexWriter(mDirectory, new StandardAnalyzer(), true);
+        final IndexWriter writer = new IndexWriter(mDirectory, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         addDocument(writer, "1", "I think it should work.");
         addDocument(writer, "2", "I think it should work.");
         addDocument(writer, "3", "I think it should work.");
