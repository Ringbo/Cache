diff --git a/metrics-core/src/main/java/com/yammer/metrics/reporting/AbstractPollingReporter.java b/metrics-core/src/main/java/com/yammer/metrics/reporting/AbstractPollingReporter.java
index 88fd28a..dc87c3f 100644
--- a/metrics-core/src/main/java/com/yammer/metrics/reporting/AbstractPollingReporter.java
+++ b/metrics-core/src/main/java/com/yammer/metrics/reporting/AbstractPollingReporter.java
@@ -60,7 +60,7 @@
      * @param unit      the unit for {@code period}
      */
     public void start(long period, TimeUnit unit) {
-        executor.scheduleWithFixedDelay(this, period, period, unit);
+        executor.scheduleAtFixedRate(this, period, period, unit);
     }
 
     @Override
