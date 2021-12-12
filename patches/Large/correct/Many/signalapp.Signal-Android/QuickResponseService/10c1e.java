diff --git a/src/org/thoughtcrime/securesms/service/QuickResponseService.java b/src/org/thoughtcrime/securesms/service/QuickResponseService.java
index 4ecd05a..7902941 100644
--- a/src/org/thoughtcrime/securesms/service/QuickResponseService.java
+++ b/src/org/thoughtcrime/securesms/service/QuickResponseService.java
@@ -50,7 +50,7 @@
       Address   address        = Address.fromExternal(this, number);
       Recipient recipient      = Recipient.from(this, address, false);
       int       subscriptionId = recipient.getDefaultSubscriptionId().or(-1);
-      long      expiresIn      = recipient.getExpireMessages() * 1000;
+      long      expiresIn      = recipient.getExpireMessages() * 1000L;
 
       if (!TextUtils.isEmpty(content)) {
         MessageSender.send(this, new OutgoingTextMessage(recipient, content, expiresIn, subscriptionId), -1, false, null);
