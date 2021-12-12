diff --git a/litho-widget/src/main/java/com/facebook/litho/widget/RecyclerBinder.java b/litho-widget/src/main/java/com/facebook/litho/widget/RecyclerBinder.java
index 1dce3f9..65bee7b 100644
--- a/litho-widget/src/main/java/com/facebook/litho/widget/RecyclerBinder.java
+++ b/litho-widget/src/main/java/com/facebook/litho/widget/RecyclerBinder.java
@@ -759,7 +759,7 @@
     mLayoutInfo.setComponentInfoCollection(this);
 
     if (mCurrentFirstVisiblePosition != RecyclerView.NO_POSITION &&
-        mCurrentFirstVisiblePosition > 0) {
+        mCurrentFirstVisiblePosition >= 0) {
       if (layoutManager instanceof LinearLayoutManager) {
         ((LinearLayoutManager) layoutManager)
             .scrollToPositionWithOffset(mCurrentFirstVisiblePosition, mCurrentOffset);
@@ -806,8 +806,8 @@
 
     if (firstView != null) {
       mCurrentOffset = mLayoutInfo.getScrollDirection() == HORIZONTAL
-          ? firstView.getLeft()
-          : firstView.getTop();
+          ? mLayoutInfo.getLayoutManager().getDecoratedLeft(firstView)
+          : mLayoutInfo.getLayoutManager().getDecoratedTop(firstView);
     } else {
       mCurrentOffset = 0;
     }
