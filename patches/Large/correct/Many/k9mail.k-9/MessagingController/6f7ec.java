diff --git a/src/com/fsck/k9/controller/MessagingController.java b/src/com/fsck/k9/controller/MessagingController.java
index 6576aca..9075713 100644
--- a/src/com/fsck/k9/controller/MessagingController.java
+++ b/src/com/fsck/k9/controller/MessagingController.java
@@ -217,7 +217,7 @@
                 @Override
                 public boolean add(Message m) {
                     while (size() >= MAX_MESSAGES) {
-                        Message dropped = super.remove();
+                        Message dropped = super.removeLast();
                         droppedMessages.add(0, dropped.makeMessageReference());
                     }
                     super.add(0, m);
@@ -4611,7 +4611,7 @@
                     keyguardService.inKeyguardRestrictedInputMode()) ||
                 (K9.getNotificationHideSubject() == NotificationHideSubject.ALWAYS) ||
                 summary.length() == 0) {
-            summary = new StringBuilder(context.getString(R.string.notification_new_title));
+            summary = context.getString(R.string.notification_new_title);
         }
 
         NotificationManager notifMgr =
@@ -4645,10 +4645,10 @@
                             getMessageSubject(context, m)));
                 }
                 if (!data.droppedMessages.isEmpty()) {
-                    style.setSummaryText(context.getString(
-                            R.string.notification_additional_messages, data.droppedMessages.size()));
+                    style.setSummaryText(context.getString(R.string.notification_additional_messages,
+                            data.droppedMessages.size(), accountDescr));
                 }
-                String title = context.getString(R.string.notification_new_messages_title, newMessages, accountDescr);
+                String title = context.getString(R.string.notification_new_messages_title, newMessages);
                 style.setBigContentTitle(title);
                 builder.setContentTitle(title);
                 builder.setSubText(accountDescr);
