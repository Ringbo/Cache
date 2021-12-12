diff --git a/src/java/org/apache/lucene/index/SegmentsReader.java b/src/java/org/apache/lucene/index/SegmentsReader.java
index f05a792..c273e65 100644
--- a/src/java/org/apache/lucene/index/SegmentsReader.java
+++ b/src/java/org/apache/lucene/index/SegmentsReader.java
@@ -105,7 +105,7 @@
   synchronized final void doDelete(int n) throws IOException {
     numDocs = -1;				  // invalidate cache
     int i = readerIndex(n);			  // find segment num
-    readers[i].delete(n - starts[i]);		  // dispatch to segment reader
+    readers[i].doDelete(n - starts[i]);		  // dispatch to segment reader
   }
 
   private final int readerIndex(int n) {	  // find reader for doc n:
