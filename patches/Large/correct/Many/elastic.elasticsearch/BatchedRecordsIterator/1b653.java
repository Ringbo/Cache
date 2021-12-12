diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/persistence/BatchedRecordsIterator.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/persistence/BatchedRecordsIterator.java
index 11fe417..71d6580 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/persistence/BatchedRecordsIterator.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/persistence/BatchedRecordsIterator.java
@@ -18,7 +18,7 @@
 
 class BatchedRecordsIterator extends BatchedResultsIterator<AnomalyRecord> {
 
-    public BatchedRecordsIterator(Client client, String jobId) {
+    BatchedRecordsIterator(Client client, String jobId) {
         super(client, jobId, AnomalyRecord.RESULT_TYPE_VALUE);
     }
 
