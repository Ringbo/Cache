diff --git a/src/main/java/org/jboss/netty/buffer/ChannelBufferInputStream.java b/src/main/java/org/jboss/netty/buffer/ChannelBufferInputStream.java
index 980a594..10ec5d4 100644
--- a/src/main/java/org/jboss/netty/buffer/ChannelBufferInputStream.java
+++ b/src/main/java/org/jboss/netty/buffer/ChannelBufferInputStream.java
@@ -232,7 +232,7 @@
 
     private void checkAvailable(int fieldSize) throws IOException {
         if (fieldSize < 0) {
-            throw new IllegalArgumentException();
+            throw new IndexOutOfBoundsException();
         }
         if (fieldSize > available()) {
             throw new EOFException();
