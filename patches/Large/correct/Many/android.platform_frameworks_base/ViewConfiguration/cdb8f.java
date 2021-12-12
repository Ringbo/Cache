diff --git a/core/java/android/view/ViewConfiguration.java b/core/java/android/view/ViewConfiguration.java
index 5d01b41..f16fcc9 100644
--- a/core/java/android/view/ViewConfiguration.java
+++ b/core/java/android/view/ViewConfiguration.java
@@ -35,7 +35,7 @@
      * Defines the width of the horizontal scrollbar and the height of the vertical scrollbar in
      * dips
      */
-    private static final int SCROLL_BAR_SIZE = 10;
+    private static final int SCROLL_BAR_SIZE = 4;
 
     /**
      * Duration of the fade when scrollbars fade away in milliseconds
@@ -346,7 +346,8 @@
 
         mEdgeSlop = (int) (sizeAndDensity * EDGE_SLOP + 0.5f);
         mFadingEdgeLength = (int) (sizeAndDensity * FADING_EDGE_LENGTH + 0.5f);
-        mScrollbarSize = (int) (density * SCROLL_BAR_SIZE + 0.5f);
+        mScrollbarSize = res.getDimensionPixelSize(
+                com.android.internal.R.dimen.config_scrollbarSize);
         mDoubleTapSlop = (int) (sizeAndDensity * DOUBLE_TAP_SLOP + 0.5f);
         mWindowTouchSlop = (int) (sizeAndDensity * WINDOW_TOUCH_SLOP + 0.5f);
 
