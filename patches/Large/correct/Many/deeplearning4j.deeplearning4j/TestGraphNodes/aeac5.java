diff --git a/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/graph/graphnodes/TestGraphNodes.java b/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/graph/graphnodes/TestGraphNodes.java
index 4e68cbd..4358502 100644
--- a/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/graph/graphnodes/TestGraphNodes.java
+++ b/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/graph/graphnodes/TestGraphNodes.java
@@ -341,7 +341,7 @@
     @Test
     public void testL2Node(){
         Nd4j.getRandom().setSeed(12345);
-        GraphVertex l2 = new L2Vertex(null,"",-1);
+        GraphVertex l2 = new L2Vertex(null,"",-1, 1e-8);
 
         INDArray in1 = Nd4j.rand(5,2);
         INDArray in2 = Nd4j.rand(5,2);
