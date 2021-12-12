diff --git a/src/main/java/com/ning/http/client/providers/apache/ApacheResponse.java b/src/main/java/com/ning/http/client/providers/apache/ApacheResponse.java
index 083561b..e0890d2 100644
--- a/src/main/java/com/ning/http/client/providers/apache/ApacheResponse.java
+++ b/src/main/java/com/ning/http/client/providers/apache/ApacheResponse.java
@@ -74,7 +74,7 @@
 
     public String getResponseBody(String charset) throws IOException {
         String contentType = getContentType();
-        if (contentType != null) {
+        if (contentType != null && charset == null) {
             charset = AsyncHttpProviderUtils.parseCharset(contentType);
         }
 
@@ -113,7 +113,7 @@
     
     public String getResponseBodyExcerpt(int maxLength, String charset) throws IOException {
         String contentType = getContentType();
-        if (contentType != null) {
+        if (contentType != null && charset == null) {
             charset = AsyncHttpProviderUtils.parseCharset(contentType);
         }
 
