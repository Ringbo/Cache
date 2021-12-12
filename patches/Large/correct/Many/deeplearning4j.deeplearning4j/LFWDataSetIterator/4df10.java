diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/iterator/impl/LFWDataSetIterator.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/iterator/impl/LFWDataSetIterator.java
index 9398c00..8df12d9 100755
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/iterator/impl/LFWDataSetIterator.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/iterator/impl/LFWDataSetIterator.java
@@ -83,7 +83,7 @@
      * @param rng random number to lock in batch shuffling
 	 * */
 	public LFWDataSetIterator(int batchSize, int numExamples, int[] imgDim, int numLabels, boolean useSubset, PathLabelGenerator labelGenerator, boolean train, double splitTrainTest, ImageTransform imageTransform, int normalizeValue, Random rng) {
-		super(new LFWLoader(imgDim, imageTransform, normalizeValue, useSubset).getRecordReader(numExamples, batchSize, imgDim, numLabels, labelGenerator, train, splitTrainTest, rng), batchSize, 1, numLabels);
+		super(new LFWLoader(imgDim, imageTransform, normalizeValue, useSubset).getRecordReader(batchSize, numExamples, imgDim, numLabels, labelGenerator, train, splitTrainTest, rng), batchSize, 1, numLabels);
 	}
 
 }
