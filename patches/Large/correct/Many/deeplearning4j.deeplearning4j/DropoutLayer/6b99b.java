diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/DropoutLayer.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/DropoutLayer.java
index b47cf49..7dddf5a 100644
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/DropoutLayer.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/DropoutLayer.java
@@ -61,7 +61,7 @@
 
     @Override
     public Pair<Gradient, INDArray> backpropGradient(INDArray epsilon, LayerWorkspaceMgr workspaceMgr) {
-        INDArray delta = epsilon.dup();
+        INDArray delta = workspaceMgr.dup(ArrayType.ACTIVATION_GRAD, epsilon);
 
         if (maskArray != null) {
             delta.muliColumnVector(maskArray);
