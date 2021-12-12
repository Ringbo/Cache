diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/ocnn/OCNNOutputLayer.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/ocnn/OCNNOutputLayer.java
index d2a1b53..173b390 100644
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/ocnn/OCNNOutputLayer.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/ocnn/OCNNOutputLayer.java
@@ -151,12 +151,12 @@
         }
 
         if(firstDerivVBroadcast == null || !Shape.shapeEquals(firstDerivVBroadcast.shape(),shape)) {
-            firstDerivVBroadcast = Nd4j.createUninitialized(shape);
+            firstDerivVBroadcast = Nd4j.createUninitializedDetached(shape);
         }
 
 
         if(secondDerivVBroadcast == null  || !Shape.shapeEquals(secondDerivVBroadcast.shape(),shape)) {
-            secondDerivVBroadcast = Nd4j.createUninitialized(shape);
+            secondDerivVBroadcast = Nd4j.createUninitializedDetached(shape);
         }
 
 
