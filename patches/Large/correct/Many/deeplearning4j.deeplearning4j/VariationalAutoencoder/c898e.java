diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/layers/variational/VariationalAutoencoder.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/layers/variational/VariationalAutoencoder.java
index 05cc5b5..b5d0709 100644
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/layers/variational/VariationalAutoencoder.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/layers/variational/VariationalAutoencoder.java
@@ -185,7 +185,7 @@
          * @param decoderLayerSizes    Size of each deccoder layer in the variational autoencoder
          */
         public Builder decoderLayerSizes(int... decoderLayerSizes) {
-            if (encoderLayerSizes == null || encoderLayerSizes.length < 1) {
+            if (decoderLayerSizes == null || decoderLayerSizes.length < 1) {
                 throw new IllegalArgumentException("Decoder layer sizes array must have length > 0");
             }
             this.decoderLayerSizes = decoderLayerSizes;
