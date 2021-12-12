diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java b/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java
index 67bca3e..723989a 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java
@@ -2092,7 +2092,7 @@
         Notification n = notification.getNotification();
         mNotificationData.updateRanking(ranking);
 
-        boolean applyInPlace = !entry.cacheContentViews(mContext, notification.getNotification());
+        boolean applyInPlace = entry.cacheContentViews(mContext, notification.getNotification());
         boolean shouldInterrupt = shouldInterrupt(entry, notification);
         boolean alertAgain = alertAgain(entry, n);
         if (DEBUG) {
