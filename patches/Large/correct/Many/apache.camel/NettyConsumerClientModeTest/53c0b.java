diff --git a/components/camel-netty4/src/test/java/org/apache/camel/component/netty4/NettyConsumerClientModeTest.java b/components/camel-netty4/src/test/java/org/apache/camel/component/netty4/NettyConsumerClientModeTest.java
index 88a219c..81632ec 100644
--- a/components/camel-netty4/src/test/java/org/apache/camel/component/netty4/NettyConsumerClientModeTest.java
+++ b/components/camel-netty4/src/test/java/org/apache/camel/component/netty4/NettyConsumerClientModeTest.java
@@ -107,7 +107,7 @@
         }
         
         public void shutdown() {
-            channel.close();
+            channel.disconnect();
             bossGroup.shutdownGracefully();
             workerGroup.shutdownGracefully();
         }
