diff --git a/graylog2-server/src/main/java/org/graylog2/inputs/raw/tcp/RawTCPInput.java b/graylog2-server/src/main/java/org/graylog2/inputs/raw/tcp/RawTCPInput.java
index 3d5ba9d..acbb707 100644
--- a/graylog2-server/src/main/java/org/graylog2/inputs/raw/tcp/RawTCPInput.java
+++ b/graylog2-server/src/main/java/org/graylog2/inputs/raw/tcp/RawTCPInput.java
@@ -57,7 +57,7 @@
     public void launch() throws MisfireException {
         // Register throughput counter gauges.
         for(Map.Entry<String,Gauge<Long>> gauge : throughputCounter.gauges().entrySet()) {
-            core.metrics().register(MetricRegistry.name(RawUDPInput.class, gauge.getKey()), gauge.getValue());
+            core.metrics().register(MetricRegistry.name(RawTCPInput.class, gauge.getKey()), gauge.getValue());
         }
 
         final ExecutorService bossThreadPool = Executors.newCachedThreadPool(
