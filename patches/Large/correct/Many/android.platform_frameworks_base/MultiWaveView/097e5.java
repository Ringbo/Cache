diff --git a/core/java/com/android/internal/widget/multiwaveview/MultiWaveView.java b/core/java/com/android/internal/widget/multiwaveview/MultiWaveView.java
index 3cc19e7..c03f91c 100644
--- a/core/java/com/android/internal/widget/multiwaveview/MultiWaveView.java
+++ b/core/java/com/android/internal/widget/multiwaveview/MultiWaveView.java
@@ -297,7 +297,7 @@
      */
     private void startChevronAnimation() {
         final float r = mHandleDrawable.getWidth() * 0.4f;
-        final float chevronAnimationDistance = mOuterRadius * 1.0f;
+        final float chevronAnimationDistance = mOuterRadius * 0.9f;
         final float from[][] = {
                 {mWaveCenterX - r, mWaveCenterY},  // left
                 {mWaveCenterX + r, mWaveCenterY},  // right
