diff --git a/src/com/fsck/k9/controller/MessagingController.java b/src/com/fsck/k9/controller/MessagingController.java
index d1fdf20..f85bee3 100644
--- a/src/com/fsck/k9/controller/MessagingController.java
+++ b/src/com/fsck/k9/controller/MessagingController.java
@@ -2647,7 +2647,7 @@
         final PendingIntent pi = PendingIntent.getActivity(context,
                 account.getAccountNumber(), i, PendingIntent.FLAG_UPDATE_CURRENT);
         final String title = context.getString(
-                R.string.notification_certificate_error_title, account.getName());
+                R.string.notification_certificate_error_title, account.getDescription());
 
         final NotificationCompat.Builder builder = new NotificationBuilder(context);
         builder.setSmallIcon(R.drawable.ic_notify_new_mail);
