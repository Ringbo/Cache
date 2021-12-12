diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/convolution/ConvolutionLayer.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/convolution/ConvolutionLayer.java
index 9dbebb9..97e9b4b 100644
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/convolution/ConvolutionLayer.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/convolution/ConvolutionLayer.java
@@ -80,7 +80,7 @@
         INDArray activationDerivative = Nd4j.getExecutioner().execAndReturn(Nd4j.getOpFactory().createTransform(conf().getActivationFunction(), z).derivative());
         if(!Arrays.equals(z.shape(),activationDerivative.shape()))
             throw new IllegalStateException("Shapes must be same");
-        return z.muli(activationDerivative);
+        return epsilon.muli(activationDerivative);
 
     }
 
