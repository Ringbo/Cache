diff --git a/components/camel-netty4/src/test/java/org/apache/camel/component/netty4/NettyConsumerClientModeReconnectTest.java b/components/camel-netty4/src/test/java/org/apache/camel/component/netty4/NettyConsumerClientModeReconnectTest.java
index 6db9780..c09ca6d 100644
--- a/components/camel-netty4/src/test/java/org/apache/camel/component/netty4/NettyConsumerClientModeReconnectTest.java
+++ b/components/camel-netty4/src/test/java/org/apache/camel/component/netty4/NettyConsumerClientModeReconnectTest.java
@@ -100,7 +100,7 @@
         private EventLoopGroup bossGroup;
         private EventLoopGroup workerGroup;
 
-        public MyServer(int port) {
+        MyServer(int port) {
             this.port = port;
         }
 
