diff --git a/components/camel-netty4/src/test/java/org/apache/camel/component/netty4/NettyConsumerClientModeTest.java b/components/camel-netty4/src/test/java/org/apache/camel/component/netty4/NettyConsumerClientModeTest.java
index 81632ec..888e00a 100644
--- a/components/camel-netty4/src/test/java/org/apache/camel/component/netty4/NettyConsumerClientModeTest.java
+++ b/components/camel-netty4/src/test/java/org/apache/camel/component/netty4/NettyConsumerClientModeTest.java
@@ -89,7 +89,7 @@
         private EventLoopGroup bossGroup;
         private EventLoopGroup workerGroup;
         
-        public MyServer(int port) {
+        MyServer(int port) {
             this.port = port;
         }
 
