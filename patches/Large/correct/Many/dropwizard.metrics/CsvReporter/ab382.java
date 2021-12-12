diff --git a/metrics-core/src/main/java/com/yammer/metrics/reporting/CsvReporter.java b/metrics-core/src/main/java/com/yammer/metrics/reporting/CsvReporter.java
index 4c84009..a82b138 100644
--- a/metrics-core/src/main/java/com/yammer/metrics/reporting/CsvReporter.java
+++ b/metrics-core/src/main/java/com/yammer/metrics/reporting/CsvReporter.java
@@ -134,7 +134,7 @@
      * @throws IOException if there is an error opening the stream
      */
     protected PrintStream createStreamForMetric(MetricName metricName) throws IOException {
-        final File newFile = new File(outputDir, metricName.getName() + ".csv");
+        final File newFile = new File(outputDir, metricName.toString() + ".csv");
         if (newFile.createNewFile()) {
             return new PrintStream(new FileOutputStream(newFile));
         }
