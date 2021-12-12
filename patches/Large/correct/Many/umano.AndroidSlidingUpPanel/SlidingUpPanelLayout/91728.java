diff --git a/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java b/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
index 4e37b58..4b2e8e1 100644
--- a/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
+++ b/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
@@ -1272,7 +1272,7 @@
         super.draw(c);
 
         // draw the shadow
-        if (mShadowDrawable != null) {
+        if (mShadowDrawable != null && mSlideableView != null) {
             final int right = mSlideableView.getRight();
             final int top;
             final int bottom;
