diff --git a/transport/src/main/java/io/netty/channel/ChannelInboundMessageHandlerAdapter.java b/transport/src/main/java/io/netty/channel/ChannelInboundMessageHandlerAdapter.java
index a5d3ab0..c1a6b3c 100644
--- a/transport/src/main/java/io/netty/channel/ChannelInboundMessageHandlerAdapter.java
+++ b/transport/src/main/java/io/netty/channel/ChannelInboundMessageHandlerAdapter.java
@@ -82,7 +82,7 @@
                 try {
                     if (!isSupported(msg)) {
                         if (out == null) {
-                            out = ctx.nextOutboundMessageBuffer();
+                            out = ctx.nextInboundMessageBuffer();
                         }
                         out.add(msg);
                         unsupportedFound = true;
