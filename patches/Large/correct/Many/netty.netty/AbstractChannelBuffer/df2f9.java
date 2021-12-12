diff --git a/src/main/java/org/jboss/netty/buffer/AbstractChannelBuffer.java b/src/main/java/org/jboss/netty/buffer/AbstractChannelBuffer.java
index 9c9af64..1b326e5 100644
--- a/src/main/java/org/jboss/netty/buffer/AbstractChannelBuffer.java
+++ b/src/main/java/org/jboss/netty/buffer/AbstractChannelBuffer.java
@@ -267,7 +267,7 @@
         if (length == 0) {
             return ChannelBuffers.EMPTY_BUFFER;
         }
-        ChannelBuffer buf = ChannelBuffers.buffer(length);
+        ChannelBuffer buf = ChannelBuffers.buffer(order(), length);
         buf.writeBytes(this, readerIndex, length);
         readerIndex += length;
         return buf;
