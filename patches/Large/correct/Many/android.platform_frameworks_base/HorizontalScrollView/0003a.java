diff --git a/core/java/android/widget/HorizontalScrollView.java b/core/java/android/widget/HorizontalScrollView.java
index 652e30c..02fc7c6 100644
--- a/core/java/android/widget/HorizontalScrollView.java
+++ b/core/java/android/widget/HorizontalScrollView.java
@@ -283,7 +283,7 @@
 
         final View child = getChildAt(0);
         int width = getMeasuredWidth();
-        if (child.getMeasuredHeight() < width) {
+        if (child.getMeasuredWidth() < width) {
             final FrameLayout.LayoutParams lp = (LayoutParams) child.getLayoutParams();
 
             int childHeightMeasureSpec = getChildMeasureSpec(heightMeasureSpec, mPaddingTop
