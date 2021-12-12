diff --git a/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/rollup/TotalAggregateBasedRollupFunction.java b/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/rollup/TotalAggregateBasedRollupFunction.java
index ba90a52..c381051 100644
--- a/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/rollup/TotalAggregateBasedRollupFunction.java
+++ b/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/rollup/TotalAggregateBasedRollupFunction.java
@@ -34,7 +34,7 @@
     for (Long timeWindow : timeWindowSet) {
       sum += timeSeries.get(timeWindow, metricName).longValue();
     }
-    if (LOG.isDebugEnabled()) {
+    if (LOGGER.isDebugEnabled()) {
       LOGGER.debug("sum = " + sum);
     }
     return sum  >= totalAggregateThreshold;
