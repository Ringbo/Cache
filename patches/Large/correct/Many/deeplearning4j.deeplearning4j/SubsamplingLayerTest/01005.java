diff --git a/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/convolution/SubsamplingLayerTest.java b/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/convolution/SubsamplingLayerTest.java
index d64dc0c..f6d3d9d 100644
--- a/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/convolution/SubsamplingLayerTest.java
+++ b/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/convolution/SubsamplingLayerTest.java
@@ -121,7 +121,7 @@
         INDArray input = getData();
 
         Layer layer = getSubsamplingLayer(SubsamplingLayer.PoolingType.MAX);
-        layer.setInput(input);
+        layer.activate(input);
 
         Pair<Gradient, INDArray> containedOutput = layer.backpropGradient(expectedContainedEpsilonInput);
         assertEquals(expectedContainedEpsilonResult, containedOutput.getSecond());
