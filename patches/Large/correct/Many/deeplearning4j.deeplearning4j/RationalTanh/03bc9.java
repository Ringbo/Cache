diff --git a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/impl/transforms/RationalTanh.java b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/impl/transforms/RationalTanh.java
index b8049eb..6b93424 100644
--- a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/impl/transforms/RationalTanh.java
+++ b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/impl/transforms/RationalTanh.java
@@ -109,7 +109,7 @@
 
     @Override
     public TransformOp derivative() {
-        return new TanhDerivative(x, y, z, n);
+        return new RationalTanhDerivative(x, y, z, n);
     }
 
     @Override
