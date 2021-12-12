diff --git a/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/convolution/Convolution3DTest.java b/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/convolution/Convolution3DTest.java
index ecb19e8..ff1e8ab 100644
--- a/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/convolution/Convolution3DTest.java
+++ b/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/convolution/Convolution3DTest.java
@@ -42,7 +42,7 @@
 
 
     @Test
-    public void testConvolution3dForwardSameMode() throws Exception {
+    public void testConvolution3dForwardSameMode() {
 
         INDArray containedInput = getContainedData();
         Convolution3DLayer layer = (Convolution3DLayer) getConvolution3DLayer(ConvolutionMode.Same);
