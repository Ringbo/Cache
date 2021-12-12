diff --git a/src/main/java/com/ning/http/client/providers/jdk/JDKResponse.java b/src/main/java/com/ning/http/client/providers/jdk/JDKResponse.java
index 98642a6..c14b1aa 100644
--- a/src/main/java/com/ning/http/client/providers/jdk/JDKResponse.java
+++ b/src/main/java/com/ning/http/client/providers/jdk/JDKResponse.java
@@ -77,7 +77,7 @@
 
     public String getResponseBody(String charset) throws IOException {
         String contentType = getContentType();
-        if (contentType != null) {
+        if (contentType != null && charset == null) {
             charset = AsyncHttpProviderUtils.parseCharset(contentType);
         }
 
@@ -166,7 +166,7 @@
 
     public String getResponseBodyExcerpt(int maxLength, String charset) throws IOException {
         String contentType = getContentType();
-        if (contentType != null) {
+        if (contentType != null && charset == null) {
             charset = AsyncHttpProviderUtils.parseCharset(contentType);
         }
 
