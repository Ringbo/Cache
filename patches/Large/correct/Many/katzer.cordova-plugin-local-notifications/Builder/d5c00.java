diff --git a/src/android/notification/Builder.java b/src/android/notification/Builder.java
index d1b6b33..52a6fce 100644
--- a/src/android/notification/Builder.java
+++ b/src/android/notification/Builder.java
@@ -125,7 +125,7 @@
         builder = new NotificationCompat.Builder(context, Manager.CHANNEL_ID)
                 .setDefaults(options.getDefaults())
                 .setExtras(extras)
-                .setOnlyAlertOnce(true)
+                .setOnlyAlertOnce(false)
                 .setChannelId(options.getChannel())
                 .setContentTitle(options.getTitle())
                 .setContentText(options.getText())
