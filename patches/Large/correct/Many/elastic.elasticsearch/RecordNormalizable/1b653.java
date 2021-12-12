diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/normalizer/RecordNormalizable.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/normalizer/RecordNormalizable.java
index 3980f37..eedf640 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/normalizer/RecordNormalizable.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/normalizer/RecordNormalizable.java
@@ -15,7 +15,7 @@
 class RecordNormalizable extends AbstractLeafNormalizable {
     private final AnomalyRecord record;
 
-    public RecordNormalizable(AnomalyRecord record, String indexName) {
+    RecordNormalizable(AnomalyRecord record, String indexName) {
         super(indexName);
         this.record = Objects.requireNonNull(record);
     }
