diff --git a/deeplearning4j-scaleout/deeplearning4j-scaleout-akka/src/test/java/org/deeplearning4j/scaleout/perform/MultiLayerWorkPerformerTests.java b/deeplearning4j-scaleout/deeplearning4j-scaleout-akka/src/test/java/org/deeplearning4j/scaleout/perform/MultiLayerWorkPerformerTests.java
index e5f8cbb..5234a2a 100644
--- a/deeplearning4j-scaleout/deeplearning4j-scaleout-akka/src/test/java/org/deeplearning4j/scaleout/perform/MultiLayerWorkPerformerTests.java
+++ b/deeplearning4j-scaleout/deeplearning4j-scaleout-akka/src/test/java/org/deeplearning4j/scaleout/perform/MultiLayerWorkPerformerTests.java
@@ -44,7 +44,7 @@
                 .momentum(9e-1f).weightInit(WeightInit.DISTRIBUTION).dist(Nd4j.getDistributions().createNormal(1e-1,1))
                 .lossFunction(LossFunctions.LossFunction.RECONSTRUCTION_CROSSENTROPY).iterations(10)
                 .learningRate(1e-1f).nIn(4).nOut(3).layerFactory(layerFactory)
-                .list(2).hiddenLayerSizes(new int[]{3}).override(new ConfOverride() {
+                .list(2).hiddenLayerSizes(new int[]{3}).override(1, new ConfOverride() {
                     @Override
                     public void overrideLayer(int i, NeuralNetConfiguration.Builder builder) {
 
