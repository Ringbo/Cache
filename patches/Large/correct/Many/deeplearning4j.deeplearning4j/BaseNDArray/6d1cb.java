diff --git a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java
index 346d81b..58bc610 100644
--- a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java
+++ b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java
@@ -1324,13 +1324,13 @@
      * Returns an ndarray with 1 if the element is epsilon equals
      *
      * @param other the number to compare
-     * @return a copied ndarray with the given
+     * @return a ndarray with the given
      * binary conditions
      */
     @Override
     public INDArray epsi(Number other) {
         INDArray otherArr = Nd4j.valueArrayOf(shape(),other.doubleValue());
-        return eps(otherArr);
+        return epsi(otherArr);
     }
 
     /**
