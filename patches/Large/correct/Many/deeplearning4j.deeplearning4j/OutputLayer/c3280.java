diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/OutputLayer.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/OutputLayer.java
index 225a64a..c851a2e 100755
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/OutputLayer.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/OutputLayer.java
@@ -131,7 +131,7 @@
             case MCXENT:
                 INDArray preOut = preOutput(input);
                 //input activation
-                INDArray pYGivenX = Nd4j.getExecutioner().execAndReturn(Nd4j.getOpFactory().createTransform("softmax",preOut),0);
+                INDArray pYGivenX = Nd4j.getExecutioner().execAndReturn(Nd4j.getOpFactory().createTransform("softmax",preOut),1);
                 //difference of outputs
                 INDArray dy = labels.sub(pYGivenX);
                 return input.transpose().mmul(dy);
