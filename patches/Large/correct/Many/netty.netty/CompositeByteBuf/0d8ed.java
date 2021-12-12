diff --git a/buffer/src/main/java/io/netty/buffer/CompositeByteBuf.java b/buffer/src/main/java/io/netty/buffer/CompositeByteBuf.java
index a703a8a..6752930 100644
--- a/buffer/src/main/java/io/netty/buffer/CompositeByteBuf.java
+++ b/buffer/src/main/java/io/netty/buffer/CompositeByteBuf.java
@@ -575,7 +575,7 @@
         dst.writerIndex(dst.capacity());
     }
     
-    public ByteBuf getBufferFor(int index) throws IOException {
+    public ByteBuf getBufferFor(int index) throws IndexOutOfBoundsException {
         if (index < 0 || index > capacity()) {
             throw new IndexOutOfBoundsException("Invalid index: " + index
                     + " - Bytes needed: " + (index) + ", maximum is "
