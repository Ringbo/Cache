diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/results/PerPartitionMaxProbabilities.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/results/PerPartitionMaxProbabilities.java
index bcdb0d2..3937ee6 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/results/PerPartitionMaxProbabilities.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/job/results/PerPartitionMaxProbabilities.java
@@ -132,7 +132,7 @@
     private final class DoubleMaxBox {
         private double value = 0.0;
 
-        public DoubleMaxBox() {
+        DoubleMaxBox() {
         }
 
         public void accept(double d) {
