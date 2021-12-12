diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/KeyguardAffordanceView.java b/packages/SystemUI/src/com/android/systemui/statusbar/KeyguardAffordanceView.java
index 88f37a3..8b4225a 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/KeyguardAffordanceView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/KeyguardAffordanceView.java
@@ -174,7 +174,10 @@
 
     private void drawBackgroundCircle(Canvas canvas) {
         if (mCircleRadius > 0 || mFinishing) {
-            if (mFinishing && mSupportHardware) {
+            if (mFinishing && mSupportHardware && mHwCenterX != null) {
+                // Our hardware drawing proparties can be null if the finishing started but we have
+                // never drawn before. In that case we are not doing a render thread animation
+                // anyway, so we need to use the normal drawing.
                 DisplayListCanvas displayListCanvas = (DisplayListCanvas) canvas;
                 displayListCanvas.drawCircle(mHwCenterX, mHwCenterY, mHwCircleRadius,
                         mHwCirclePaint);
