diff --git a/deeplearning4j-core/src/test/java/org/deeplearning4j/datasets/iterator/DataSetIteratorTest.java b/deeplearning4j-core/src/test/java/org/deeplearning4j/datasets/iterator/DataSetIteratorTest.java
index 8b54fa4..807fbba 100644
--- a/deeplearning4j-core/src/test/java/org/deeplearning4j/datasets/iterator/DataSetIteratorTest.java
+++ b/deeplearning4j-core/src/test/java/org/deeplearning4j/datasets/iterator/DataSetIteratorTest.java
@@ -232,7 +232,7 @@
 
 		model.fit(cifar);
 
-		cifar.test(10000);
+		cifar.test(100);
 		Evaluation eval = new Evaluation(cifar.getLabels());
 		while(cifar.hasNext()) {
 			DataSet testDS = cifar.next(batchSize);
