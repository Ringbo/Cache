diff --git a/lucene/core/src/java/org/apache/lucene/index/TieredMergePolicy.java b/lucene/core/src/java/org/apache/lucene/index/TieredMergePolicy.java
index 7f917bb..c60f578 100644
--- a/lucene/core/src/java/org/apache/lucene/index/TieredMergePolicy.java
+++ b/lucene/core/src/java/org/apache/lucene/index/TieredMergePolicy.java
@@ -192,7 +192,7 @@
    *
    * @see #setMaxMergedSegmentMB */
   public double getMaxMergedSegmentMB() {
-    return maxMergedSegmentBytes/1024/1024.;
+    return maxMergedSegmentBytes/1024.0/1024.0;
   }
 
   /** Controls how aggressively merges that reclaim more
