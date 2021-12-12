diff --git a/storm-core/src/jvm/org/apache/storm/daemon/metrics/MetricsUtils.java b/storm-core/src/jvm/org/apache/storm/daemon/metrics/MetricsUtils.java
index aa5ce28..eb72939 100644
--- a/storm-core/src/jvm/org/apache/storm/daemon/metrics/MetricsUtils.java
+++ b/storm-core/src/jvm/org/apache/storm/daemon/metrics/MetricsUtils.java
@@ -86,7 +86,7 @@
     public static File getCsvLogDir(Map stormConf) {
         String csvMetricsLogDirectory = Utils.getString(stormConf.get(Config.STORM_DAEMON_METRICS_REPORTER_CSV_LOG_DIR), null);
         if (csvMetricsLogDirectory == null) {
-            csvMetricsLogDirectory = ConfigUtils.absoluteHealthCheckDir(stormConf);
+            csvMetricsLogDirectory = ConfigUtils.absoluteStormLocalDir(stormConf);
             csvMetricsLogDirectory = csvMetricsLogDirectory + ConfigUtils.FILE_SEPARATOR + "csvmetrics";
         }
         File csvMetricsDir = new File(csvMetricsLogDirectory);
