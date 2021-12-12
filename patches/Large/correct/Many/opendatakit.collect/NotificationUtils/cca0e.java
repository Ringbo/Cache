diff --git a/collect_app/src/main/java/org/odk/collect/android/utilities/NotificationUtils.java b/collect_app/src/main/java/org/odk/collect/android/utilities/NotificationUtils.java
index 6ae43d9..3435c65 100644
--- a/collect_app/src/main/java/org/odk/collect/android/utilities/NotificationUtils.java
+++ b/collect_app/src/main/java/org/odk/collect/android/utilities/NotificationUtils.java
@@ -54,14 +54,13 @@
                                         String contentText) {
         Context context = Collect.getInstance();
 
-        NotificationCompat.Builder builder = new NotificationCompat.Builder(context).setContentIntent(contentIntent);
+        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID).setContentIntent(contentIntent);
 
         builder
                 .setContentTitle(context.getString(title))
                 .setContentText(contentText)
                 .setSmallIcon(IconUtils.getNotificationAppIcon())
-                .setAutoCancel(true)
-                .setChannelId(CHANNEL_ID);
+                .setAutoCancel(true);
 
         NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
         if (manager != null) {
