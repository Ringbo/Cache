diff --git a/deeplearning4j-scaleout/spark/dl4j-spark/src/test/java/org/deeplearning4j/spark/impl/multilayer/TestSparkMultiLayer.java b/deeplearning4j-scaleout/spark/dl4j-spark/src/test/java/org/deeplearning4j/spark/impl/multilayer/TestSparkMultiLayer.java
index 5ea9a49..242ebbc 100644
--- a/deeplearning4j-scaleout/spark/dl4j-spark/src/test/java/org/deeplearning4j/spark/impl/multilayer/TestSparkMultiLayer.java
+++ b/deeplearning4j-scaleout/spark/dl4j-spark/src/test/java/org/deeplearning4j/spark/impl/multilayer/TestSparkMultiLayer.java
@@ -68,7 +68,7 @@
                 .visibleUnit(RBM.VisibleUnit.GAUSSIAN)
                 .hiddenUnit(RBM.HiddenUnit.RECTIFIED)
                 .activationFunction("tanh").list(2).hiddenLayerSizes(3)
-                .override(new ConfOverride() {
+                .override(1, new ConfOverride() {
                     @Override
                     public void overrideLayer(int i, NeuralNetConfiguration.Builder builder) {
                         if (i == 1) {
@@ -105,7 +105,7 @@
                 .hiddenUnit(RBM.HiddenUnit.RECTIFIED)
                 .nIn(4).nOut(3).layerFactory(LayerFactories.getFactory(RBM.class))
                 .list(3).hiddenLayerSizes(3,2)
-                .override(new ConfOverride() {
+                .override(2, new ConfOverride() {
                     @Override
                     public void overrideLayer(int i, NeuralNetConfiguration.Builder builder) {
 
@@ -153,7 +153,7 @@
         MultiLayerConfiguration conf = new NeuralNetConfiguration.Builder()
                 .nIn(4).nOut(3).layerFactory(LayerFactories.getFactory(RBM.class))
                 .activationFunction("tanh").list(2).hiddenLayerSizes(3)
-                .override(new ConfOverride() {
+                .override(1, new ConfOverride() {
                     @Override
                     public void overrideLayer(int i, NeuralNetConfiguration.Builder builder) {
                         if (i == 1) {
