diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/conf/graph/MergeVertex.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/conf/graph/MergeVertex.java
index eb8845b..f00c122 100644
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/conf/graph/MergeVertex.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/conf/graph/MergeVertex.java
@@ -62,7 +62,7 @@
             //FF or RNN data inputs
             int size = 0;
             boolean ff = true;
-            for( int i=1; i<vertexInputs.length; i++ ){
+            for( int i=0; i<vertexInputs.length; i++ ){
                 if(vertexInputs[i].getType() != first.getType()){
                     throw new InvalidInputTypeException("Invalid input: MergeVertex cannot merge activations of different types:"
                             + " first type = " + first.getType() + ", input type " + (i+1) + " = " + vertexInputs[i].getType());
