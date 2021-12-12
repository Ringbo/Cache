diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/methods/send/SendMessage.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/methods/send/SendMessage.java
index 284862b..d750304 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/methods/send/SendMessage.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/methods/send/SendMessage.java
@@ -56,7 +56,7 @@
         this.text = checkNotNull(text);
     }
 
-    public SendMessage(Integer chatId, String text) {
+    public SendMessage(Long chatId, String text) {
         this.chatId = checkNotNull(chatId).toString();
         this.text = checkNotNull(text);
     }
