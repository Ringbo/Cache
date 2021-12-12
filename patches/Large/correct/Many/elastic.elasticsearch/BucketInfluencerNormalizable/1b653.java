diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/normalizer/BucketInfluencerNormalizable.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/normalizer/BucketInfluencerNormalizable.java
index 00412a4..af57097 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/normalizer/BucketInfluencerNormalizable.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/normalizer/BucketInfluencerNormalizable.java
@@ -15,7 +15,7 @@
 class BucketInfluencerNormalizable extends AbstractLeafNormalizable {
     private final BucketInfluencer bucketInfluencer;
 
-    public BucketInfluencerNormalizable(BucketInfluencer influencer, String indexName) {
+    BucketInfluencerNormalizable(BucketInfluencer influencer, String indexName) {
         super(indexName);
         bucketInfluencer = Objects.requireNonNull(influencer);
     }
