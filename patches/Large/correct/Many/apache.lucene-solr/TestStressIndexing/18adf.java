diff --git a/src/test/org/apache/lucene/index/TestStressIndexing.java b/src/test/org/apache/lucene/index/TestStressIndexing.java
index 0f9868e..f23ec03 100644
--- a/src/test/org/apache/lucene/index/TestStressIndexing.java
+++ b/src/test/org/apache/lucene/index/TestStressIndexing.java
@@ -118,7 +118,7 @@
     stress test.
   */
   public void runStressTest(Directory directory, boolean autoCommit, MergeScheduler mergeScheduler) throws Exception {
-    IndexWriter modifier = new IndexWriter(directory, autoCommit, ANALYZER, true);
+    IndexWriter modifier = new IndexWriter(directory, autoCommit, ANALYZER, true, IndexWriter.MaxFieldLength.LIMITED);
 
     modifier.setMaxBufferedDocs(10);
 
