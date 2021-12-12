diff --git a/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/expandable/ExpandableRecyclerViewWrapperAdapter.java b/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/expandable/ExpandableRecyclerViewWrapperAdapter.java
index b0b4c55..848acec 100644
--- a/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/expandable/ExpandableRecyclerViewWrapperAdapter.java
+++ b/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/expandable/ExpandableRecyclerViewWrapperAdapter.java
@@ -836,7 +836,7 @@
 
         int removedCount = mPositionTranslator.removeGroupItem(groupPosition);
         if (removedCount > 0) {
-            notifyItemRemoved(flatPosition);
+            notifyItemRangeRemoved(flatPosition, removedCount);
         }
     }
 
