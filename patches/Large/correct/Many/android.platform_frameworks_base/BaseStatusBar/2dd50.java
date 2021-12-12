diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java b/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java
index 19e511c..20193f7 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java
@@ -1485,7 +1485,7 @@
      */
     @Override  // NotificationData.Environment
     public boolean shouldHideNotifications(int userId) {
-        return isLockscreenPublicMode(mCurrentUserId) && !userAllowsNotificationsInPublic(userId)
+        return isLockscreenPublicMode(userId) && !userAllowsNotificationsInPublic(userId)
                 || (userId != mCurrentUserId && shouldHideNotifications(mCurrentUserId));
     }
 
