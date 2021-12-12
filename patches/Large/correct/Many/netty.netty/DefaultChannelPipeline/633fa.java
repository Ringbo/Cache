diff --git a/transport/src/main/java/io/netty/channel/DefaultChannelPipeline.java b/transport/src/main/java/io/netty/channel/DefaultChannelPipeline.java
index a891893..d0425ac 100644
--- a/transport/src/main/java/io/netty/channel/DefaultChannelPipeline.java
+++ b/transport/src/main/java/io/netty/channel/DefaultChannelPipeline.java
@@ -742,7 +742,7 @@
             notifyHandlerException(t);
         } finally {
             ChannelBufferHolder<Object> inbound = ctx.inbound();
-            if (inbound.isEmpty() && inbound.hasByteBuffer()) {
+            if (!inbound.isBypass() && inbound.isEmpty() && inbound.hasByteBuffer()) {
                 inbound.byteBuffer().discardReadBytes();
             }
         }
