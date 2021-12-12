diff --git a/buffer/src/main/java/io/netty/buffer/CompositeByteBuf.java b/buffer/src/main/java/io/netty/buffer/CompositeByteBuf.java
index 18710d9..bf59be8 100644
--- a/buffer/src/main/java/io/netty/buffer/CompositeByteBuf.java
+++ b/buffer/src/main/java/io/netty/buffer/CompositeByteBuf.java
@@ -592,7 +592,7 @@
      * less than zero, or larger than {@code capacity()}
      */
     public ByteBuf getBufferFor(int index) throws IndexOutOfBoundsException {
-        if (index < 0 || index > capacity()) {
+        if (index < 0 || index >= capacity()) {
             throw new IndexOutOfBoundsException("Invalid index: " + index
                     + " - Bytes needed: " + index + ", maximum is "
                     + capacity());
