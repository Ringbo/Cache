diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/convolution/subsampling/SubsamplingLayer.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/convolution/subsampling/SubsamplingLayer.java
index a442920..22c4872 100644
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/convolution/subsampling/SubsamplingLayer.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/convolution/subsampling/SubsamplingLayer.java
@@ -306,14 +306,14 @@
                 //                time2 = System.nanoTime();
 
                 Convolution.pooling2D(input, kernel[0], kernel[1], strides[0], strides[1], pad[0], pad[1], dilation[0], dilation[1],
-                                convolutionMode == ConvolutionMode.Same, Pooling2D.Pooling2DType.AVG, 0.0, outH, outW,
-                                output);
+                                convolutionMode == ConvolutionMode.Same, Pooling2D.Pooling2DType.AVG, Pooling2D.Divisor.INCLUDE_PADDING,
+                                0.0, outH, outW, output);
 
                 break;
             case MAX:
                 Convolution.pooling2D(input, kernel[0], kernel[1], strides[0], strides[1], pad[0], pad[1], dilation[0], dilation[1],
-                                convolutionMode == ConvolutionMode.Same, Pooling2D.Pooling2DType.MAX, 0.0, outH, outW,
-                                output);
+                                convolutionMode == ConvolutionMode.Same, Pooling2D.Pooling2DType.MAX, Pooling2D.Divisor.INCLUDE_PADDING,
+                                0.0, outH, outW, output);
 
                 break;
             case PNORM:
@@ -331,8 +331,8 @@
                 */
 
                 Convolution.pooling2D(input, kernel[0], kernel[1], strides[0], strides[1], pad[0], pad[1], dilation[0], dilation[1],
-                                convolutionMode == ConvolutionMode.Same, Pooling2D.Pooling2DType.PNORM, (double) pnorm,
-                                outH, outW, output);
+                                convolutionMode == ConvolutionMode.Same, Pooling2D.Pooling2DType.PNORM, Pooling2D.Divisor.INCLUDE_PADDING,
+                                (double) pnorm, outH, outW, output);
 
                 break;
             case NONE:
