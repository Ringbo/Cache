diff --git a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java
index 69d69e0..87e280b 100644
--- a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java
+++ b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java
@@ -3638,7 +3638,7 @@
     public INDArray getColumn(int c) {
         if(isColumnVector() && c == 0)
             return this;
-        else if(isRowVector() && c > 0)
+        else if(isColumnVector() && c > 0)
             throw new IllegalArgumentException("Illegal index for row");
         return get(NDArrayIndex.all(),NDArrayIndex.point(c));
     }
