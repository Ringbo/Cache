diff --git a/deeplearning4j-ui-parent/deeplearning4j-ui/src/test/java/org/deeplearning4j/ui/ManualTests.java b/deeplearning4j-ui-parent/deeplearning4j-ui/src/test/java/org/deeplearning4j/ui/ManualTests.java
index cd39a6d..2dd7ea2 100644
--- a/deeplearning4j-ui-parent/deeplearning4j-ui/src/test/java/org/deeplearning4j/ui/ManualTests.java
+++ b/deeplearning4j-ui-parent/deeplearning4j-ui/src/test/java/org/deeplearning4j/ui/ManualTests.java
@@ -233,7 +233,7 @@
         List<INDArray> testLabels = new ArrayList<>();
 
         log.info("Load data....");
-        DataSetIterator lfw = new LFWDataSetIterator(batchSize, numSamples, new int[] {numRows, numColumns, nChannels}, outputNum, useSubset, new Random(seed));
+        DataSetIterator lfw = new LFWDataSetIterator(batchSize, numSamples, new int[] {numRows, numColumns, nChannels}, outputNum, useSubset, true, new Random(seed));
 
         log.info("Build model....");
         MultiLayerConfiguration.Builder builder = new NeuralNetConfiguration.Builder()
@@ -341,7 +341,7 @@
         List<INDArray> testLabels = new ArrayList<>();
 
         log.info("Load data....");
-        DataSetIterator lfw = new LFWDataSetIterator(batchSize, numSamples, new int[] {numRows, numColumns, nChannels}, outputNum, useSubset, new Random(seed));
+        DataSetIterator lfw = new LFWDataSetIterator(batchSize, numSamples, new int[] {numRows, numColumns, nChannels}, outputNum, useSubset, true, new Random(seed));
 
         log.info("Build model....");
         MultiLayerConfiguration.Builder builder = new NeuralNetConfiguration.Builder()
