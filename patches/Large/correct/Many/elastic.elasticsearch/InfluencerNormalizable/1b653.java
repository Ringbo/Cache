diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/normalizer/InfluencerNormalizable.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/normalizer/InfluencerNormalizable.java
index c7aa5e0..d54666d 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/normalizer/InfluencerNormalizable.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/normalizer/InfluencerNormalizable.java
@@ -14,7 +14,7 @@
 class InfluencerNormalizable extends AbstractLeafNormalizable {
     private final Influencer influencer;
 
-    public InfluencerNormalizable(Influencer influencer, String indexName) {
+    InfluencerNormalizable(Influencer influencer, String indexName) {
         super(indexName);
         this.influencer = Objects.requireNonNull(influencer);
     }
