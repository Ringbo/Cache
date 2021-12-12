diff --git a/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java b/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
index 084a549..bd8e172 100644
--- a/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
+++ b/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
@@ -904,7 +904,7 @@
             // expand the main view
             lp.height = mIsSlidingUp ? (newTop - getPaddingBottom()) : (getHeight() - getPaddingBottom() - mSlideableView.getMeasuredHeight() - newTop);
             mMainView.requestLayout();
-        } else if (lp.height != defaultHeight) {
+        } else if (lp.height != defaultHeight && !mOverlayContent) {
             lp.height = defaultHeight;
             mMainView.requestLayout();
         }
