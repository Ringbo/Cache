diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/multilayer/MultiLayerNetwork.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/multilayer/MultiLayerNetwork.java
index 0f47a9c..9fc41fb 100755
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/multilayer/MultiLayerNetwork.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/multilayer/MultiLayerNetwork.java
@@ -1705,7 +1705,7 @@
             truncatedBPTTGradient();
         }
         else {
-            feedForward();
+            feedForward(true);
             backprop();
         }
         score = ((BaseOutputLayer<?>)getOutputLayer()).computeScore(calcL1(),calcL2());
