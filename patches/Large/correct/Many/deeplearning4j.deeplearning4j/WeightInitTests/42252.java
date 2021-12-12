diff --git a/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/learning/WeightInitTests.java b/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/learning/WeightInitTests.java
index 753697e..695d5f2 100755
--- a/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/learning/WeightInitTests.java
+++ b/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/learning/WeightInitTests.java
@@ -31,7 +31,7 @@
 
     @Test
     public void testSi() {
-        WeightInitUtil.initWeights(1,2, WeightInit.VI, Nd4j.getDistributions().createNormal(1,0));
+        WeightInitUtil.initWeights(1,2, WeightInit.VI, Nd4j.getDistributions().createNormal(0,1));
     }
 
 }
