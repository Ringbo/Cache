diff --git a/transport-sctp/src/main/java/io/netty/handler/codec/sctp/SctpOutboundByteStreamHandler.java b/transport-sctp/src/main/java/io/netty/handler/codec/sctp/SctpOutboundByteStreamHandler.java
index 1cd098b..453eb9e 100644
--- a/transport-sctp/src/main/java/io/netty/handler/codec/sctp/SctpOutboundByteStreamHandler.java
+++ b/transport-sctp/src/main/java/io/netty/handler/codec/sctp/SctpOutboundByteStreamHandler.java
@@ -53,6 +53,6 @@
 
     @Override
     protected void encode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
-        out.add(new SctpMessage(streamIdentifier, protocolIdentifier, unordered, msg.retain()));
+        out.add(new SctpMessage(protocolIdentifier, streamIdentifier, unordered, msg.retain()));
     }
 }
