diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/feedforward/embedding/EmbeddingLayer.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/feedforward/embedding/EmbeddingLayer.java
index 2c0e255..9ef96ba 100644
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/feedforward/embedding/EmbeddingLayer.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/feedforward/embedding/EmbeddingLayer.java
@@ -97,7 +97,7 @@
             rows.putRow(i,weights.getRow(indexes[i]));
         }
         */
-        INDArray rows = Nd4j.pullRows(weights, 1, indexes);
+        INDArray rows = Nd4j.pullRows(weights, 1, indexes, 'c');
         rows.addiRowVector(bias);
 
         return rows;
