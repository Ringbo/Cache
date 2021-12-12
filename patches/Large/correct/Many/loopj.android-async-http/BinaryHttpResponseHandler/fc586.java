diff --git a/library/src/com/loopj/android/http/BinaryHttpResponseHandler.java b/library/src/com/loopj/android/http/BinaryHttpResponseHandler.java
index fb8e980..28ebe96 100644
--- a/library/src/com/loopj/android/http/BinaryHttpResponseHandler.java
+++ b/library/src/com/loopj/android/http/BinaryHttpResponseHandler.java
@@ -161,7 +161,7 @@
 
     // Interface to AsyncHttpRequest
     @Override
-    void sendResponseMessage(HttpResponse response) {
+    protected void sendResponseMessage(HttpResponse response) {
         StatusLine status = response.getStatusLine();
         Header[] contentTypeHeaders = response.getHeaders("Content-Type");
         byte[] responseBody = null;
