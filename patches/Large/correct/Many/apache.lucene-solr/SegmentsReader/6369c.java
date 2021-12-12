diff --git a/src/java/org/apache/lucene/index/SegmentsReader.java b/src/java/org/apache/lucene/index/SegmentsReader.java
index 4ab2197..607641a 100644
--- a/src/java/org/apache/lucene/index/SegmentsReader.java
+++ b/src/java/org/apache/lucene/index/SegmentsReader.java
@@ -77,7 +77,7 @@
     starts[readers.length] = maxDoc;
   }
 
-  public final int numDocs() {
+  public synchronized final int numDocs() {
     if (numDocs == -1) {			  // check cache
       int n = 0;				  // cache miss--recompute
       for (int i = 0; i < readers.length; i++)
@@ -101,7 +101,7 @@
     return readers[i].isDeleted(n - starts[i]);	  // dispatch to segment reader
   }
 
-  public final void delete(int n) throws IOException {
+  public synchronized final void delete(int n) throws IOException {
     numDocs = -1;				  // invalidate cache
     int i = readerIndex(n);			  // find segment num
     readers[i].delete(n - starts[i]);		  // dispatch to segment reader
