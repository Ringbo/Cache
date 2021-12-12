diff --git a/handler/src/main/java/io/netty/handler/ssl/OpenSslContext.java b/handler/src/main/java/io/netty/handler/ssl/OpenSslContext.java
index 67de79d..3758e4f 100644
--- a/handler/src/main/java/io/netty/handler/ssl/OpenSslContext.java
+++ b/handler/src/main/java/io/netty/handler/ssl/OpenSslContext.java
@@ -547,7 +547,7 @@
 
             ByteBuf buffer = allocator.directBuffer(content.readableBytes());
             try {
-                buffer.writeBytes(content);
+                buffer.writeBytes(content, content.readerIndex(), content.readableBytes());
                 return newBIO(buffer.retainedSlice());
             } finally {
                 try {
