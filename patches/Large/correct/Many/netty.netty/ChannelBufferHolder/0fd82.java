diff --git a/transport/src/main/java/io/netty/channel/ChannelBufferHolder.java b/transport/src/main/java/io/netty/channel/ChannelBufferHolder.java
index 4efdb10..de603e9 100644
--- a/transport/src/main/java/io/netty/channel/ChannelBufferHolder.java
+++ b/transport/src/main/java/io/netty/channel/ChannelBufferHolder.java
@@ -184,7 +184,7 @@
             if (msgBuf != null) {
                 return msgBuf.isEmpty();
             } else {
-                return byteBuf.readable();
+                return !byteBuf.readable();
             }
         case 1:
         case 2:
