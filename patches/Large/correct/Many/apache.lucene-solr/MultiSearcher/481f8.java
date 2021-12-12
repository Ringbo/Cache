diff --git a/src/java/org/apache/lucene/search/MultiSearcher.java b/src/java/org/apache/lucene/search/MultiSearcher.java
index aa72b07..35bb236 100644
--- a/src/java/org/apache/lucene/search/MultiSearcher.java
+++ b/src/java/org/apache/lucene/search/MultiSearcher.java
@@ -168,7 +168,7 @@
     int hi = searchables.length - 1;		  // for first element less
 						  // than n, return its index
     while (hi >= lo) {
-      int mid = (lo + hi) >> 1;
+      int mid = (lo + hi) >>> 1;
       int midValue = starts[mid];
       if (n < midValue)
 	hi = mid - 1;
