diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/layers/setup/ConvolutionLayerSetup.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/layers/setup/ConvolutionLayerSetup.java
index 1b5cd0e..b3243c1 100644
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/layers/setup/ConvolutionLayerSetup.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/layers/setup/ConvolutionLayerSetup.java
@@ -27,6 +27,6 @@
      */
     @Deprecated
     public ConvolutionLayerSetup(MultiLayerConfiguration.Builder builder, int height, int width, int channels) {
-        builder.setInputType(InputType.convolutional(height, width, channels));
+        builder.setInputType(InputType.convolutionalFlat(height, width, channels));
     }
 }
\ No newline at end of file
