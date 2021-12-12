diff --git a/WordPress/src/main/java/org/wordpress/android/push/GCMMessageService.java b/WordPress/src/main/java/org/wordpress/android/push/GCMMessageService.java
index 9b5f8f3..0cb7dea 100644
--- a/WordPress/src/main/java/org/wordpress/android/push/GCMMessageService.java
+++ b/WordPress/src/main/java/org/wordpress/android/push/GCMMessageService.java
@@ -242,7 +242,7 @@
                                                                 String largeIconUri, String title, String message) {
 
         // Build the new notification, add group to support wearable stacking
-        NotificationCompat.Builder builder = getNotificationBuilder(this, title, message);
+        NotificationCompat.Builder builder = getNotificationBuilder(title, message);
 
         Bitmap largeIconBitmap = getLargeIconBitmap(largeIconUri, shouldCircularizeNoteIcon(noteType));
         if (largeIconBitmap != null) {
@@ -379,11 +379,11 @@
         return largeIconBitmap;
     }
 
-    public static NotificationCompat.Builder getNotificationBuilder(Context context, String title, String message){
+    private NotificationCompat.Builder getNotificationBuilder(String title, String message){
         // Build the new notification, add group to support wearable stacking
-       return new NotificationCompat.Builder(context)
+       return new NotificationCompat.Builder(this)
                 .setSmallIcon(R.drawable.notification_icon)
-                .setColor(context.getResources().getColor(R.color.blue_wordpress))
+                .setColor(getResources().getColor(R.color.blue_wordpress))
                 .setContentTitle(title)
                 .setContentText(message)
                 .setTicker(message)
@@ -536,7 +536,7 @@
                 largeIconBitmap = getLargeIconBitmap(remainingNote.getString("icon"),
                         shouldCircularizeNoteIcon(remainingNote.getString(PUSH_ARG_TYPE)));
 
-                builder = getNotificationBuilder(this, title, message);
+                builder = getNotificationBuilder(title, message);
 
                 String noteType = StringUtils.notNullStr(remainingNote.getString(PUSH_ARG_TYPE));
                 wpcomNoteID = remainingNote.getString(PUSH_ARG_NOTE_ID, "");
@@ -547,7 +547,7 @@
         }
 
         if (builder == null) {
-            builder = getNotificationBuilder(this, title, message);
+            builder = getNotificationBuilder(title, message);
         }
 
         if (largeIconBitmap == null) {
