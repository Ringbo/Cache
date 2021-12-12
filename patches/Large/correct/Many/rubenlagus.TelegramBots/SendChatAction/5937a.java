diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/methods/send/SendChatAction.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/methods/send/SendChatAction.java
index cc8a36c..89d20b9 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/methods/send/SendChatAction.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/methods/send/SendChatAction.java
@@ -49,7 +49,7 @@
         this.action = checkNotNull(action);
     }
 
-    public SendChatAction(Integer chatId, String action) {
+    public SendChatAction(Long chatId, String action) {
         this.chatId = checkNotNull(chatId).toString();
         this.action = checkNotNull(action);
     }
