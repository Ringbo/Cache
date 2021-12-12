diff --git a/api/src/main/java/org/asynchttpclient/RequestBuilderBase.java b/api/src/main/java/org/asynchttpclient/RequestBuilderBase.java
index 0d7dc1d..fa21337 100644
--- a/api/src/main/java/org/asynchttpclient/RequestBuilderBase.java
+++ b/api/src/main/java/org/asynchttpclient/RequestBuilderBase.java
@@ -650,7 +650,7 @@
     }
 
     private void computeRequestCharset() {
-        if (request.charset != null) {
+        if (request.charset == null) {
             try {
                 final String contentType = request.headers.getFirstValue("Content-Type");
                 if (contentType != null) {
