diff --git a/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java b/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
index 8f158b5..e7fa64f 100644
--- a/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
+++ b/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
@@ -805,7 +805,7 @@
         // Compute the top of the panel if its collapsed
         return mIsSlidingUp
                 ? getMeasuredHeight() - getPaddingBottom() - mPanelHeight - slidePixelOffset
-                : getPaddingTop() + slidePixelOffset;
+                : getPaddingTop() - panelHeight + mPanelHeight + slidePixelOffset;
     }
 
     /*
@@ -957,7 +957,7 @@
         result = super.drawChild(canvas, child, drawingTime);
         canvas.restoreToCount(save);
 
-        if (drawScrim && mCoveredFadeColor > 0) {
+        if (drawScrim && mCoveredFadeColor != 0) {
             final int baseAlpha = (mCoveredFadeColor & 0xff000000) >>> 24;
             final int imag = (int) (baseAlpha * mSlideOffset);
             final int color = imag << 24 | (mCoveredFadeColor & 0xffffff);
