diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/graph/NormalizeVertex.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/graph/NormalizeVertex.java
index 691ddae..6ffc2fb 100644
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/graph/NormalizeVertex.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/graph/NormalizeVertex.java
@@ -78,7 +78,7 @@
     public org.deeplearning4j.nn.graph.vertex.GraphVertex instantiate(ComputationGraph graph, String name, int idx,
                                                                       INDArray paramsView, boolean initializeParams) {
 
-        return new org.deeplearning4j.nn.graph.vertex.impl.NormalizeVertex(graph,name,idx,dimension);
+        return new org.deeplearning4j.nn.graph.vertex.impl.NormalizeVertex(graph,name,idx,dimension,eps);
     }
 
     @Override
