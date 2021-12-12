diff --git a/solr/core/src/test/org/apache/solr/metrics/JvmMetricsTest.java b/solr/core/src/test/org/apache/solr/metrics/JvmMetricsTest.java
index 77c4e1a..6d597cb 100644
--- a/solr/core/src/test/org/apache/solr/metrics/JvmMetricsTest.java
+++ b/solr/core/src/test/org/apache/solr/metrics/JvmMetricsTest.java
@@ -44,7 +44,7 @@
     assertTrue(metrics.size() > 0);
     for (String metric : OperatingSystemMetricSet.METRICS) {
       Gauge<?> gauge = (Gauge<?>)metrics.get(metric);
-      if (gauge == null) { // some are optional depending on OS
+      if (gauge == null || gauge.getValue() == null) { // some are optional depending on OS
         continue;
       }
       double value = ((Number)gauge.getValue()).doubleValue();
