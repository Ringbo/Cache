diff --git a/src/org/thoughtcrime/securesms/ConversationActivity.java b/src/org/thoughtcrime/securesms/ConversationActivity.java
index ce9e590..3c24057 100644
--- a/src/org/thoughtcrime/securesms/ConversationActivity.java
+++ b/src/org/thoughtcrime/securesms/ConversationActivity.java
@@ -589,7 +589,7 @@
         @Override
         protected Void doInBackground(Void... params) {
           DatabaseFactory.getRecipientDatabase(ConversationActivity.this).setExpireMessages(recipient, expirationTime);
-          OutgoingExpirationUpdateMessage outgoingMessage = new OutgoingExpirationUpdateMessage(getRecipient(), System.currentTimeMillis(), expirationTime * 1000);
+          OutgoingExpirationUpdateMessage outgoingMessage = new OutgoingExpirationUpdateMessage(getRecipient(), System.currentTimeMillis(), expirationTime * 1000L);
           MessageSender.send(ConversationActivity.this, outgoingMessage, threadId, false, null);
 
           return null;
@@ -1627,7 +1627,7 @@
 
       boolean    forceSms       = sendButton.isManualSelection() && sendButton.getSelectedTransport().isSms();
       int        subscriptionId = sendButton.getSelectedTransport().getSimSubscriptionId().or(-1);
-      long       expiresIn      = recipient.getExpireMessages() * 1000;
+      long       expiresIn      = recipient.getExpireMessages() * 1000L;
       boolean    initiating     = threadId == -1;
 
       Log.w(TAG, "isManual Selection: " + sendButton.isManualSelection());
@@ -1842,7 +1842,7 @@
       public void onSuccess(final @NonNull Pair<Uri, Long> result) {
         boolean    forceSms       = sendButton.isManualSelection() && sendButton.getSelectedTransport().isSms();
         int        subscriptionId = sendButton.getSelectedTransport().getSimSubscriptionId().or(-1);
-        long       expiresIn      = recipient.getExpireMessages() * 1000;
+        long       expiresIn      = recipient.getExpireMessages() * 1000L;
         boolean    initiating     = threadId == -1;
         AudioSlide audioSlide     = new AudioSlide(ConversationActivity.this, result.first, result.second, MediaUtil.AUDIO_AAC, true);
         SlideDeck  slideDeck      = new SlideDeck();
