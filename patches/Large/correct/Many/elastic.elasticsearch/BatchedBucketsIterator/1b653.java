diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/persistence/BatchedBucketsIterator.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/persistence/BatchedBucketsIterator.java
index dad65d8..c05056e8 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/persistence/BatchedBucketsIterator.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/persistence/BatchedBucketsIterator.java
@@ -18,7 +18,7 @@
 
 class BatchedBucketsIterator extends BatchedResultsIterator<Bucket> {
 
-    public BatchedBucketsIterator(Client client, String jobId) {
+    BatchedBucketsIterator(Client client, String jobId) {
         super(client, jobId, Bucket.RESULT_TYPE_VALUE);
     }
 
