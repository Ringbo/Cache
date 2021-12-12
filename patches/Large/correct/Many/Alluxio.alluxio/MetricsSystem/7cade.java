diff --git a/core/common/src/main/java/alluxio/metrics/MetricsSystem.java b/core/common/src/main/java/alluxio/metrics/MetricsSystem.java
index 74b8671..f105b34 100644
--- a/core/common/src/main/java/alluxio/metrics/MetricsSystem.java
+++ b/core/common/src/main/java/alluxio/metrics/MetricsSystem.java
@@ -185,7 +185,7 @@
   public static void checkMinimalPollingPeriod(TimeUnit pollUnit, int pollPeriod)
       throws IllegalArgumentException {
     int period = (int) MINIMAL_POLL_UNIT.convert(pollPeriod, pollUnit);
-    Preconditions.checkArgument(period < MINIMAL_POLL_PERIOD,
+    Preconditions.checkArgument(period >= MINIMAL_POLL_PERIOD,
         "Polling period %d %d is below than minimal polling period", pollPeriod, pollUnit);
   }
 
