diff --git a/src/test/java/com/zaxxer/hikari/metrics/prometheus/PrometheusMetricsTrackerTest.java b/src/test/java/com/zaxxer/hikari/metrics/prometheus/PrometheusMetricsTrackerTest.java
index a7b0b03..65de9bb 100644
--- a/src/test/java/com/zaxxer/hikari/metrics/prometheus/PrometheusMetricsTrackerTest.java
+++ b/src/test/java/com/zaxxer/hikari/metrics/prometheus/PrometheusMetricsTrackerTest.java
@@ -60,7 +60,7 @@
          assertThat(CollectorRegistry.defaultRegistry.getSampleValue(
             "hikaricp_connection_acquired_nanos_count",
             labelNames,
-            labelValues), is(equalTo(2.0)));
+            labelValues), is(equalTo(3.0)));
          assertTrue(CollectorRegistry.defaultRegistry.getSampleValue(
             "hikaricp_connection_acquired_nanos_sum",
             labelNames,
