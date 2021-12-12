diff --git a/languagetool-server/src/main/java/org/languagetool/server/LanguageToolHttpHandler.java b/languagetool-server/src/main/java/org/languagetool/server/LanguageToolHttpHandler.java
index 98eed45..0281ad2 100644
--- a/languagetool-server/src/main/java/org/languagetool/server/LanguageToolHttpHandler.java
+++ b/languagetool-server/src/main/java/org/languagetool/server/LanguageToolHttpHandler.java
@@ -119,7 +119,7 @@
       if (e instanceof TextTooLongException) {
         errorCode = HttpURLConnection.HTTP_ENTITY_TOO_LARGE;
         response = e.getMessage();
-      } else if (e instanceof AuthException) {
+      } else if (e instanceof AuthException ||  e.getCause() != null && e.getCause() instanceof AuthException) {
         errorCode = HttpURLConnection.HTTP_FORBIDDEN;
         response = e.getMessage();
       } else if (e instanceof IllegalArgumentException) {
