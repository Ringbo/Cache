diff --git a/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java b/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
index 95cd847..0452f92 100644
--- a/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
+++ b/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
@@ -869,7 +869,7 @@
     @Override
     public boolean onInterceptTouchEvent(MotionEvent ev) {
         // If the scrollable view is handling touch, never intercept
-        if (mIsScrollableViewHandlingTouch) {
+        if (mIsScrollableViewHandlingTouch || !isTouchEnabled()) {
             mDragHelper.cancel();
             return false;
         }
