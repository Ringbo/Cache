diff --git a/src/java/org/apache/lucene/index/MultiSegmentReader.java b/src/java/org/apache/lucene/index/MultiSegmentReader.java
index 80fccf1..65e9737 100644
--- a/src/java/org/apache/lucene/index/MultiSegmentReader.java
+++ b/src/java/org/apache/lucene/index/MultiSegmentReader.java
@@ -295,7 +295,7 @@
     int hi = numSubReaders - 1;                  // for first element less
 
     while (hi >= lo) {
-      int mid = (lo + hi) >> 1;
+      int mid = (lo + hi) >>> 1;
       int midValue = starts[mid];
       if (n < midValue)
         hi = mid - 1;
