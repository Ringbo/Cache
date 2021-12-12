diff --git a/src/main/java/com/ning/http/client/providers/netty/NettyResponse.java b/src/main/java/com/ning/http/client/providers/netty/NettyResponse.java
index 3c84f91..2ab9966 100644
--- a/src/main/java/com/ning/http/client/providers/netty/NettyResponse.java
+++ b/src/main/java/com/ning/http/client/providers/netty/NettyResponse.java
@@ -80,7 +80,7 @@
 
     public String getResponseBody(String charset) throws IOException {
         String contentType = getContentType();
-        if (contentType != null) {
+        if (contentType != null && charset == null) {
             charset = AsyncHttpProviderUtils.parseCharset(contentType);
         }
 
@@ -124,7 +124,7 @@
 
     public String getResponseBodyExcerpt(int maxLength, String charset) throws IOException {
         String contentType = getContentType();
-        if (contentType != null) {
+        if (contentType != null && charset == null) {
             charset = AsyncHttpProviderUtils.parseCharset(contentType);
         }
 
