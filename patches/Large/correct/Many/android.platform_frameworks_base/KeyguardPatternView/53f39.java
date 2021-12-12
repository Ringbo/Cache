diff --git a/packages/Keyguard/src/com/android/keyguard/KeyguardPatternView.java b/packages/Keyguard/src/com/android/keyguard/KeyguardPatternView.java
index e6de72f..a0b5536 100644
--- a/packages/Keyguard/src/com/android/keyguard/KeyguardPatternView.java
+++ b/packages/Keyguard/src/com/android/keyguard/KeyguardPatternView.java
@@ -475,7 +475,8 @@
             interpolator, null);
 
             // And the forgot pattern button
-            if (mForgotPatternButton.getVisibility() == View.VISIBLE) {
+            if (mForgotPatternButton != null
+                    && mForgotPatternButton.getVisibility() == View.VISIBLE) {
                 mAppearAnimationUtils.createAnimation(mForgotPatternButton, delay, duration,
                         startTranslationY, interpolator, null);
             }
