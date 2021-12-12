diff --git a/packages/Keyguard/src/com/android/keyguard/KeyguardPINView.java b/packages/Keyguard/src/com/android/keyguard/KeyguardPINView.java
index ac9dc85..d265e0d 100644
--- a/packages/Keyguard/src/com/android/keyguard/KeyguardPINView.java
+++ b/packages/Keyguard/src/com/android/keyguard/KeyguardPINView.java
@@ -50,7 +50,7 @@
         mAppearAnimationUtils = new AppearAnimationUtils(context);
         mDisappearAnimationUtils = new DisappearAnimationUtils(context,
                 125, 0.6f /* translationScale */,
-                0.6f /* delayScale */, AnimationUtils.loadInterpolator(
+                0.45f /* delayScale */, AnimationUtils.loadInterpolator(
                         mContext, android.R.interpolator.fast_out_linear_in));
         mDisappearYTranslation = getResources().getDimensionPixelSize(
                 R.dimen.disappear_y_translation);
