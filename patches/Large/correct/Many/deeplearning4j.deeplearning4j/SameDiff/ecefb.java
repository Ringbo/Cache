diff --git a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/autodiff/samediff/SameDiff.java b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/autodiff/samediff/SameDiff.java
index fb747b9..6958555 100644
--- a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/autodiff/samediff/SameDiff.java
+++ b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/autodiff/samediff/SameDiff.java
@@ -2919,7 +2919,7 @@
      * @return
      */
     public SDVariable lossNegativeLogLikelihood(String name,SDVariable iX, SDVariable i_y, int...dimensions) {
-        DifferentialFunction result = functionFactory.lossMSLE(getFunctionInput(iX),getFunctionInput(i_y),dimensions);
+        DifferentialFunction result = functionFactory.lossNegativeLogLikelihood(getFunctionInput(iX), getFunctionInput(i_y), dimensions);
         updateVariableName(result.getVertexId(),name);
         return getVariableForVertexId(result.getVertexId());
     }
