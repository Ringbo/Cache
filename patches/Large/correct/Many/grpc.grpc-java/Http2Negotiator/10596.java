diff --git a/netty/src/main/java/io/grpc/transport/netty/Http2Negotiator.java b/netty/src/main/java/io/grpc/transport/netty/Http2Negotiator.java
index 9d20d98..d869ebb 100644
--- a/netty/src/main/java/io/grpc/transport/netty/Http2Negotiator.java
+++ b/netty/src/main/java/io/grpc/transport/netty/Http2Negotiator.java
@@ -206,7 +206,7 @@
     final ChannelInitializer<Channel> initializer = new ChannelInitializer<Channel>() {
       @Override
       public void initChannel(Channel ch) throws Exception {
-        ch.pipeline().addLast(handler);
+        ch.pipeline().addLast(handlers);
       }
     };
     return new Negotiation() {
