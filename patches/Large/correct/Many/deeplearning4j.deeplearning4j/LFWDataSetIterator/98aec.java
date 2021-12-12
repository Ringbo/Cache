diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/iterator/impl/LFWDataSetIterator.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/iterator/impl/LFWDataSetIterator.java
index 572384f..b526234 100755
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/iterator/impl/LFWDataSetIterator.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/iterator/impl/LFWDataSetIterator.java
@@ -85,7 +85,7 @@
      * @param rng random number to lock in batch shuffling
 	 * */
 	public LFWDataSetIterator(int batchSize, int numExamples, int[] imgDim, int numLabels, boolean useSubset, PathLabelGenerator labelGenerator, boolean train, double splitTrainTest, ImageTransform imageTransform, Random rng) {
-		super(new LFWLoader(imgDim, imageTransform, useSubset).getRecordReader(batchSize, numExamples, imgDim, numLabels, labelGenerator, train, splitTrainTest, rng), batchSize, 1, numLabels);
+		super(new LFWLoader(imgDim, imageTransform,numExamples, useSubset).getRecordReader(batchSize, numExamples, imgDim, numLabels, labelGenerator, train, splitTrainTest, rng), batchSize, 1, numLabels);
 	}
 
 }
