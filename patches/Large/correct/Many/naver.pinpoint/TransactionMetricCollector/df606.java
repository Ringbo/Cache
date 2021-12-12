diff --git a/profiler/src/main/java/com/navercorp/pinpoint/profiler/monitor/codahale/tps/TransactionMetricCollector.java b/profiler/src/main/java/com/navercorp/pinpoint/profiler/monitor/codahale/tps/TransactionMetricCollector.java
index d505a22..f52520d 100644
--- a/profiler/src/main/java/com/navercorp/pinpoint/profiler/monitor/codahale/tps/TransactionMetricCollector.java
+++ b/profiler/src/main/java/com/navercorp/pinpoint/profiler/monitor/codahale/tps/TransactionMetricCollector.java
@@ -49,7 +49,7 @@
         this.sampledNewGauge = (Gauge<Long>)MetricMonitorValues.getMetric(metrics, TRANSACTION_SAMPLED_NEW, UNSUPPORTED_GAUGE);
         this.sampledContinuationGauge = (Gauge<Long>)MetricMonitorValues.getMetric(metrics, TRANSACTION_SAMPLED_CONTINUATION, UNSUPPORTED_GAUGE);
         this.unsampledNewGauge = (Gauge<Long>)MetricMonitorValues.getMetric(metrics, TRANSACTION_UNSAMPLED_NEW, UNSUPPORTED_GAUGE);
-        this.unsampledContinuationGuage = (Gauge<Long>)MetricMonitorValues.getMetric(metrics, TRANSACTION_UNSAMPLED_NEW, UNSUPPORTED_GAUGE);
+        this.unsampledContinuationGuage = (Gauge<Long>)MetricMonitorValues.getMetric(metrics, TRANSACTION_UNSAMPLED_CONTINUATION, UNSUPPORTED_GAUGE);
     }
 
     @Override
