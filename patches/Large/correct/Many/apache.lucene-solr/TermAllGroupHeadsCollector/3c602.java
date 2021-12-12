diff --git a/modules/grouping/src/java/org/apache/lucene/search/grouping/TermAllGroupHeadsCollector.java b/modules/grouping/src/java/org/apache/lucene/search/grouping/TermAllGroupHeadsCollector.java
index edad23c..50067d5 100644
--- a/modules/grouping/src/java/org/apache/lucene/search/grouping/TermAllGroupHeadsCollector.java
+++ b/modules/grouping/src/java/org/apache/lucene/search/grouping/TermAllGroupHeadsCollector.java
@@ -387,7 +387,7 @@
 
       // Clear ordSet and fill it with previous encountered groups that can occur in the current segment.
       ordSet.clear();
-      segmentGroupHeads = new GroupHead[groupIndex.size()];
+      segmentGroupHeads = new GroupHead[groupIndex.numOrd()];
       for (GroupHead collectedGroup : collectedGroups) {
         int groupOrd = groupIndex.binarySearchLookup(collectedGroup.groupValue, scratchBytesRef);
         if (groupOrd >= 0) {
