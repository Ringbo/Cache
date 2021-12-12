diff --git a/core/src/main/java/com/yahoo/ycsb/measurements/OneMeasurementHdrHistogram.java b/core/src/main/java/com/yahoo/ycsb/measurements/OneMeasurementHdrHistogram.java
index 6712d78..5373b40 100644
--- a/core/src/main/java/com/yahoo/ycsb/measurements/OneMeasurementHdrHistogram.java
+++ b/core/src/main/java/com/yahoo/ycsb/measurements/OneMeasurementHdrHistogram.java
@@ -101,7 +101,7 @@
     exporter.write(getName(), "AverageLatency(us)", totalHistogram.getMean());
     exporter.write(getName(), "MinLatency(us)", totalHistogram.getMinValue());
     exporter.write(getName(), "MaxLatency(us)", totalHistogram.getMaxValue());
-    exporter.write(getName(), "95thPercentileLatency(us)", totalHistogram.getValueAtPercentile(90));
+    exporter.write(getName(), "95thPercentileLatency(us)", totalHistogram.getValueAtPercentile(95));
     exporter.write(getName(), "99thPercentileLatency(us)", totalHistogram.getValueAtPercentile(99));
     
     exportReturnCodes(exporter);
