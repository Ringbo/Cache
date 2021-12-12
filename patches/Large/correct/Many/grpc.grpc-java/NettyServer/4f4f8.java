diff --git a/netty/src/main/java/io/grpc/transport/netty/NettyServer.java b/netty/src/main/java/io/grpc/transport/netty/NettyServer.java
index e2f2b9f..f4df9f6 100644
--- a/netty/src/main/java/io/grpc/transport/netty/NettyServer.java
+++ b/netty/src/main/java/io/grpc/transport/netty/NettyServer.java
@@ -121,7 +121,7 @@
 
   @Override
   public void shutdown() {
-    if (channel == null || channel.isOpen()) {
+    if (channel == null || !channel.isOpen()) {
       return;
     }
     channel.close().addListener(new ChannelFutureListener() {
