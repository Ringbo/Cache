diff --git a/dubbo-remoting/dubbo-remoting-netty/src/main/java/org/apache/dubbo/remoting/transport/netty/NettyClient.java b/dubbo-remoting/dubbo-remoting-netty/src/main/java/org/apache/dubbo/remoting/transport/netty/NettyClient.java
index a91aa58..574402f 100644
--- a/dubbo-remoting/dubbo-remoting-netty/src/main/java/org/apache/dubbo/remoting/transport/netty/NettyClient.java
+++ b/dubbo-remoting/dubbo-remoting-netty/src/main/java/org/apache/dubbo/remoting/transport/netty/NettyClient.java
@@ -67,7 +67,7 @@
         // @see org.jboss.netty.channel.socket.SocketChannelConfig
         bootstrap.setOption("keepAlive", true);
         bootstrap.setOption("tcpNoDelay", true);
-        bootstrap.setOption("connectTimeoutMillis", getTimeout());
+        bootstrap.setOption("connectTimeoutMillis", getConnectTimeout());
         final NettyHandler nettyHandler = new NettyHandler(getUrl(), this);
         bootstrap.setPipelineFactory(new ChannelPipelineFactory() {
             @Override
