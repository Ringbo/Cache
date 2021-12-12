diff --git a/dubbo-remoting/dubbo-remoting-netty4/src/main/java/org/apache/dubbo/remoting/transport/netty4/NettyClient.java b/dubbo-remoting/dubbo-remoting-netty4/src/main/java/org/apache/dubbo/remoting/transport/netty4/NettyClient.java
index 464087e..7ba4a63 100644
--- a/dubbo-remoting/dubbo-remoting-netty4/src/main/java/org/apache/dubbo/remoting/transport/netty4/NettyClient.java
+++ b/dubbo-remoting/dubbo-remoting-netty4/src/main/java/org/apache/dubbo/remoting/transport/netty4/NettyClient.java
@@ -78,7 +78,7 @@
 
             @Override
             protected void initChannel(Channel ch) throws Exception {
-                int heartbeatInterval = UrlUtils.getIdleTimeout(getUrl());
+                int heartbeatInterval = UrlUtils.getHeartbeat(getUrl());
                 NettyCodecAdapter adapter = new NettyCodecAdapter(getCodec(), getUrl(), NettyClient.this);
                 ch.pipeline()//.addLast("logging",new LoggingHandler(LogLevel.INFO))//for debug
                         .addLast("decoder", adapter.getDecoder())
