diff --git a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/metrics2/impl/MetricsSystemImpl.java b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/metrics2/impl/MetricsSystemImpl.java
index baa75ab..32b00f3 100644
--- a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/metrics2/impl/MetricsSystemImpl.java
+++ b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/metrics2/impl/MetricsSystemImpl.java
@@ -384,7 +384,7 @@
    * Requests an immediate publish of all metrics from sources to sinks.
    */
   @Override
-  public void publishMetricsNow() {
+  public synchronized void publishMetricsNow() {
     if (sinks.size() > 0) {
       publishMetrics(sampleMetrics(), true);
     }    
