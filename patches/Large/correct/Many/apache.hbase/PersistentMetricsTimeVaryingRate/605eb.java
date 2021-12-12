diff --git a/src/main/java/org/apache/hadoop/hbase/metrics/PersistentMetricsTimeVaryingRate.java b/src/main/java/org/apache/hadoop/hbase/metrics/PersistentMetricsTimeVaryingRate.java
index bf6367d..cf2fc28 100644
--- a/src/main/java/org/apache/hadoop/hbase/metrics/PersistentMetricsTimeVaryingRate.java
+++ b/src/main/java/org/apache/hadoop/hbase/metrics/PersistentMetricsTimeVaryingRate.java
@@ -128,7 +128,7 @@
     if (curOps > 0) {
       long curTime = this.getPreviousIntervalAverageTime();
       long totalTime = curTime * curOps;
-      if (totalTime / curTime == curOps) {
+      if (curTime == 0 || totalTime / curTime == curOps) {
         super.inc(curOps, totalTime);
       } else {
         LOG.info("Stats for " + this.getName() + " overflowed! resetting");
