diff --git a/src/main/java/com/zaxxer/hikari/metrics/micrometer/MicrometerMetricsTracker.java b/src/main/java/com/zaxxer/hikari/metrics/micrometer/MicrometerMetricsTracker.java
index 98391e6..a0839b1 100644
--- a/src/main/java/com/zaxxer/hikari/metrics/micrometer/MicrometerMetricsTracker.java
+++ b/src/main/java/com/zaxxer/hikari/metrics/micrometer/MicrometerMetricsTracker.java
@@ -54,7 +54,7 @@
 
       this.connectionUsage = meterRegistry
          .summaryBuilder(METRIC_NAME_USAGE)
-         .tags(poolName, METRIC_CATEGORY)
+         .tags(METRIC_CATEGORY, poolName)
          .quantiles(WindowSketchQuantiles.quantiles(0.5, 0.95).create())
          .histogram(buckets(linear(0, 10, 20), TimeUnit.MILLISECONDS))
          .create();
