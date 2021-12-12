diff --git a/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/rollup/phase2/RollupPhaseTwoJob.java b/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/rollup/phase2/RollupPhaseTwoJob.java
index d6c3ad6..45f57a6 100644
--- a/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/rollup/phase2/RollupPhaseTwoJob.java
+++ b/thirdeye/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/rollup/phase2/RollupPhaseTwoJob.java
@@ -181,7 +181,7 @@
         map.put(temp.rawDimensionKey, temp.getRawTimeSeries());
         rollupTimeSeries.aggregate(temp.getRawTimeSeries());
       }
-      if (LOG.isDebugEnabled()) {
+      if (LOGGER.isDebugEnabled()) {
         LOGGER.debug(String.format("processing key :%s, size:%d",
             rollupDimensionKeyMD5Writable.toString(), map.size()));
       }
@@ -202,7 +202,7 @@
         // LOGGER.info("Phase 2 Reduce output value rollup dimension {}, timeseries:{}",
         // rollupDimensionKey,rollupTimeSeries );
       }
-      if (LOG.isDebugEnabled()) {
+      if (LOGGER.isDebugEnabled()) {
         LOGGER.debug(String.format("end processing key :%s", rollupDimensionKeyMD5Writable.toString()));
       }
     }
