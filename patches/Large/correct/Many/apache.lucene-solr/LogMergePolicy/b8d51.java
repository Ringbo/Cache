diff --git a/lucene/src/java/org/apache/lucene/index/LogMergePolicy.java b/lucene/src/java/org/apache/lucene/index/LogMergePolicy.java
index 00573b3..2224369 100644
--- a/lucene/src/java/org/apache/lucene/index/LogMergePolicy.java
+++ b/lucene/src/java/org/apache/lucene/index/LogMergePolicy.java
@@ -471,7 +471,7 @@
       // Now search backwards for the rightmost segment that
       // falls into this level:
       float levelBottom;
-      if (maxLevel < levelFloor)
+      if (maxLevel <= levelFloor)
         // All remaining segments fall into the min level
         levelBottom = -1.0F;
       else {
