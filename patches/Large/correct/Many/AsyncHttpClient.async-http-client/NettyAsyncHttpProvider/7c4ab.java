diff --git a/providers/netty/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java b/providers/netty/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
index f59f0f3..fe3f05c 100644
--- a/providers/netty/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
+++ b/providers/netty/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
@@ -594,7 +594,7 @@
             nettyRequest = new DefaultHttpRequest(HttpVersion.HTTP_1_0, m, AsyncHttpProviderUtils.getAuthority(uri));
         } else {
             String path = null;
-            if (proxyServer != null)
+            if (proxyServer != null && !isSecure(uri))
                 path = uri.toString();
             else if (uri.getRawQuery() != null)
                 path = uri.getRawPath() + "?" + uri.getRawQuery();
