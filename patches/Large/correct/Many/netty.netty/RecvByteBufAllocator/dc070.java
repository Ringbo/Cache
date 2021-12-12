diff --git a/transport/src/main/java/io/netty/channel/RecvByteBufAllocator.java b/transport/src/main/java/io/netty/channel/RecvByteBufAllocator.java
index 371207a..cbf3fb3 100644
--- a/transport/src/main/java/io/netty/channel/RecvByteBufAllocator.java
+++ b/transport/src/main/java/io/netty/channel/RecvByteBufAllocator.java
@@ -30,7 +30,7 @@
      */
     Handle newHandle();
 
-    public interface Handle {
+    interface Handle {
         /**
          * Creates a new receive buffer whose capacity is probably large enough to read all inbound data and small
          * enough not to waste its space.
