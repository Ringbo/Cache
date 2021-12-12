diff --git a/azkaban-common/src/main/java/azkaban/metric/MetricReportManager.java b/azkaban-common/src/main/java/azkaban/metric/MetricReportManager.java
index fe68a32..3352f4f 100644
--- a/azkaban-common/src/main/java/azkaban/metric/MetricReportManager.java
+++ b/azkaban-common/src/main/java/azkaban/metric/MetricReportManager.java
@@ -25,7 +25,7 @@
 
 
 public class MetricReportManager {
-  private static final int MAX_EMITTER_THREADS = 2;
+  private static final int MAX_EMITTER_THREADS = 4;
   private static final Logger logger = Logger.getLogger(MetricReportManager.class);
 
   private List<IMetric<?>> metrics;
@@ -58,7 +58,8 @@
   // each element of metrics List is responsible to call this method and report metrics
   public void reportMetric(final IMetric<?> metric) {
     if (metric != null) {
-      logger.debug(String.format("Submitting %s metric for metric emission pool", metric.getName()));
+      // TODO: change to debug level
+      logger.info(String.format("Submitting %s metric for metric emission pool", metric.getName()));
       executorService.submit(new Runnable() {
         @Override
         public void run() {
