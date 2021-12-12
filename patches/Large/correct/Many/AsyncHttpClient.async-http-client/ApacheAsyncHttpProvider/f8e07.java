diff --git a/src/main/java/com/ning/http/client/providers/apache/ApacheAsyncHttpProvider.java b/src/main/java/com/ning/http/client/providers/apache/ApacheAsyncHttpProvider.java
index d8106dc..a6a8ac7 100644
--- a/src/main/java/com/ning/http/client/providers/apache/ApacheAsyncHttpProvider.java
+++ b/src/main/java/com/ning/http/client/providers/apache/ApacheAsyncHttpProvider.java
@@ -375,7 +375,7 @@
         } else if (config.getUserAgent() != null) {
             method.setRequestHeader("User-Agent", config.getUserAgent());
         } else {
-            method.setRequestHeader("User-Agent", AsyncHttpProviderUtils.constructUserAgent(NettyAsyncHttpProvider.class));
+            method.setRequestHeader("User-Agent", AsyncHttpProviderUtils.constructUserAgent(ApacheAsyncHttpProvider.class));
         }
 
         if (config.isCompressionEnabled()) {
