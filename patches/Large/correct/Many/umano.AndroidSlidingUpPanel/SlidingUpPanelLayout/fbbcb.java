diff --git a/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java b/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
index 2a3689c..fc6b404 100644
--- a/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
+++ b/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
@@ -1212,7 +1212,7 @@
      * @param velocity    initial velocity in case of fling, or 0.
      */
     boolean smoothSlideTo(float slideOffset, int velocity) {
-        if (!isEnabled()) {
+        if (!isEnabled() || mSlideableView == null) {
             // Nothing to do.
             return false;
         }
