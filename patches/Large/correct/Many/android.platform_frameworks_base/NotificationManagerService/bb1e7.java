diff --git a/services/java/com/android/server/NotificationManagerService.java b/services/java/com/android/server/NotificationManagerService.java
index 7d1d976..5039294 100755
--- a/services/java/com/android/server/NotificationManagerService.java
+++ b/services/java/com/android/server/NotificationManagerService.java
@@ -707,7 +707,8 @@
         //     behalf of the download manager without affecting other apps.
         if (!pkg.equals("com.android.providers.downloads")
                 || Log.isLoggable("DownloadManager", Log.VERBOSE)) {
-            EventLog.writeEvent(EventLogTags.NOTIFICATION_ENQUEUE, pkg, id, notification.toString());
+            EventLog.writeEvent(EventLogTags.NOTIFICATION_ENQUEUE, pkg, id, tag,
+                    notification.toString());
         }
 
         if (pkg == null || notification == null) {
@@ -944,7 +945,8 @@
      */
     private void cancelNotification(String pkg, String tag, int id, int mustHaveFlags,
             int mustNotHaveFlags, boolean sendDelete) {
-        EventLog.writeEvent(EventLogTags.NOTIFICATION_CANCEL, pkg, id, mustHaveFlags);
+        EventLog.writeEvent(EventLogTags.NOTIFICATION_CANCEL, pkg, id, tag,
+                mustHaveFlags, mustNotHaveFlags);
 
         synchronized (mNotificationList) {
             int index = indexOfNotificationLocked(pkg, tag, id);
@@ -972,7 +974,8 @@
      */
     boolean cancelAllNotificationsInt(String pkg, int mustHaveFlags,
             int mustNotHaveFlags, boolean doit) {
-        EventLog.writeEvent(EventLogTags.NOTIFICATION_CANCEL_ALL, pkg, mustHaveFlags);
+        EventLog.writeEvent(EventLogTags.NOTIFICATION_CANCEL_ALL, pkg, mustHaveFlags,
+                mustNotHaveFlags);
 
         synchronized (mNotificationList) {
             final int N = mNotificationList.size();
