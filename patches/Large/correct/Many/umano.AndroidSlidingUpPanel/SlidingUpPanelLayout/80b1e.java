diff --git a/library/src/main/java/com/sothree/slidinguppanel/SlidingUpPanelLayout.java b/library/src/main/java/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
index d1aee07..9442425 100644
--- a/library/src/main/java/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
+++ b/library/src/main/java/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
@@ -910,7 +910,7 @@
                 // Check if this was a click on the faded part of the screen, and fire off the listener if there is one.
                 if (ady <= dragSlop
                         && adx <= dragSlop
-                        && mSlideOffset >=0 && !isViewUnder(mSlideableView, (int) mInitialMotionX, (int) mInitialMotionY) && mFadeOnClickListener != null) {
+                        && mSlideOffset > 0 && !isViewUnder(mSlideableView, (int) mInitialMotionX, (int) mInitialMotionY) && mFadeOnClickListener != null) {
                     playSoundEffect(android.view.SoundEffectConstants.CLICK);
                     mFadeOnClickListener.onClick(this);
                     return true;
