diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/metrics/MetricsMBeanBase.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/metrics/MetricsMBeanBase.java
index ce5e323..88dd95d 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/metrics/MetricsMBeanBase.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/metrics/MetricsMBeanBase.java
@@ -75,7 +75,8 @@
   private static MetricsRegistry copyMinusHBaseMetrics(final MetricsRegistry mr) {
     MetricsRegistry copy = new MetricsRegistry();
     for (MetricsBase metric : mr.getMetricsList()) {
-      if (metric instanceof MetricsRate || metric instanceof MetricsString) {
+      if (metric instanceof MetricsRate || metric instanceof MetricsString ||
+          metric instanceof MetricsHistogram || metric instanceof ExactCounterMetric) {
         continue;
       }
       copy.add(metric.getName(), metric);
