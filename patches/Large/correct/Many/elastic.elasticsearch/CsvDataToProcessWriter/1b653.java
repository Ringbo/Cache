diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/autodetect/writer/CsvDataToProcessWriter.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/autodetect/writer/CsvDataToProcessWriter.java
index 4a8d5e9..13957d7 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/autodetect/writer/CsvDataToProcessWriter.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/autodetect/writer/CsvDataToProcessWriter.java
@@ -52,7 +52,7 @@
      */
     private static final int MAX_LINES_PER_RECORD = 10000;
 
-    public CsvDataToProcessWriter(boolean includeControlField, AutodetectProcess autodetectProcess,
+    CsvDataToProcessWriter(boolean includeControlField, AutodetectProcess autodetectProcess,
                                   DataDescription dataDescription, AnalysisConfig analysisConfig,
                                   DataCountsReporter dataCountsReporter) {
         super(includeControlField, autodetectProcess, dataDescription, analysisConfig, dataCountsReporter, LOGGER);
