diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickStepController.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickStepController.java
index 1a1839d..d9ba313 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickStepController.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickStepController.java
@@ -327,7 +327,7 @@
                 - mNavigationBarView.getPaddingTop();
         final int x1, x2, y1, y2;
         if (mIsVertical) {
-            x1 = (width - mTrackThickness) / 2 + mNavigationBarView.getPaddingStart();
+            x1 = (width - mTrackThickness) / 2 + mNavigationBarView.getPaddingLeft();
             x2 = x1 + mTrackThickness;
             y1 = mDragPositive ? height / 2 : mTrackPadding;
             y2 = y1 + height / 2 - mTrackPadding;
