diff --git a/nd4j/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/ops/transforms/Transforms.java b/nd4j/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/ops/transforms/Transforms.java
index bb7a0cd..391443c 100644
--- a/nd4j/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/ops/transforms/Transforms.java
+++ b/nd4j/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/ops/transforms/Transforms.java
@@ -667,7 +667,7 @@
      * @return
      */
     public static INDArray sigmoidDerivative(INDArray ndArray) {
-        return sigmoid(ndArray, true);
+        return sigmoidDerivative(ndArray, true);
     }
 
     /**
