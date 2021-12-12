diff --git a/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/ServerImpl.java b/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/ServerImpl.java
index 204b685..c791333 100644
--- a/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/ServerImpl.java
+++ b/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/ServerImpl.java
@@ -4927,7 +4927,7 @@
 
                         TcpDiscoveryHeartbeatMessage.MetricsSet metricsSet = e.getValue();
 
-                        Map<Integer, CacheMetrics> cacheMetrics = msg.hasCacheMetrics() ?
+                        Map<Integer, CacheMetrics> cacheMetrics = msg.hasCacheMetrics(nodeId) ?
                             msg.cacheMetrics().get(nodeId) : Collections.<Integer, CacheMetrics>emptyMap();
 
                         updateMetrics(nodeId, metricsSet.metrics(), cacheMetrics, tstamp);
