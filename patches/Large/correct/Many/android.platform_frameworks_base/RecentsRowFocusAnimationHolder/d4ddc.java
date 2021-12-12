diff --git a/packages/SystemUI/src/com/android/systemui/recents/tv/animations/RecentsRowFocusAnimationHolder.java b/packages/SystemUI/src/com/android/systemui/recents/tv/animations/RecentsRowFocusAnimationHolder.java
index 160835f..45c1537 100644
--- a/packages/SystemUI/src/com/android/systemui/recents/tv/animations/RecentsRowFocusAnimationHolder.java
+++ b/packages/SystemUI/src/com/android/systemui/recents/tv/animations/RecentsRowFocusAnimationHolder.java
@@ -52,7 +52,9 @@
 
         mFocusLoseAnimatorSet = new AnimatorSet();
         mFocusLoseAnimatorSet.playTogether(
-                ObjectAnimator.ofFloat(mView, "alpha", dimAlpha),
+                // Animation doesn't start from the current value (1f) sometimes,
+                // so specify the desired initial value here.
+                ObjectAnimator.ofFloat(mView, "alpha", 1f, dimAlpha),
                 ObjectAnimator.ofFloat(mTitleView, "alpha", 0f));
         mFocusLoseAnimatorSet.setDuration(duration);
         mFocusLoseAnimatorSet.setInterpolator(Interpolators.FAST_OUT_SLOW_IN);
