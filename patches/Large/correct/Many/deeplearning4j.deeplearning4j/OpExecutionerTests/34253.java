diff --git a/nd4j-tests/src/test/java/org/nd4j/linalg/ops/OpExecutionerTests.java b/nd4j-tests/src/test/java/org/nd4j/linalg/ops/OpExecutionerTests.java
index 7dafdd4..6f26954 100644
--- a/nd4j-tests/src/test/java/org/nd4j/linalg/ops/OpExecutionerTests.java
+++ b/nd4j-tests/src/test/java/org/nd4j/linalg/ops/OpExecutionerTests.java
@@ -221,7 +221,7 @@
         INDArray bias = Nd4j.linspace(1,4,4);
         Bias biaOp = new Bias(bias);
         Nd4j.getExecutioner().exec(biaOp);
-        assertEquals(0.0,biaOp.currentResult().doubleValue());
+        assertEquals(0.0,biaOp.currentResult().doubleValue(),1e-1);
     }
 
     @Test
