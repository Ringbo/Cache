diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
index e344df2..c1996ab 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
@@ -4091,7 +4091,7 @@
         ExpandableNotificationRow row = null;
         if (expandView instanceof ExpandableNotificationRow) {
             row = (ExpandableNotificationRow) expandView;
-            row.setUserExpanded(true);
+            row.setUserExpanded(true /* userExpanded */, true /* allowChildExpansion */);
         }
         boolean fullShadeNeedsBouncer = !userAllowsPrivateNotificationsInPublic(mCurrentUserId)
                 || !mShowLockscreenNotifications || mFalsingManager.shouldEnforceBouncer();
