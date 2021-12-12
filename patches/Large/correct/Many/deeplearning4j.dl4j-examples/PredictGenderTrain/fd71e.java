diff --git a/dl4j-examples/src/main/java/org/deeplearning4j/examples/feedforward/classification/detectgender/PredictGenderTrain.java b/dl4j-examples/src/main/java/org/deeplearning4j/examples/feedforward/classification/detectgender/PredictGenderTrain.java
index bbd773a..d0198c5 100644
--- a/dl4j-examples/src/main/java/org/deeplearning4j/examples/feedforward/classification/detectgender/PredictGenderTrain.java
+++ b/dl4j-examples/src/main/java/org/deeplearning4j/examples/feedforward/classification/detectgender/PredictGenderTrain.java
@@ -49,7 +49,7 @@
     public void train()
     {
         int seed = 123456;
-        double learningRate = 0.01;
+        double learningRate = 0.005;// was .01 but often got errors: "o.d.optimize.solvers.BaseOptimizer - Hit termination condition on iteration 0"
         int batchSize = 100;
         int nEpochs = 100;
         int numInputs = 0;
