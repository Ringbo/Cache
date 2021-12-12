diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java
index a750572..e3b1b9f 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java
@@ -1263,7 +1263,7 @@
             setQsExpanded(true);
         } else if (height <= mQsMinExpansionHeight && mQsExpanded) {
             setQsExpanded(false);
-            if (mLastAnnouncementWasQuickSettings && !mTracking) {
+            if (mLastAnnouncementWasQuickSettings && !mTracking && !isCollapsing()) {
                 announceForAccessibility(getKeyguardOrLockScreenString());
                 mLastAnnouncementWasQuickSettings = false;
             }
