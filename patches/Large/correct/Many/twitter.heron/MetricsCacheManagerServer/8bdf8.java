diff --git a/heron/metricscachemgr/src/java/com/twitter/heron/metricscachemgr/MetricsCacheManagerServer.java b/heron/metricscachemgr/src/java/com/twitter/heron/metricscachemgr/MetricsCacheManagerServer.java
index 0e60054..6469a85 100644
--- a/heron/metricscachemgr/src/java/com/twitter/heron/metricscachemgr/MetricsCacheManagerServer.java
+++ b/heron/metricscachemgr/src/java/com/twitter/heron/metricscachemgr/MetricsCacheManagerServer.java
@@ -85,7 +85,7 @@
         + channel.socket().getRemoteSocketAddress());
 
     if (message instanceof TopologyMaster.PublishMetrics) {
-      LOG.info("received message " + (TopologyMaster.PublishMetrics) message);
+      LOG.fine("received message " + (TopologyMaster.PublishMetrics) message);
       metricsCache.addMetrics((TopologyMaster.PublishMetrics) message);
     } else {
       LOG.severe("Unknown kind of message received "
