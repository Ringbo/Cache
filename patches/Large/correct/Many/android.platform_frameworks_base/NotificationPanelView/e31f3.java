diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java
index dfe003f..228f522 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java
@@ -762,7 +762,8 @@
         }
         if ((!mIsExpanding || mHintAnimationRunning)
                 && !mQsExpanded
-                && mStatusBar.getBarState() != StatusBarState.SHADE) {
+                && mStatusBar.getBarState() != StatusBarState.SHADE
+                && !mDozing) {
             mAffordanceHelper.onTouchEvent(event);
         }
         if (mOnlyAffordanceInThisMotion) {
