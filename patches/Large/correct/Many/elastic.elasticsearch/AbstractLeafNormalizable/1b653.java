diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/normalizer/AbstractLeafNormalizable.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/normalizer/AbstractLeafNormalizable.java
index 4bb3e5f..17e6e96 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/normalizer/AbstractLeafNormalizable.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/process/normalizer/AbstractLeafNormalizable.java
@@ -10,7 +10,7 @@
 
 abstract class AbstractLeafNormalizable extends Normalizable {
 
-    public AbstractLeafNormalizable(String indexName) {
+    AbstractLeafNormalizable(String indexName) {
         super(indexName);
     }
 
