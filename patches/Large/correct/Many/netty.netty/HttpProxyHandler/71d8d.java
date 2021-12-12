diff --git a/handler-proxy/src/main/java/io/netty/handler/proxy/HttpProxyHandler.java b/handler-proxy/src/main/java/io/netty/handler/proxy/HttpProxyHandler.java
index 278eb10..6979295 100644
--- a/handler-proxy/src/main/java/io/netty/handler/proxy/HttpProxyHandler.java
+++ b/handler-proxy/src/main/java/io/netty/handler/proxy/HttpProxyHandler.java
@@ -171,7 +171,7 @@
     }
 
     @Override
-    protected boolean handleResponse(ChannelHandlerContext ctx, Object response) throws HttpProxyConnectException {
+    protected boolean handleResponse(ChannelHandlerContext ctx, Object response) throws Exception {
         if (response instanceof HttpResponse) {
             if (status != null) {
                 throw new HttpProxyConnectException(exceptionMessage("too many responses"), /*headers=*/ null);
