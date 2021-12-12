diff --git a/nd4j-backends/nd4j-tests/src/test/java/org/nd4j/linalg/Nd4jTestsC.java b/nd4j-backends/nd4j-tests/src/test/java/org/nd4j/linalg/Nd4jTestsC.java
index fd5d671..7c4a694 100644
--- a/nd4j-backends/nd4j-tests/src/test/java/org/nd4j/linalg/Nd4jTestsC.java
+++ b/nd4j-backends/nd4j-tests/src/test/java/org/nd4j/linalg/Nd4jTestsC.java
@@ -5259,7 +5259,7 @@
     public void testBroadcastAMin() throws Exception {
         INDArray matrix = Nd4j.create(5, 5);
         for (int r = 0; r < matrix.rows(); r++) {
-            matrix.getRow(r).assign(Nd4j.create(new double[]{2, 3, 3, 4, 5}));
+            matrix.getRow(r).assign(Nd4j.create(new double[]{2, 3, 3, 4, 1}));
         }
 
         INDArray row = Nd4j.create(new double[]{1, 2, 3, 4, -5});
@@ -5267,7 +5267,7 @@
         Nd4j.getExecutioner().exec(new BroadcastAMin(matrix, row, matrix, 1));
 
         for (int r = 0; r < matrix.rows(); r++) {
-            assertEquals(Nd4j.create(new double[] {1, 2, 3, 4, -5}), matrix.getRow(r));
+            assertEquals(Nd4j.create(new double[] {1, 2, 3, 4, 1}), matrix.getRow(r));
         }
     }
 
