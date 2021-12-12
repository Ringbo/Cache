diff --git a/src/org/thoughtcrime/securesms/jobs/PushDecryptJob.java b/src/org/thoughtcrime/securesms/jobs/PushDecryptJob.java
index 869b9cc..cd850ae 100644
--- a/src/org/thoughtcrime/securesms/jobs/PushDecryptJob.java
+++ b/src/org/thoughtcrime/securesms/jobs/PushDecryptJob.java
@@ -395,7 +395,7 @@
     Recipient            recipient    = getMessageDestination(envelope, message);
     IncomingMediaMessage mediaMessage = new IncomingMediaMessage(Address.fromExternal(context, envelope.getSource()),
                                                                  message.getTimestamp(), -1,
-                                                                 message.getExpiresInSeconds() * 1000, true,
+                                                                 message.getExpiresInSeconds() * 1000L, true,
                                                                  Optional.fromNullable(envelope.getRelay()),
                                                                  Optional.absent(), message.getGroupInfo(),
                                                                  Optional.absent());
@@ -519,7 +519,7 @@
     Recipient            recipient    = getMessageDestination(envelope, message);
     IncomingMediaMessage mediaMessage = new IncomingMediaMessage(Address.fromExternal(context, envelope.getSource()),
                                                                  message.getTimestamp(), -1,
-                                                                 message.getExpiresInSeconds() * 1000, false,
+                                                                 message.getExpiresInSeconds() * 1000L, false,
                                                                  Optional.fromNullable(envelope.getRelay()),
                                                                  message.getBody(),
                                                                  message.getGroupInfo(),
@@ -556,7 +556,7 @@
 
     OutgoingExpirationUpdateMessage expirationUpdateMessage = new OutgoingExpirationUpdateMessage(recipient,
                                                                                                   message.getTimestamp(),
-                                                                                                  message.getMessage().getExpiresInSeconds() * 1000);
+                                                                                                  message.getMessage().getExpiresInSeconds() * 1000L);
 
     long threadId  = DatabaseFactory.getThreadDatabase(context).getThreadIdFor(recipient);
     long messageId = database.insertMessageOutbox(expirationUpdateMessage, threadId, false, null);
@@ -576,7 +576,7 @@
     OutgoingMediaMessage  mediaMessage = new OutgoingMediaMessage(recipients, message.getMessage().getBody().orNull(),
                                                                   PointerAttachment.forPointers(message.getMessage().getAttachments()),
                                                                   message.getTimestamp(), -1,
-                                                                  message.getMessage().getExpiresInSeconds() * 1000,
+                                                                  message.getMessage().getExpiresInSeconds() * 1000L,
                                                                   ThreadDatabase.DistributionTypes.DEFAULT);
 
     mediaMessage = new OutgoingSecureMediaMessage(mediaMessage);
@@ -602,7 +602,7 @@
                         .getExpiringMessageManager()
                         .scheduleDeletion(messageId, true,
                                           message.getExpirationStartTimestamp(),
-                                          message.getMessage().getExpiresInSeconds() * 1000);
+                                          message.getMessage().getExpiresInSeconds() * 1000L);
     }
 
     return threadId;
@@ -630,7 +630,7 @@
                                                                 envelope.getSourceDevice(),
                                                                 message.getTimestamp(), body,
                                                                 message.getGroupInfo(),
-                                                                message.getExpiresInSeconds() * 1000);
+                                                                message.getExpiresInSeconds() * 1000L);
 
       textMessage = new IncomingEncryptedMessage(textMessage, body);
       Optional<InsertResult> insertResult = database.insertMessageInbox(textMessage);
@@ -652,7 +652,7 @@
 
     Recipient recipient       = getSyncMessageDestination(message);
     String    body            = message.getMessage().getBody().or("");
-    long      expiresInMillis = message.getMessage().getExpiresInSeconds() * 1000;
+    long      expiresInMillis = message.getMessage().getExpiresInSeconds() * 1000L;
 
     if (recipient.getExpireMessages() != message.getMessage().getExpiresInSeconds()) {
       handleSynchronizeSentExpirationUpdate(message);
