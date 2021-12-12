diff --git a/zuul-core/src/main/java/com/netflix/zuul/netty/server/ClientRequestReceiver.java b/zuul-core/src/main/java/com/netflix/zuul/netty/server/ClientRequestReceiver.java
index dcfb325..e83a633 100644
--- a/zuul-core/src/main/java/com/netflix/zuul/netty/server/ClientRequestReceiver.java
+++ b/zuul-core/src/main/java/com/netflix/zuul/netty/server/ClientRequestReceiver.java
@@ -103,7 +103,7 @@
                         + ", info = " + ChannelUtils.channelInfoForLogging(ctx.channel());
                 String causeMsg = String.valueOf(clientRequest.decoderResult().cause());
                 clientRequest = null;
-                final ZuulException ze = new ZuulException(errorMsg, causeMsg);
+                final ZuulException ze = new ZuulException(errorMsg, causeMsg, true);
                 ze.setStatusCode(400);
                 throw ze;
             }
