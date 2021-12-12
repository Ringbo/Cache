diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/convolution/subsampling/SubsamplingLayer.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/convolution/subsampling/SubsamplingLayer.java
index f64495f..d0c0691 100644
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/convolution/subsampling/SubsamplingLayer.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/convolution/subsampling/SubsamplingLayer.java
@@ -116,7 +116,7 @@
     public Pair<Gradient, INDArray> backpropGradient(INDArray epsilon, Gradient gradient, Layer layer) {
         INDArray z = preOutput(input, true);
 
-        INDArray error = Nd4j.create(Ints.concat(new int[]{conf.getNIn(),conf.getNOut()},conf.getFeatureMapSize()));
+        INDArray error = Nd4j.create(Ints.concat(new int[]{conf.getNIn(),conf.getNOut()},conf.getKernelSize()));
 
         if(layer.conf().getPoolingType() == PoolingType.AVG) {
             //TODO tile - change code
