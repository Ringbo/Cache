diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickStepController.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickStepController.java
index 19544b1..9abbfb83 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickStepController.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickStepController.java
@@ -352,7 +352,7 @@
 
     @Override
     public void onDraw(Canvas canvas) {
-        if (mNavigationBarView.isQuickScrubEnabled()) {
+        if (!mNavigationBarView.isQuickScrubEnabled()) {
             return;
         }
         int color = (int) mTrackColorEvaluator.evaluate(mDarkIntensity, mLightTrackColor,
