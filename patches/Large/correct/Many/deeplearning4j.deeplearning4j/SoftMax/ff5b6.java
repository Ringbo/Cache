diff --git a/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/impl/transforms/SoftMax.java b/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/impl/transforms/SoftMax.java
index 19d5348..4ea2be8 100644
--- a/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/impl/transforms/SoftMax.java
+++ b/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/impl/transforms/SoftMax.java
@@ -175,7 +175,7 @@
             throw new IllegalArgumentException("Only supports row wise calculations");
         if(x.isMatrix()) {
             INDArray maxAlongDimension = x.max(dimensions);
-            if(!maxAlongDimension.isRowVector() && !maxAlongDimension.isScalar())
+            if(!maxAlongDimension.isVector() && !maxAlongDimension.isScalar())
                 throw new IllegalStateException("Max along dimension for input must either be a row vector or scalar");
             INDArray xMinusMax = Nd4j.create(x.shape());
             for(int i = 0; i < x.slices(); i++) {
