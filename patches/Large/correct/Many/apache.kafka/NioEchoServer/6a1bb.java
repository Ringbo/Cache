diff --git a/clients/src/test/java/org/apache/kafka/common/network/NioEchoServer.java b/clients/src/test/java/org/apache/kafka/common/network/NioEchoServer.java
index bd212fd..7996e59 100644
--- a/clients/src/test/java/org/apache/kafka/common/network/NioEchoServer.java
+++ b/clients/src/test/java/org/apache/kafka/common/network/NioEchoServer.java
@@ -95,7 +95,7 @@
         if (channelBuilder == null)
             channelBuilder = ChannelBuilders.serverChannelBuilder(listenerName, false, securityProtocol, config, credentialCache, tokenCache);
         this.metrics = new Metrics();
-        this.selector = new Selector(5000, failedAuthenticationDelayMs, metrics, time, "MetricGroup", channelBuilder, new LogContext());
+        this.selector = new Selector(10000, failedAuthenticationDelayMs, metrics, time, "MetricGroup", channelBuilder, new LogContext());
         acceptorThread = new AcceptorThread();
     }
 
