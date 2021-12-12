diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/persistence/BatchedInfluencersIterator.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/persistence/BatchedInfluencersIterator.java
index 6efa361..2d90878 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/persistence/BatchedInfluencersIterator.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/persistence/BatchedInfluencersIterator.java
@@ -17,7 +17,7 @@
 import java.io.IOException;
 
 class BatchedInfluencersIterator extends BatchedResultsIterator<Influencer> {
-    public BatchedInfluencersIterator(Client client, String jobId) {
+    BatchedInfluencersIterator(Client client, String jobId) {
         super(client, jobId, Influencer.RESULT_TYPE_VALUE);
     }
 
