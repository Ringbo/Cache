diff --git a/src/java/org/apache/lucene/index/MergeDocIDRemapper.java b/src/java/org/apache/lucene/index/MergeDocIDRemapper.java
index cbbde20..86b6901 100644
--- a/src/java/org/apache/lucene/index/MergeDocIDRemapper.java
+++ b/src/java/org/apache/lucene/index/MergeDocIDRemapper.java
@@ -85,7 +85,7 @@
       int hi = docMaps.length - 1;                  // for first element less
 
       while (hi >= lo) {
-        int mid = (lo + hi) >> 1;
+        int mid = (lo + hi) >>> 1;
         int midValue = starts[mid];
         if (oldDocID < midValue)
           hi = mid - 1;
