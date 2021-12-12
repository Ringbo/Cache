diff --git a/packages/Keyguard/src/com/android/keyguard/KeyguardPatternView.java b/packages/Keyguard/src/com/android/keyguard/KeyguardPatternView.java
index 59a8ad5..3568429 100644
--- a/packages/Keyguard/src/com/android/keyguard/KeyguardPatternView.java
+++ b/packages/Keyguard/src/com/android/keyguard/KeyguardPatternView.java
@@ -109,7 +109,7 @@
                         mContext, android.R.interpolator.linear_out_slow_in));
         mDisappearAnimationUtils = new DisappearAnimationUtils(context,
                 125, 1.2f /* translationScale */,
-                0.8f /* delayScale */, AnimationUtils.loadInterpolator(
+                0.6f /* delayScale */, AnimationUtils.loadInterpolator(
                         mContext, android.R.interpolator.fast_out_linear_in));
         mDisappearYTranslation = getResources().getDimensionPixelSize(
                 R.dimen.disappear_y_translation);
