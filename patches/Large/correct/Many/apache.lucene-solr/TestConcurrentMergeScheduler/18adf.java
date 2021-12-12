diff --git a/src/test/org/apache/lucene/index/TestConcurrentMergeScheduler.java b/src/test/org/apache/lucene/index/TestConcurrentMergeScheduler.java
index 6189fdb..980496b 100644
--- a/src/test/org/apache/lucene/index/TestConcurrentMergeScheduler.java
+++ b/src/test/org/apache/lucene/index/TestConcurrentMergeScheduler.java
@@ -63,7 +63,7 @@
     FailOnlyOnFlush failure = new FailOnlyOnFlush();
     directory.failOn(failure);
 
-    IndexWriter writer = new IndexWriter(directory, ANALYZER, true);
+    IndexWriter writer = new IndexWriter(directory, ANALYZER, true, IndexWriter.MaxFieldLength.LIMITED);
     ConcurrentMergeScheduler cms = new ConcurrentMergeScheduler();
     writer.setMergeScheduler(cms);
     writer.setMaxBufferedDocs(2);
@@ -100,7 +100,7 @@
 
     RAMDirectory directory = new MockRAMDirectory();
 
-    IndexWriter writer = new IndexWriter(directory, ANALYZER, true);
+    IndexWriter writer = new IndexWriter(directory, ANALYZER, true, IndexWriter.MaxFieldLength.LIMITED);
     ConcurrentMergeScheduler cms = new ConcurrentMergeScheduler();
     writer.setMergeScheduler(cms);
 
@@ -145,7 +145,7 @@
     for(int pass=0;pass<2;pass++) {
 
       boolean autoCommit = pass==0;
-      IndexWriter writer = new IndexWriter(directory, autoCommit, ANALYZER, true);
+      IndexWriter writer = new IndexWriter(directory, autoCommit, ANALYZER, true, IndexWriter.MaxFieldLength.LIMITED);
 
       for(int iter=0;iter<7;iter++) {
         ConcurrentMergeScheduler cms = new ConcurrentMergeScheduler();
@@ -162,7 +162,7 @@
         TestIndexWriter.assertNoUnreferencedFiles(directory, "testNoExtraFiles autoCommit=" + autoCommit);
 
         // Reopen
-        writer = new IndexWriter(directory, autoCommit, ANALYZER, false);
+        writer = new IndexWriter(directory, autoCommit, ANALYZER, false, IndexWriter.MaxFieldLength.LIMITED);
       }
 
       writer.close();
@@ -180,7 +180,7 @@
 
     for(int pass=0;pass<2;pass++) {
       boolean autoCommit = pass==0;
-      IndexWriter writer = new IndexWriter(directory, autoCommit, ANALYZER, true);
+      IndexWriter writer = new IndexWriter(directory, autoCommit, ANALYZER, true, IndexWriter.MaxFieldLength.LIMITED);
 
       for(int iter=0;iter<10;iter++) {
         ConcurrentMergeScheduler cms = new ConcurrentMergeScheduler();
@@ -212,7 +212,7 @@
         reader.close();
 
         // Reopen
-        writer = new IndexWriter(directory, autoCommit, ANALYZER, false);
+        writer = new IndexWriter(directory, autoCommit, ANALYZER, false, IndexWriter.MaxFieldLength.LIMITED);
       }
       writer.close();
     }
