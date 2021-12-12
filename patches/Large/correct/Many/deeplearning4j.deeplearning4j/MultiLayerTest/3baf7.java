diff --git a/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/multilayer/MultiLayerTest.java b/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/multilayer/MultiLayerTest.java
index c61b57b..b463a81 100644
--- a/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/multilayer/MultiLayerTest.java
+++ b/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/multilayer/MultiLayerTest.java
@@ -73,7 +73,7 @@
                 .weightInit(WeightInit.DISTRIBUTION).dist(Nd4j.getDistributions().createNormal(1,1e-5))
                 .iterations(100).learningRate(1e-3).iterationListener(new ScoreIterationListener(10))
                 .nIn(next.numInputs()).nOut(next.numOutcomes()).visibleUnit(RBM.VisibleUnit.GAUSSIAN).hiddenUnit(RBM.HiddenUnit.RECTIFIED).layerFactory(layerFactory)
-                .list(4).hiddenLayerSizes(600,250,100).override(new ConfOverride() {
+                .list(4).hiddenLayerSizes(600,250,100).override(3, new ConfOverride() {
                     @Override
                     public void overrideLayer(int i, NeuralNetConfiguration.Builder builder) {
                         if (i == 3) {
@@ -109,7 +109,7 @@
                 .list(2).backward(true)
                 .preProcessor(0,new ConvolutionPostProcessor())
                 .hiddenLayerSizes(new int[]{9})
-                .override(new ClassifierOverride(1)).build();
+                .override(1, new ClassifierOverride(1)).build();
 
         MultiLayerNetwork network = new MultiLayerNetwork(conf);
         DataSetIterator iter = new IrisDataSetIterator(150, 150);
@@ -145,7 +145,7 @@
                 .activationFunction("tanh")
                 .nIn(4).nOut(3).visibleUnit(RBM.VisibleUnit.GAUSSIAN).hiddenUnit(RBM.HiddenUnit.RECTIFIED).layerFactory(layerFactory)
                 .list(3).backward(true)
-                .hiddenLayerSizes(new int[]{3, 2}).override(new ClassifierOverride(2)).build();
+                .hiddenLayerSizes(new int[]{3, 2}).override(2, new ClassifierOverride(2)).build();
 
         MultiLayerNetwork network = new MultiLayerNetwork(conf);
         DataSetIterator iter = new IrisDataSetIterator(150, 150);
@@ -183,7 +183,7 @@
                 .learningRate(1e-1f).iterationListener(new ScoreIterationListener(2))
                 .nIn(4).nOut(3).list(2)
                 .hiddenLayerSizes(new int[]{3})
-                .override(new ClassifierOverride(1)).build();
+                .override(1, new ClassifierOverride(1)).build();
 
             NeuralNetConfiguration conf2 = new NeuralNetConfiguration.Builder()
                     .layerFactory(LayerFactories.getFactory(RBM.class))
