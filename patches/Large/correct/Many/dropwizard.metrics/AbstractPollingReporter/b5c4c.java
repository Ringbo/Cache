diff --git a/metrics-core/src/main/java/com/yammer/metrics/reporting/AbstractPollingReporter.java b/metrics-core/src/main/java/com/yammer/metrics/reporting/AbstractPollingReporter.java
index 1020585..d04f5f3 100644
--- a/metrics-core/src/main/java/com/yammer/metrics/reporting/AbstractPollingReporter.java
+++ b/metrics-core/src/main/java/com/yammer/metrics/reporting/AbstractPollingReporter.java
@@ -32,7 +32,7 @@
      * @param unit      the unit for {@code period}
      */
     public void start(long period, TimeUnit unit) {
-        executor.scheduleWithFixedDelay(this, period, period, unit);
+        executor.scheduleAtFixedRate(this, period, period, unit);
     }
 
     /**
