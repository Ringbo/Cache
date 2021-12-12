diff --git a/src/main/java/com/corundumstudio/socketio/handler/AuthorizeHandler.java b/src/main/java/com/corundumstudio/socketio/handler/AuthorizeHandler.java
index a08f61e..b7a2dfc 100644
--- a/src/main/java/com/corundumstudio/socketio/handler/AuthorizeHandler.java
+++ b/src/main/java/com/corundumstudio/socketio/handler/AuthorizeHandler.java
@@ -95,7 +95,7 @@
             if (!configuration.isAllowCustomRequests()
                     && !queryDecoder.path().startsWith(connectPath)) {
                 HttpResponse res = new DefaultHttpResponse(HTTP_1_1, HttpResponseStatus.BAD_REQUEST);
-                channel.write(res).addListener(ChannelFutureListener.CLOSE);
+                channel.writeAndFlush(res).addListener(ChannelFutureListener.CLOSE);
                 req.release();
                 log.warn("Blocked wrong request! url: {}, ip: {}", queryDecoder.path(), channel.remoteAddress());
                 return;
