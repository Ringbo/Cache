diff --git a/library/src/main/java/com/sothree/slidinguppanel/SlidingUpPanelLayout.java b/library/src/main/java/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
index 690a3c2..57f89a1 100644
--- a/library/src/main/java/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
+++ b/library/src/main/java/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
@@ -1173,7 +1173,7 @@
         boolean result;
         final int save = canvas.save(Canvas.CLIP_SAVE_FLAG);
 
-        if (mSlideableView != child) { // if main view
+        if (mSlideableView != null && mSlideableView != child) { // if main view
             // Clip against the slider; no sense drawing what will immediately be covered,
             // Unless the panel is set to overlay content
             canvas.getClipBounds(mTmpRect);
