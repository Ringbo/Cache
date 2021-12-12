diff --git a/library/src/main/java/com/loopj/android/http/SaxAsyncHttpResponseHandler.java b/library/src/main/java/com/loopj/android/http/SaxAsyncHttpResponseHandler.java
index db658c9..07ae057 100644
--- a/library/src/main/java/com/loopj/android/http/SaxAsyncHttpResponseHandler.java
+++ b/library/src/main/java/com/loopj/android/http/SaxAsyncHttpResponseHandler.java
@@ -144,6 +144,6 @@
     @Override
     public void onFailure(int statusCode, Header[] headers,
                           byte[] responseBody, Throwable error) {
-        onSuccess(statusCode, headers, handler);
+        onFailure(statusCode, headers, handler);
     }
 }
