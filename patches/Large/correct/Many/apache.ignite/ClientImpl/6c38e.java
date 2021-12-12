diff --git a/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/ClientImpl.java b/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/ClientImpl.java
index 8928f28..0f5f741 100644
--- a/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/ClientImpl.java
+++ b/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/ClientImpl.java
@@ -1920,7 +1920,7 @@
 
                         TcpDiscoveryHeartbeatMessage.MetricsSet metricsSet = e.getValue();
 
-                        Map<Integer, CacheMetrics> cacheMetrics = msg.hasCacheMetrics() ?
+                        Map<Integer, CacheMetrics> cacheMetrics = msg.hasCacheMetrics(nodeId) ?
                             msg.cacheMetrics().get(nodeId) : Collections.<Integer, CacheMetrics>emptyMap();
 
                         updateMetrics(nodeId, metricsSet.metrics(), cacheMetrics, tstamp);
