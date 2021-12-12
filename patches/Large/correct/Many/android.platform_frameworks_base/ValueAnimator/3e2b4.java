diff --git a/core/java/android/animation/ValueAnimator.java b/core/java/android/animation/ValueAnimator.java
index 663f297..c6a5152 100644
--- a/core/java/android/animation/ValueAnimator.java
+++ b/core/java/android/animation/ValueAnimator.java
@@ -967,7 +967,7 @@
         AnimationHandler animationHandler = AnimationHandler.getInstance();
         animationHandler.addAnimationFrameCallback(this, (long) (mStartDelay * sDurationScale));
 
-        if (mStartDelay == 0) {
+        if (mStartDelay == 0 || mSeekFraction >= 0) {
             // If there's no start delay, init the animation and notify start listeners right away
             // to be consistent with the previous behavior. Otherwise, postpone this until the first
             // frame after the start delay.
