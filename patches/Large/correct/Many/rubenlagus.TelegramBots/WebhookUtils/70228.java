diff --git a/telegrambots/src/main/java/org/telegram/telegrambots/util/WebhookUtils.java b/telegrambots/src/main/java/org/telegram/telegrambots/util/WebhookUtils.java
index 9d59fc7..7db6f89 100644
--- a/telegrambots/src/main/java/org/telegram/telegrambots/util/WebhookUtils.java
+++ b/telegrambots/src/main/java/org/telegram/telegrambots/util/WebhookUtils.java
@@ -53,7 +53,7 @@
       }
       HttpEntity multipart = builder.build();
       httppost.setEntity(multipart);
-      try (CloseableHttpResponse response = httpclient.execute(httppost)) {
+      try (CloseableHttpResponse response = httpclient.execute(httppost, botOptions.getHttpContext())) {
         HttpEntity ht = response.getEntity();
         BufferedHttpEntity buf = new BufferedHttpEntity(ht);
         String responseContent = EntityUtils.toString(buf, StandardCharsets.UTF_8);
