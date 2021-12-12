diff --git a/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java b/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java
index 21d533f..d3cf368 100644
--- a/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java
+++ b/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java
@@ -3962,7 +3962,7 @@
      * @return the broadcasted ndarray
      */
     @Override
-    public INDArray broadcast(int[] shape) {
+    public INDArray broadcast(int...shape) {
 
         if (Shape.shapeEquals(shape, shape()))
             return this;
@@ -4005,7 +4005,7 @@
                 }
             }
             else {
-                if(size(i) == 1)
+                if(i < rank() && size(i) == 1)
                     broadCastDimensions.add(i);
                 else
                     nonBroadCastDimensions.add(i);
