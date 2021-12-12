diff --git a/src/main/java/org/telegram/telegrambots/bots/AbsSender.java b/src/main/java/org/telegram/telegrambots/bots/AbsSender.java
index 49a8b33..5e81b4f 100644
--- a/src/main/java/org/telegram/telegrambots/bots/AbsSender.java
+++ b/src/main/java/org/telegram/telegrambots/bots/AbsSender.java
@@ -93,12 +93,12 @@
         return (Message) sendApiMethod(forwardMessage);
     }
 
-    public File sendLocation(SendLocation sendLocation) throws TelegramApiException {
+    public Message sendLocation(SendLocation sendLocation) throws TelegramApiException {
         if (sendLocation == null) {
             throw new TelegramApiException("Parameter sendLocation can not be null");
         }
 
-        return (File) sendApiMethod(sendLocation);
+        return (Message) sendApiMethod(sendLocation);
     }
 
     public UserProfilePhotos getUserProfilePhotos(GetUserProfilePhotos getUserProfilePhotos) throws TelegramApiException {
