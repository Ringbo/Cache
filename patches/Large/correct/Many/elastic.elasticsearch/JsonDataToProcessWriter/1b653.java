diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/autodetect/writer/JsonDataToProcessWriter.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/autodetect/writer/JsonDataToProcessWriter.java
index f7fdbd7..351acca 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/autodetect/writer/JsonDataToProcessWriter.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/autodetect/writer/JsonDataToProcessWriter.java
@@ -33,7 +33,7 @@
 
     private static final Logger LOGGER = Loggers.getLogger(JsonDataToProcessWriter.class);
 
-    public JsonDataToProcessWriter(boolean includeControlField, AutodetectProcess autodetectProcess, DataDescription dataDescription,
+    JsonDataToProcessWriter(boolean includeControlField, AutodetectProcess autodetectProcess, DataDescription dataDescription,
                                    AnalysisConfig analysisConfig, DataCountsReporter dataCountsReporter) {
         super(includeControlField, autodetectProcess, dataDescription, analysisConfig, dataCountsReporter, LOGGER);
     }
