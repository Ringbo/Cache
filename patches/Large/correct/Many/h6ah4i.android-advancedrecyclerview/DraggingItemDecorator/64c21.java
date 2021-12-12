diff --git a/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/draggable/DraggingItemDecorator.java b/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/draggable/DraggingItemDecorator.java
index e74a6ff..e473dd1 100644
--- a/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/draggable/DraggingItemDecorator.java
+++ b/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/draggable/DraggingItemDecorator.java
@@ -195,7 +195,7 @@
         mLayoutType = CustomRecyclerViewUtils.getLayoutType(mRecyclerView);
 
         mInitialDraggingItemScaleX = itemView.getScaleX();
-        mInitialDraggingItemScaleY = itemView.getScaleX();
+        mInitialDraggingItemScaleY = itemView.getScaleY();
 
         mLastDraggingItemScaleX = 1.0f;
         mLastDraggingItemScaleY = 1.0f;
