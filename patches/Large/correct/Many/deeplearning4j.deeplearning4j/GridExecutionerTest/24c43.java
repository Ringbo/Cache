diff --git a/nd4j-backends/nd4j-backend-impls/nd4j-cuda/src/test/java/org/nd4j/linalg/jcublas/ops/executioner/GridExecutionerTest.java b/nd4j-backends/nd4j-backend-impls/nd4j-cuda/src/test/java/org/nd4j/linalg/jcublas/ops/executioner/GridExecutionerTest.java
index b7e4690..0193e50 100644
--- a/nd4j-backends/nd4j-backend-impls/nd4j-cuda/src/test/java/org/nd4j/linalg/jcublas/ops/executioner/GridExecutionerTest.java
+++ b/nd4j-backends/nd4j-backend-impls/nd4j-cuda/src/test/java/org/nd4j/linalg/jcublas/ops/executioner/GridExecutionerTest.java
@@ -203,7 +203,7 @@
         INDArray arrayX = Nd4j.create(10);
         INDArray arrayY = Nd4j.create(new float[] {1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f});
 
-        EqualsWithEps op = new EqualsWithEps(arrayX, arrayY);
+        EqualsWithEps op = new EqualsWithEps(arrayX, arrayY, Nd4j.EPS_THRESHOLD);
 
         executioner.exec(op);
 
