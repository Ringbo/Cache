diff --git a/src/main/java/org/telegram/telegrambots/TelegramBotsApi.java b/src/main/java/org/telegram/telegrambots/TelegramBotsApi.java
index 4015331..e515810 100644
--- a/src/main/java/org/telegram/telegrambots/TelegramBotsApi.java
+++ b/src/main/java/org/telegram/telegrambots/TelegramBotsApi.java
@@ -105,7 +105,7 @@
      * @param botToken
      */
     private void setWebhook(String botToken) throws TelegramApiException {
-        if (botToken != null) {
+        if (botToken == null) {
             throw new TelegramApiException("Parameter botToken can not be null");
         }
         setWebhook(extrenalUrl, botToken, pathToCertificate, publicCertificateName);
