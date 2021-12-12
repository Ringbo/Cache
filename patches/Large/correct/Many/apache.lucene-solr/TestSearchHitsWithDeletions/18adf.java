diff --git a/src/test/org/apache/lucene/search/TestSearchHitsWithDeletions.java b/src/test/org/apache/lucene/search/TestSearchHitsWithDeletions.java
index f05b75d..8c0f221 100644
--- a/src/test/org/apache/lucene/search/TestSearchHitsWithDeletions.java
+++ b/src/test/org/apache/lucene/search/TestSearchHitsWithDeletions.java
@@ -49,7 +49,7 @@
   public void setUp() throws Exception {
     // Create an index writer.
     directory = new RAMDirectory();
-    IndexWriter writer = new IndexWriter(directory, new WhitespaceAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(directory, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     for (int i=0; i<N; i++) {
       writer.addDocument(createDocument(i));
     }
