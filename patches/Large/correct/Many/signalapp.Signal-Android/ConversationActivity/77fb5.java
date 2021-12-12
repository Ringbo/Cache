diff --git a/src/org/thoughtcrime/securesms/ConversationActivity.java b/src/org/thoughtcrime/securesms/ConversationActivity.java
index ef1b129..fedfe61 100644
--- a/src/org/thoughtcrime/securesms/ConversationActivity.java
+++ b/src/org/thoughtcrime/securesms/ConversationActivity.java
@@ -1603,7 +1603,7 @@
       Log.w(TAG, "isManual Selection: " + sendButton.isManualSelection());
       Log.w(TAG, "forceSms: " + forceSms);
 
-      if ((!recipient.isMmsGroupRecipient() || recipient.getAddress().isEmail()) && !isMmsEnabled) {
+      if ((recipient.isMmsGroupRecipient() || recipient.getAddress().isEmail()) && !isMmsEnabled) {
         handleManualMmsRequired();
       } else if (!forceSms && identityRecords.isUnverified()) {
         handleUnverifiedRecipients();
