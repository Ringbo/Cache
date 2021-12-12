diff --git a/src/org/thoughtcrime/securesms/ConversationAdapter.java b/src/org/thoughtcrime/securesms/ConversationAdapter.java
index 88f5501..23bc221 100644
--- a/src/org/thoughtcrime/securesms/ConversationAdapter.java
+++ b/src/org/thoughtcrime/securesms/ConversationAdapter.java
@@ -196,7 +196,7 @@
     MessageRecord messageRecord = getMessageRecord(id, cursor, type);
 
     if (messageRecord.isGroupAction() || messageRecord.isCallLog() || messageRecord.isJoined() || 
-        messageRecord.isExpirationTimerUpdate() || messageRecord.isEndSessin() || messageRecord.isIdentityUpdate()) 
+        messageRecord.isExpirationTimerUpdate() || messageRecord.isEndSession() || messageRecord.isIdentityUpdate()) 
    {
       return MESSAGE_TYPE_UPDATE;
     } else if (messageRecord.isOutgoing()) {
