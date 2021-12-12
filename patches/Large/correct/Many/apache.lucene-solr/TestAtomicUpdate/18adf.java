diff --git a/src/test/org/apache/lucene/index/TestAtomicUpdate.java b/src/test/org/apache/lucene/index/TestAtomicUpdate.java
index f6a698c..27db24c 100644
--- a/src/test/org/apache/lucene/index/TestAtomicUpdate.java
+++ b/src/test/org/apache/lucene/index/TestAtomicUpdate.java
@@ -118,7 +118,7 @@
 
     TimedThread[] threads = new TimedThread[4];
 
-    IndexWriter writer = new IndexWriter(directory, ANALYZER, true);
+    IndexWriter writer = new IndexWriter(directory, ANALYZER, true, IndexWriter.MaxFieldLength.LIMITED);
 
     // Establish a base index of 100 docs:
     for(int i=0;i<100;i++) {
