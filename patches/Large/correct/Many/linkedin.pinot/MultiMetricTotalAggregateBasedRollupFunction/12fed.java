diff --git a/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/rollup/MultiMetricTotalAggregateBasedRollupFunction.java b/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/rollup/MultiMetricTotalAggregateBasedRollupFunction.java
index a1248d8..1b6e277 100644
--- a/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/rollup/MultiMetricTotalAggregateBasedRollupFunction.java
+++ b/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/rollup/MultiMetricTotalAggregateBasedRollupFunction.java
@@ -57,7 +57,7 @@
         sum += timeSeries.get(timeWindow, metricName).longValue();
       }
       context.set(metricName, sum);
-      if (LOG.isDebugEnabled()) {
+      if (LOGGER.isDebugEnabled()) {
         LOGGER.debug(metricName + " = " + sum);
       }
     }
