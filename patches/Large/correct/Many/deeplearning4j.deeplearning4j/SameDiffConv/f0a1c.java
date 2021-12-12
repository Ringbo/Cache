diff --git a/deeplearning4j/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/samediff/testlayers/SameDiffConv.java b/deeplearning4j/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/samediff/testlayers/SameDiffConv.java
index e3fc471..f1d5b71 100644
--- a/deeplearning4j/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/samediff/testlayers/SameDiffConv.java
+++ b/deeplearning4j/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/samediff/testlayers/SameDiffConv.java
@@ -121,10 +121,10 @@
         }
 
         Conv2DConfig c = Conv2DConfig.builder()
-                .kh(kernel[0]).kw(kernel[1])
-                .ph(padding[0]).pw(padding[1])
-                .sy(stride[0]).sx(stride[1])
-                .dh(dilation[0]).dw(dilation[1])
+                .kH(kernel[0]).kW(kernel[1])
+                .pH(padding[0]).pW(padding[1])
+                .sH(stride[0]).sW(stride[1])
+                .dH(dilation[0]).dW(dilation[1])
                 .isSameMode(this.cm == ConvolutionMode.Same)
                 .build();
 
