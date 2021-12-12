diff --git a/src/test/org/apache/lucene/index/TestThreadedOptimize.java b/src/test/org/apache/lucene/index/TestThreadedOptimize.java
index 5ee7a76..089c164 100644
--- a/src/test/org/apache/lucene/index/TestThreadedOptimize.java
+++ b/src/test/org/apache/lucene/index/TestThreadedOptimize.java
@@ -53,7 +53,7 @@
 
   public void runTest(Directory directory, boolean autoCommit, MergeScheduler merger) throws Exception {
 
-    IndexWriter writer = new IndexWriter(directory, autoCommit, ANALYZER, true);
+    IndexWriter writer = new IndexWriter(directory, autoCommit, ANALYZER, true, IndexWriter.MaxFieldLength.LIMITED);
     writer.setMaxBufferedDocs(2);
     if (merger != null)
       writer.setMergeScheduler(merger);
@@ -120,7 +120,7 @@
 
       if (!autoCommit) {
         writer.close();
-        writer = new IndexWriter(directory, autoCommit, ANALYZER, false);
+        writer = new IndexWriter(directory, autoCommit, ANALYZER, false, IndexWriter.MaxFieldLength.LIMITED);
         writer.setMaxBufferedDocs(2);
       }
 
