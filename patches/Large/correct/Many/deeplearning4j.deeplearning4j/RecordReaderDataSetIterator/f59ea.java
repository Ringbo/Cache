diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/canova/RecordReaderDataSetIterator.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/canova/RecordReaderDataSetIterator.java
index e8ee1da..a4a3d89 100644
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/canova/RecordReaderDataSetIterator.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/canova/RecordReaderDataSetIterator.java
@@ -191,7 +191,7 @@
 
 
         INDArray label = null;
-        INDArray featureVector = Nd4j.create(labelIndex >= 0 ? currList.size() - 1 : currList.size());
+        INDArray featureVector = Nd4j.create(labelIndex > 0 ? currList.size() - 1 : currList.size());
         for (int j = 0; j < currList.size(); j++) {
             if (labelIndex >= 0 && j == labelIndex) {
                 if (numPossibleLabels < 1)
