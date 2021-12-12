diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/graph/vertex/impl/MergeVertex.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/graph/vertex/impl/MergeVertex.java
index 035af9e..1d93d6e 100644
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/graph/vertex/impl/MergeVertex.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/graph/vertex/impl/MergeVertex.java
@@ -172,7 +172,7 @@
         //Split the epsilons in the opposite way that the activations were merged
         INDArray[] out = new INDArray[forwardPassShapes.length];
         for (int i = 0; i < out.length; i++)
-            out[i] = Nd4j.createUnitialized(forwardPassShapes[i]);
+            out[i] = Nd4j.createUninitialized(forwardPassShapes[i]);
 
         int cumulative = 0;
         switch (fwdPassRank) {
