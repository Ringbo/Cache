diff --git a/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/expandable/ExpandablePositionTranslator.java b/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/expandable/ExpandablePositionTranslator.java
index 2b75ee0..9ea72bf 100644
--- a/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/expandable/ExpandablePositionTranslator.java
+++ b/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/expandable/ExpandablePositionTranslator.java
@@ -167,7 +167,7 @@
 
         for (int i = 0; i < mGroupCount; i++) {
             final long t = mCachedGroupPosInfo[i];
-            expandedGroups[i] = ((long) mCachedGroupId[i] << 32l) | (t & FLAG_EXPANDED);
+            expandedGroups[i] = ((long) mCachedGroupId[i] << 32L) | (t & FLAG_EXPANDED);
         }
 
         Arrays.sort(expandedGroups);
