diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/methods/send/SendVideoNote.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/methods/send/SendVideoNote.java
index 468029e..38ec3a5 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/methods/send/SendVideoNote.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/methods/send/SendVideoNote.java
@@ -65,7 +65,7 @@
      * @param chatId Chat Id to send the video note
      * @param videoNote Video note file_id to send
      */
-    public SendVideoNote(Integer chatId, String videoNote) {
+    public SendVideoNote(Long chatId, String videoNote) {
         this.chatId = checkNotNull(chatId).toString();
         this.videoNote = checkNotNull(videoNote);
         this.isNewVideoNote = false;
