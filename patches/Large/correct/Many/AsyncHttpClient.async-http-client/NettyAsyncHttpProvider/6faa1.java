diff --git a/providers/netty/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java b/providers/netty/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
index c36bdc1..d63db0c 100644
--- a/providers/netty/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
+++ b/providers/netty/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
@@ -1988,7 +1988,7 @@
                 String location = response.getHeader(HttpHeaders.Names.LOCATION);
                 URI uri = AsyncHttpProviderUtils.getRedirectUri(future.getURI(), location);
                 boolean stripQueryString = config.isRemoveQueryParamOnRedirect();
-                if (!uri.toString().equalsIgnoreCase(future.getURI().toString())) {
+                if (!uri.toString().equals(future.getURI().toString())) {
                     final RequestBuilder nBuilder = stripQueryString ?
                             new RequestBuilder(future.getRequest()).setQueryParameters(null)
                             : new RequestBuilder(future.getRequest());
