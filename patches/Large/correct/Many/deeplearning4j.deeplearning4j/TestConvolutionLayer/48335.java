diff --git a/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/convolution/TestConvolutionLayer.java b/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/convolution/TestConvolutionLayer.java
index 655fefd..44802c8 100644
--- a/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/convolution/TestConvolutionLayer.java
+++ b/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/convolution/TestConvolutionLayer.java
@@ -32,7 +32,7 @@
     @Test
     public void testFeedForward() throws Exception  {
         DataSetIterator mnist = new MnistDataSetIterator(10,10);
-        NeuralNetConfiguration conf = new NeuralNetConfiguration.Builder().featureMapSize(20,20)
+        NeuralNetConfiguration conf = new NeuralNetConfiguration.Builder().kernelSize(20,20)
                 .activationFunction("relu").constrainGradientToUnitNorm(true)
                 .kernelSize(9,9)
                 .layer(new ConvolutionLayer())
