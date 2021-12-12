diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java
index 04cb620..304a499 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java
@@ -488,7 +488,7 @@
                 mUpdateFlingVelocity = vel;
             }
         } else if (mPanelClosedOnDown && !mHeadsUpManager.hasPinnedHeadsUp() && !mTracking
-                && !mStatusBar.isBouncerShowing()) {
+                && !mStatusBar.isBouncerShowing() && !mStatusBar.isKeyguardFadingAway()) {
             long timePassed = SystemClock.uptimeMillis() - mDownTime;
             if (timePassed < ViewConfiguration.getLongPressTimeout()) {
                 // Lets show the user that he can actually expand the panel
