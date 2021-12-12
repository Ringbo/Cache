diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
index decf231..a07e00a 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
@@ -1346,7 +1346,7 @@
             updateExpandedViewPos(EXPANDED_LEAVE_ALONE);
 
             if (CLOSE_PANEL_WHEN_EMPTIED && !hasActiveNotifications()
-                    && !mNotificationPanel.isTracking()) {
+                    && !mNotificationPanel.isTracking() && !mNotificationPanel.isQsExpanded()) {
                 if (mState == StatusBarState.SHADE) {
                     animateCollapsePanels();
                 } else if (mState == StatusBarState.SHADE_LOCKED) {
