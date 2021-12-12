diff --git a/src/org/thoughtcrime/securesms/notifications/RemoteReplyReceiver.java b/src/org/thoughtcrime/securesms/notifications/RemoteReplyReceiver.java
index 5aeb5c5..674b080 100644
--- a/src/org/thoughtcrime/securesms/notifications/RemoteReplyReceiver.java
+++ b/src/org/thoughtcrime/securesms/notifications/RemoteReplyReceiver.java
@@ -65,7 +65,7 @@
 
           Recipient recipient = Recipient.from(context, address, false);
           int  subscriptionId = recipient.getDefaultSubscriptionId().or(-1);
-          long expiresIn      = recipient.getExpireMessages() * 1000;
+          long expiresIn      = recipient.getExpireMessages() * 1000L;
 
           if (recipient.isGroupRecipient()) {
             OutgoingMediaMessage reply = new OutgoingMediaMessage(recipient, responseText.toString(), new LinkedList<>(), System.currentTimeMillis(), subscriptionId, expiresIn, 0);
