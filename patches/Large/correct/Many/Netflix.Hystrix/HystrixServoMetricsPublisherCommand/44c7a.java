diff --git a/hystrix-contrib/hystrix-servo-metrics-publisher/src/main/java/com/netflix/hystrix/contrib/servopublisher/HystrixServoMetricsPublisherCommand.java b/hystrix-contrib/hystrix-servo-metrics-publisher/src/main/java/com/netflix/hystrix/contrib/servopublisher/HystrixServoMetricsPublisherCommand.java
index 7fe95cb..51760f5 100644
--- a/hystrix-contrib/hystrix-servo-metrics-publisher/src/main/java/com/netflix/hystrix/contrib/servopublisher/HystrixServoMetricsPublisherCommand.java
+++ b/hystrix-contrib/hystrix-servo-metrics-publisher/src/main/java/com/netflix/hystrix/contrib/servopublisher/HystrixServoMetricsPublisherCommand.java
@@ -205,7 +205,7 @@
         monitors.add(new GaugeMetric(MonitorConfig.builder("latencyExecute_percentile_75").build()) {
             @Override
             public Number getValue() {
-                return metrics.getExecutionTimePercentile(90);
+                return metrics.getExecutionTimePercentile(75);
             }
         });
         monitors.add(new GaugeMetric(MonitorConfig.builder("latencyExecute_percentile_90").build()) {
