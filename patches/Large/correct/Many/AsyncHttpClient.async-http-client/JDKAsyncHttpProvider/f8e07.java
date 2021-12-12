diff --git a/src/main/java/com/ning/http/client/providers/jdk/JDKAsyncHttpProvider.java b/src/main/java/com/ning/http/client/providers/jdk/JDKAsyncHttpProvider.java
index c341073..1a7bb97 100644
--- a/src/main/java/com/ning/http/client/providers/jdk/JDKAsyncHttpProvider.java
+++ b/src/main/java/com/ning/http/client/providers/jdk/JDKAsyncHttpProvider.java
@@ -551,7 +551,7 @@
             } else if (config.getUserAgent() != null) {
                 urlConnection.setRequestProperty("User-Agent", config.getUserAgent());
             } else {
-                urlConnection.setRequestProperty("User-Agent", AsyncHttpProviderUtils.constructUserAgent(NettyAsyncHttpProvider.class));
+                urlConnection.setRequestProperty("User-Agent", AsyncHttpProviderUtils.constructUserAgent(JDKAsyncHttpProvider.class));
             }
 
             if (request.getCookies() != null && !request.getCookies().isEmpty()) {
