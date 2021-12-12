diff --git a/src/main/java/org/jboss/netty/buffer/ChannelBuffers.java b/src/main/java/org/jboss/netty/buffer/ChannelBuffers.java
index 9f3cf48..e7c8698 100644
--- a/src/main/java/org/jboss/netty/buffer/ChannelBuffers.java
+++ b/src/main/java/org/jboss/netty/buffer/ChannelBuffers.java
@@ -293,7 +293,7 @@
             return EMPTY_BUFFER;
         }
         if (!buffer.isReadOnly() && buffer.hasArray()) {
-            return wrappedBuffer(buffer.array(), buffer.arrayOffset(),buffer.remaining());
+            return wrappedBuffer(buffer.order(), buffer.array(), buffer.arrayOffset(),buffer.remaining());
         } else {
             return new ByteBufferBackedChannelBuffer(buffer);
         }
