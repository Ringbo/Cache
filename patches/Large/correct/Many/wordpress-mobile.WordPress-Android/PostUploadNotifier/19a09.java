diff --git a/WordPress/src/main/java/org/wordpress/android/ui/uploads/PostUploadNotifier.java b/WordPress/src/main/java/org/wordpress/android/ui/uploads/PostUploadNotifier.java
index 46d8f0e..ed0bb83 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/uploads/PostUploadNotifier.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/uploads/PostUploadNotifier.java
@@ -312,7 +312,7 @@
         // first we build a summary of what failed and what went OK, like this:
         // i.e. "1 post, 3 media files not uploaded (9 successfully uploaded)"
         String newErrorMessage = "";
-        int postItemsNotUploaded = sNotificationData.totalPostItems - sNotificationData.currentPostItem;
+        int postItemsNotUploaded = sNotificationData.totalPostItems > 0 ? sNotificationData.totalPostItems - (sNotificationData.currentPostItem-1) : 0;
         int mediaItemsNotUploaded = sNotificationData.totalMediaItems - sNotificationData.currentMediaItem;
         if (postItemsNotUploaded > 0) {
             newErrorMessage += postItemsNotUploaded + " " + getPagesAndOrPostsString();
@@ -339,7 +339,7 @@
 
         notificationBuilder.setContentTitle(notificationTitle);
         notificationBuilder.setContentText(newErrorMessage);
-        notificationBuilder.setStyle(new NotificationCompat.BigTextStyle().bigText(errorMessage));
+        notificationBuilder.setStyle(new NotificationCompat.BigTextStyle().bigText(newErrorMessage));
         notificationBuilder.setContentIntent(pendingIntent);
         notificationBuilder.setAutoCancel(true);
 
