diff --git a/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/executioner/DefaultOpExecutioner.java b/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/executioner/DefaultOpExecutioner.java
index 50e3db5..427bfa0 100644
--- a/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/executioner/DefaultOpExecutioner.java
+++ b/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/executioner/DefaultOpExecutioner.java
@@ -349,7 +349,7 @@
         for (int i = 0; i < op.x().vectorsAlongDimension(dimension); i++) {
             Op op2 = op.opForDimension(i, dimension);
             exec(op2);
-            op.z().vectorAlongDimension(i, dimension).assign(op.z());
+            op.z().vectorAlongDimension(i, dimension).assign(op2.z());
         }
         return op.z();
     }
