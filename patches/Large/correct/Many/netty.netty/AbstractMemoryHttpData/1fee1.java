diff --git a/codec-http/src/main/java/io/netty/handler/codec/http/multipart/AbstractMemoryHttpData.java b/codec-http/src/main/java/io/netty/handler/codec/http/multipart/AbstractMemoryHttpData.java
index 4e21627..e2c4fd5 100644
--- a/codec-http/src/main/java/io/netty/handler/codec/http/multipart/AbstractMemoryHttpData.java
+++ b/codec-http/src/main/java/io/netty/handler/codec/http/multipart/AbstractMemoryHttpData.java
@@ -103,7 +103,7 @@
                 cbb.addComponent(buffer);
                 cbb.writerIndex(cbb.writerIndex() + buffer.readableBytes());
             } else {
-                CompositeByteBuf cbb = compositeBuffer();
+                CompositeByteBuf cbb = compositeBuffer(Integer.MAX_VALUE);
                 cbb.addComponents(byteBuf, buffer);
                 cbb.writerIndex(byteBuf.readableBytes() + buffer.readableBytes());
                 byteBuf = cbb;
@@ -142,7 +142,7 @@
         if (byteBuf != null) {
             byteBuf.release();
         }
-        byteBuf = wrappedBuffer(byteBuffer);
+        byteBuf = wrappedBuffer(Integer.MAX_VALUE, byteBuffer);
         size = newsize;
         completed = true;
     }
