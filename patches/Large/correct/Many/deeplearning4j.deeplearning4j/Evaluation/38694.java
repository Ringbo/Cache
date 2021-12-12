diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/eval/Evaluation.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/eval/Evaluation.java
index e1685af..bff8800 100755
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/eval/Evaluation.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/eval/Evaluation.java
@@ -366,7 +366,7 @@
         truePositives.incrementCount(classLabel, 1.0);
     }
     public void incrementTrueNegatives(Integer classLabel) {
-        truePositives.incrementCount(classLabel, 1.0);
+        trueNegatives.incrementCount(classLabel, 1.0);
     }
     public void incrementFalseNegatives(Integer classLabel) {
         falseNegatives.incrementCount(classLabel, 1.0);
