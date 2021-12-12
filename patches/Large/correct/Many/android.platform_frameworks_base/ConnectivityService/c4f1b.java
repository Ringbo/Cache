diff --git a/services/core/java/com/android/server/ConnectivityService.java b/services/core/java/com/android/server/ConnectivityService.java
index 5118b3f..e5f32b8 100644
--- a/services/core/java/com/android/server/ConnectivityService.java
+++ b/services/core/java/com/android/server/ConnectivityService.java
@@ -3571,14 +3571,14 @@
                     .build();
 
             try {
-                notificationManager.notify(NOTIFICATION_ID, id, notification);
+                notificationManager.notifyAsUser(NOTIFICATION_ID, id, notification, UserHandle.ALL);
             } catch (NullPointerException npe) {
                 loge("setNotificationVisible: visible notificationManager npe=" + npe);
                 npe.printStackTrace();
             }
         } else {
             try {
-                notificationManager.cancel(NOTIFICATION_ID, id);
+                notificationManager.cancelAsUser(NOTIFICATION_ID, id, UserHandle.ALL);
             } catch (NullPointerException npe) {
                 loge("setNotificationVisible: cancel notificationManager npe=" + npe);
                 npe.printStackTrace();
