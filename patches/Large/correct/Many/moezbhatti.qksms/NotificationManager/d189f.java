diff --git a/QKSMS/src/main/java/com/moez/QKSMS/transaction/NotificationManager.java b/QKSMS/src/main/java/com/moez/QKSMS/transaction/NotificationManager.java
index 447ccb3..b3e47d1 100644
--- a/QKSMS/src/main/java/com/moez/QKSMS/transaction/NotificationManager.java
+++ b/QKSMS/src/main/java/com/moez/QKSMS/transaction/NotificationManager.java
@@ -514,7 +514,7 @@
                 .extend(RemoteMessagingReceiver.getConversationExtender(context, message.mContact, message.mAddress, threadId))
                 .setDeleteIntent(seenPI);
 
-        if (Build.VERSION.SDK_INT < 23) {
+        if (Build.VERSION.SDK_INT < 24) {
             Intent replyIntent = new Intent(context, QKReplyActivity.class);
             replyIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
             replyIntent.putExtra(QKReplyActivity.EXTRA_THREAD_ID, threadId);
@@ -607,7 +607,7 @@
                 .extend(RemoteMessagingReceiver.getConversationExtender(context, message.mContact, message.mAddress, threadId))
                 .setDeleteIntent(seenPI);
 
-        if (Build.VERSION.SDK_INT < 23) {
+        if (Build.VERSION.SDK_INT < 24) {
             Intent replyIntent = new Intent(context, QKReplyActivity.class);
             replyIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
             replyIntent.putExtra(QKReplyActivity.EXTRA_THREAD_ID, threadId);
@@ -749,7 +749,7 @@
      */
     private static int getNotificationPriority(Context context) {
         boolean qkreplyEnabled = PreferenceManager.getDefaultSharedPreferences(context)
-                .getBoolean(SettingsFragment.QUICKREPLY, Build.VERSION.SDK_INT < 23);
+                .getBoolean(SettingsFragment.QUICKREPLY, Build.VERSION.SDK_INT < 24);
         if (qkreplyEnabled) {
             return NotificationCompat.PRIORITY_DEFAULT;
         } else {
