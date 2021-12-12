diff --git a/graylog2-shared/src/main/java/org/graylog2/shared/rest/resources/system/ThroughputResource.java b/graylog2-shared/src/main/java/org/graylog2/shared/rest/resources/system/ThroughputResource.java
index 09a33e0..c774535 100644
--- a/graylog2-shared/src/main/java/org/graylog2/shared/rest/resources/system/ThroughputResource.java
+++ b/graylog2-shared/src/main/java/org/graylog2/shared/rest/resources/system/ThroughputResource.java
@@ -57,10 +57,10 @@
         final SortedMap<String, Gauge> gauges = metricRegistry.getGauges(MetricUtils.filterSingleMetric(
                 GlobalMetricNames.OUTPUT_THROUGHPUT_RATE));
         final Gauge gauge = Iterables.getOnlyElement(gauges.values(), null);
-        if (gauge == null || !(gauge.getValue() instanceof Long)) {
+        if (gauge == null || !(gauge.getValue() instanceof Number)) {
             return Throughput.create(0);
         } else {
-            return Throughput.create((Long) gauge.getValue());
+            return Throughput.create(((Number) gauge.getValue()).longValue());
         }
     }
 }
