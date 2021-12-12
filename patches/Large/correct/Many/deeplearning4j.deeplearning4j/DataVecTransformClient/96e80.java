diff --git a/datavec-spark-inference-parent/datavec-spark-inference-client/src/main/java/org/datavec/spark/transform/client/DataVecTransformClient.java b/datavec-spark-inference-parent/datavec-spark-inference-client/src/main/java/org/datavec/spark/transform/client/DataVecTransformClient.java
index 6619d3f..2964b2a 100644
--- a/datavec-spark-inference-parent/datavec-spark-inference-client/src/main/java/org/datavec/spark/transform/client/DataVecTransformClient.java
+++ b/datavec-spark-inference-parent/datavec-spark-inference-client/src/main/java/org/datavec/spark/transform/client/DataVecTransformClient.java
@@ -235,11 +235,11 @@
     @Override
     public SequenceBatchCSVRecord transformSequenceIncremental(BatchCSVRecord transform) {
         try {
-            BatchCSVRecord singleCsvRecord = Unirest.post(url + "/transformincremental")
+            SequenceBatchCSVRecord singleCsvRecord = Unirest.post(url + "/transformincremental")
                     .header("accept", "application/json")
                     .header("Content-Type", "application/json")
                     .header(SEQUENCE_OR_NOT_HEADER,"true")
-                    .body(transform).asObject(BatchCSVRecord.class).getBody();
+                    .body(transform).asObject(SequenceBatchCSVRecord.class).getBody();
             return singleCsvRecord;
         } catch (UnirestException e) {
             e.printStackTrace();
