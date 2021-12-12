diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/ScrimController.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/ScrimController.java
index 2d2d708..3dbac51 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/ScrimController.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/ScrimController.java
@@ -395,7 +395,7 @@
             // Darken scrim as you pull down the shade when unlocked
             float behindFraction = getInterpolatedFraction();
             behindFraction = (float) Math.pow(behindFraction, 0.8f);
-            mCurrentBehindAlpha = behindFraction * mScrimBehindAlphaKeyguard;
+            mCurrentBehindAlpha = behindFraction * GRADIENT_SCRIM_ALPHA_BUSY;
             mCurrentInFrontAlpha = 0;
         } else if (mState == ScrimState.KEYGUARD) {
             // Either darken of make the scrim transparent when you
