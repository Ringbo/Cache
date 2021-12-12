diff --git a/services/java/com/android/server/NotificationManagerService.java b/services/java/com/android/server/NotificationManagerService.java
index 4a54efe..0e171cd 100755
--- a/services/java/com/android/server/NotificationManagerService.java
+++ b/services/java/com/android/server/NotificationManagerService.java
@@ -889,7 +889,7 @@
         final boolean isSystemNotification = ("android".equals(pkg));
 
         userId = ActivityManager.handleIncomingUser(callingPid,
-                callingUid, userId, true, true, "enqueueNotification", pkg);
+                callingUid, userId, true, false, "enqueueNotification", pkg);
         final UserHandle user = new UserHandle(userId);
 
         // Limit the number of notifications that any given package except the android
@@ -1287,7 +1287,7 @@
     public void cancelNotificationWithTag(String pkg, String tag, int id, int userId) {
         checkCallerIsSystemOrSameApp(pkg);
         userId = ActivityManager.handleIncomingUser(Binder.getCallingPid(),
-                Binder.getCallingUid(), userId, true, true, "cancelNotificationWithTag", pkg);
+                Binder.getCallingUid(), userId, true, false, "cancelNotificationWithTag", pkg);
         // Don't allow client applications to cancel foreground service notis.
         cancelNotification(pkg, tag, id, 0,
                 Binder.getCallingUid() == Process.SYSTEM_UID
@@ -1298,7 +1298,7 @@
         checkCallerIsSystemOrSameApp(pkg);
 
         userId = ActivityManager.handleIncomingUser(Binder.getCallingPid(),
-                Binder.getCallingUid(), userId, true, true, "cancelAllNotifications", pkg);
+                Binder.getCallingUid(), userId, true, false, "cancelAllNotifications", pkg);
 
         // Calling from user space, don't allow the canceling of actively
         // running foreground services.
