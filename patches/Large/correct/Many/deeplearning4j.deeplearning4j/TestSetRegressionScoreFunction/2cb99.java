diff --git a/arbiter-deeplearning4j/src/main/java/org/deeplearning4j/arbiter/scoring/multilayer/TestSetRegressionScoreFunction.java b/arbiter-deeplearning4j/src/main/java/org/deeplearning4j/arbiter/scoring/multilayer/TestSetRegressionScoreFunction.java
index 91cb6cd..25bb341 100644
--- a/arbiter-deeplearning4j/src/main/java/org/deeplearning4j/arbiter/scoring/multilayer/TestSetRegressionScoreFunction.java
+++ b/arbiter-deeplearning4j/src/main/java/org/deeplearning4j/arbiter/scoring/multilayer/TestSetRegressionScoreFunction.java
@@ -36,7 +36,7 @@
             DataSet next = testSet.next();
 
             if (eval == null) {
-                eval = new RegressionEvaluation(next.getLabels().columns());
+                eval = new RegressionEvaluation(next.getLabels().size(1));
             }
 
             INDArray out;
