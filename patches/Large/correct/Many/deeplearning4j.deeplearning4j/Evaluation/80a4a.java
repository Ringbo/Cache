diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/eval/Evaluation.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/eval/Evaluation.java
index fa74ffd..8a86950 100755
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/eval/Evaluation.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/eval/Evaluation.java
@@ -364,7 +364,7 @@
      */
     public double f1(Integer classLabel) {
         double precision = precision(classLabel);
-        double recall = recall();
+        double recall = recall(classLabel);
         if(precision == 0 || recall == 0)
             return 0;
         return 2.0 * ((precision * recall / (precision + recall)));
