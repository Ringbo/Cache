diff --git a/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/rollup/phase1/RollupPhaseOneJob.java b/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/rollup/phase1/RollupPhaseOneJob.java
index df9194a..9c07533 100644
--- a/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/rollup/phase1/RollupPhaseOneJob.java
+++ b/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/rollup/phase1/RollupPhaseOneJob.java
@@ -109,7 +109,7 @@
         throws IOException, InterruptedException {
       DimensionKey dimensionKey;
       dimensionKey = DimensionKey.fromBytes(dimensionKeyBytes.getBytes());
-      if (LOG.isDebugEnabled()) {
+      if (LOGGER.isDebugEnabled()) {
         LOGGER.debug("dimension key {}", dimensionKey);
       }
       MetricTimeSeries timeSeries;
@@ -126,7 +126,7 @@
         context.getCounter(RollupCounter.BELOW_THRESHOLD).increment(1);
 
       }
-      if (LOG.isDebugEnabled()) {
+      if (LOGGER.isDebugEnabled()) {
         LOGGER.debug("time series  {}", timeSeries);
       }
     }
