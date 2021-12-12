diff --git a/deeplearning4j-ui-parent/deeplearning4j-ui/src/main/java/org/deeplearning4j/ui/weights/ConvolutionalIterationListener.java b/deeplearning4j-ui-parent/deeplearning4j-ui/src/main/java/org/deeplearning4j/ui/weights/ConvolutionalIterationListener.java
index c1b5277..31c318b 100644
--- a/deeplearning4j-ui-parent/deeplearning4j-ui/src/main/java/org/deeplearning4j/ui/weights/ConvolutionalIterationListener.java
+++ b/deeplearning4j-ui-parent/deeplearning4j-ui/src/main/java/org/deeplearning4j/ui/weights/ConvolutionalIterationListener.java
@@ -132,7 +132,7 @@
             if (model instanceof MultiLayerNetwork) {
                 MultiLayerNetwork l = (MultiLayerNetwork) model;
                 for (Layer layer : l.getLayers()) {
-                    if (layer.type() == Layer.Type.CONVOLUTIONAL) {
+                    if (!(layer instanceof FrozenLayer) && layer.type() == Layer.Type.CONVOLUTIONAL) {
                         INDArray output = layer.activate();
                         int sampleDim = rnd.nextInt(output.shape()[0] - 1) + 1;
                         if (cnt == 0) {
@@ -157,7 +157,7 @@
             } else if (model instanceof ComputationGraph) {
                 ComputationGraph l = (ComputationGraph) model;
                 for (Layer layer : l.getLayers()) {
-                    if (layer.type() == Layer.Type.CONVOLUTIONAL) {
+                    if (!(layer instanceof FrozenLayer) && layer.type() == Layer.Type.CONVOLUTIONAL) {
                         INDArray output = layer.activate();
                         int sampleDim = rnd.nextInt(output.shape()[0] - 1) + 1;
                         if (cnt == 0) {
