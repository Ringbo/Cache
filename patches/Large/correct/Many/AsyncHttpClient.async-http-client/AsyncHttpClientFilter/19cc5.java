diff --git a/providers/grizzly/src/main/java/org/asynchttpclient/providers/grizzly/filters/AsyncHttpClientFilter.java b/providers/grizzly/src/main/java/org/asynchttpclient/providers/grizzly/filters/AsyncHttpClientFilter.java
index 4589f12..942dc42 100644
--- a/providers/grizzly/src/main/java/org/asynchttpclient/providers/grizzly/filters/AsyncHttpClientFilter.java
+++ b/providers/grizzly/src/main/java/org/asynchttpclient/providers/grizzly/filters/AsyncHttpClientFilter.java
@@ -262,7 +262,7 @@
 
         if (Utils.requestHasEntityBody(request)) {
             final long contentLength = request.getContentLength();
-            if (contentLength > 0) {
+            if (contentLength >= 0) {
                 requestPacket.setContentLengthLong(contentLength);
                 requestPacket.setChunked(false);
             } else {
