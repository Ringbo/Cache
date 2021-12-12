diff --git a/src/org/thoughtcrime/securesms/notifications/AndroidAutoReplyReceiver.java b/src/org/thoughtcrime/securesms/notifications/AndroidAutoReplyReceiver.java
index 44b115e..bd8f5ee 100644
--- a/src/org/thoughtcrime/securesms/notifications/AndroidAutoReplyReceiver.java
+++ b/src/org/thoughtcrime/securesms/notifications/AndroidAutoReplyReceiver.java
@@ -71,7 +71,7 @@
           long replyThreadId;
 
           int  subscriptionId = recipient.getDefaultSubscriptionId().or(-1);
-          long expiresIn      = recipient.getExpireMessages() * 1000;
+          long expiresIn      = recipient.getExpireMessages() * 1000L;
 
           if (recipient.isGroupRecipient()) {
             Log.w("AndroidAutoReplyReceiver", "GroupRecipient, Sending media message");
