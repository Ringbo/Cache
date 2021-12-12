diff --git a/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/draggable/DraggingItemDecorator.java b/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/draggable/DraggingItemDecorator.java
index fd0b7fb..3e9ea4e 100644
--- a/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/draggable/DraggingItemDecorator.java
+++ b/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/draggable/DraggingItemDecorator.java
@@ -198,7 +198,7 @@
         mLayoutOrientation = CustomRecyclerViewUtils.getOrientation(mRecyclerView);
 
         mInitialDraggingItemScaleX = ViewCompat.getScaleX(itemView);
-        mInitialDraggingItemScaleY = ViewCompat.getScaleX(itemView);
+        mInitialDraggingItemScaleY = ViewCompat.getScaleY(itemView);
 
         mLastDraggingItemScaleX = 1.0f;
         mLastDraggingItemScaleY = 1.0f;
