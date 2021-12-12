diff --git a/src/com/loopj/android/http/AsyncHttpClient.java b/src/com/loopj/android/http/AsyncHttpClient.java
index 6c661eb..d153bd7 100644
--- a/src/com/loopj/android/http/AsyncHttpClient.java
+++ b/src/com/loopj/android/http/AsyncHttpClient.java
@@ -340,7 +340,7 @@
      * @param responseHandler the response handler instance that should handle the response.
      */
     public void put(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
-        put(null, params, responseHandler);
+        put(null, url, params, responseHandler);
     }
 
     /**
