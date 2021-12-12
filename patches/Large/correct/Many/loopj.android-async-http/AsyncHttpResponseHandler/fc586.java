diff --git a/library/src/com/loopj/android/http/AsyncHttpResponseHandler.java b/library/src/com/loopj/android/http/AsyncHttpResponseHandler.java
index 9bffb1c..d57fba7 100644
--- a/library/src/com/loopj/android/http/AsyncHttpResponseHandler.java
+++ b/library/src/com/loopj/android/http/AsyncHttpResponseHandler.java
@@ -239,7 +239,7 @@
     }
 
     // Interface to AsyncHttpRequest
-    void sendResponseMessage(HttpResponse response) {
+    protected void sendResponseMessage(HttpResponse response) {
         StatusLine status = response.getStatusLine();
         String responseBody = null;
         try {
