diff --git a/codec/src/main/java/io/netty/handler/codec/compression/ByteBufChecksum.java b/codec/src/main/java/io/netty/handler/codec/compression/ByteBufChecksum.java
index bd630f7..b825b86 100644
--- a/codec/src/main/java/io/netty/handler/codec/compression/ByteBufChecksum.java
+++ b/codec/src/main/java/io/netty/handler/codec/compression/ByteBufChecksum.java
@@ -51,7 +51,7 @@
     private static Method updateByteBuffer(Checksum checksum) {
         try {
             Method method = checksum.getClass().getDeclaredMethod("update", ByteBuffer.class);
-            method.invoke(method, ByteBuffer.allocate(1));
+            method.invoke(checksum, ByteBuffer.allocate(1));
             return method;
         } catch (Throwable ignore) {
             return null;
