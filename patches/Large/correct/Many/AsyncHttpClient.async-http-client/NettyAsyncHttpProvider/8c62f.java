diff --git a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
index 1883956..9d49865 100644
--- a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
+++ b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
@@ -377,7 +377,7 @@
                     .append(getPort(uri)).toString());
             nettyRequest = new DefaultHttpRequest(HttpVersion.HTTP_1_0, m, uri.toString());
         } else if (config.getProxyServer() != null || request.getProxyServer() != null) {
-            nettyRequest = new DefaultHttpRequest(HttpVersion.HTTP_1_1, m, uri.getPath());
+            nettyRequest = new DefaultHttpRequest(HttpVersion.HTTP_1_1, m, uri.toString());
         } else {
             StringBuilder path = new StringBuilder(uri.getRawPath());
             if (uri.getQuery() != null) {
