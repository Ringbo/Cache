diff --git a/lucene/core/src/java/org/apache/lucene/index/TieredMergePolicy.java b/lucene/core/src/java/org/apache/lucene/index/TieredMergePolicy.java
index f1213cb..5f225c8 100644
--- a/lucene/core/src/java/org/apache/lucene/index/TieredMergePolicy.java
+++ b/lucene/core/src/java/org/apache/lucene/index/TieredMergePolicy.java
@@ -361,7 +361,7 @@
         return spec;
       }
 
-      if (eligible.size() >= allowedSegCountInt) {
+      if (eligible.size() > allowedSegCountInt) {
 
         // OK we are over budget -- find best merge!
         MergeScore bestScore = null;
