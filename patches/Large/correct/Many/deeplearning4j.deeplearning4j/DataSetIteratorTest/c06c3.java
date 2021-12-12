diff --git a/deeplearning4j-core/src/test/java/org/deeplearning4j/datasets/iterator/DataSetIteratorTest.java b/deeplearning4j-core/src/test/java/org/deeplearning4j/datasets/iterator/DataSetIteratorTest.java
index 03f4327..71ffbd6 100644
--- a/deeplearning4j-core/src/test/java/org/deeplearning4j/datasets/iterator/DataSetIteratorTest.java
+++ b/deeplearning4j-core/src/test/java/org/deeplearning4j/datasets/iterator/DataSetIteratorTest.java
@@ -197,11 +197,11 @@
 		int outputNum = CifarLoader.NUM_LABELS;
 		int numSamples = 110;
 		int batchSize = 5;
-		int iterations = 10;
+		int iterations = 1;
 		int seed = 123;
 		int listenerFreq = iterations;
 
-		CifarDataSetIterator cifar = new CifarDataSetIterator(batchSize, numSamples, new int[] {height, width, channels}, true, preProcessCifar);
+		CifarDataSetIterator cifar = new CifarDataSetIterator(batchSize, numSamples, new int[] {height, width, channels}, preProcessCifar, true);
 
 		MultiLayerConfiguration.Builder builder = new NeuralNetConfiguration.Builder()
 				.seed(seed)
@@ -232,7 +232,7 @@
 
 		model.fit(cifar);
 
-		cifar.test();
+		cifar.test(numSamples);
 		Evaluation eval = new Evaluation(cifar.getLabels());
 		while(cifar.hasNext()) {
 			DataSet testDS = cifar.next(batchSize);
