diff --git a/AndroidAsync/src/com/koushikdutta/async/http/server/AsyncHttpServerResponseImpl.java b/AndroidAsync/src/com/koushikdutta/async/http/server/AsyncHttpServerResponseImpl.java
index 44886b6..0e1535e 100644
--- a/AndroidAsync/src/com/koushikdutta/async/http/server/AsyncHttpServerResponseImpl.java
+++ b/AndroidAsync/src/com/koushikdutta/async/http/server/AsyncHttpServerResponseImpl.java
@@ -95,7 +95,7 @@
         if (mContentLength < 0) {
             String contentLength = mRawHeaders.get("Content-Length");
             if (!TextUtils.isEmpty(contentLength))
-                mContentLength = Integer.valueOf(contentLength);
+                mContentLength = Long.valueOf(contentLength);
         }
         if (mContentLength < 0 && canUseChunked) {
             mRawHeaders.set("Transfer-Encoding", "Chunked");
