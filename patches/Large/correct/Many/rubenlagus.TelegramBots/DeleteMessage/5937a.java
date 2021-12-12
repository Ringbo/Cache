diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/methods/updatingmessages/DeleteMessage.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/methods/updatingmessages/DeleteMessage.java
index 988ae9a..dc0303b 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/methods/updatingmessages/DeleteMessage.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/methods/updatingmessages/DeleteMessage.java
@@ -48,7 +48,7 @@
         this.messageId = checkNotNull(messageId);
     }
 
-    public DeleteMessage(Integer chatId, Integer messageId) {
+    public DeleteMessage(Long chatId, Integer messageId) {
         this.chatId = checkNotNull(chatId).toString();
         this.messageId = checkNotNull(messageId);
     }
