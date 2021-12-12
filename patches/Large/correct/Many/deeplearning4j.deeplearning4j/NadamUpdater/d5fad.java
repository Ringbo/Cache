diff --git a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/learning/NadamUpdater.java b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/learning/NadamUpdater.java
index d166e6e..4abc42d 100644
--- a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/learning/NadamUpdater.java
+++ b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/learning/NadamUpdater.java
@@ -89,7 +89,7 @@
 
         double beta1t = FastMath.pow(beta1, iteration + 1);
 
-        INDArray biasCorrectedEstimateOfMomentum = m.muli(beta1).divi(1.0 - beta1t);
+        INDArray biasCorrectedEstimateOfMomentum = m.mul(beta1).divi(1.0 - beta1t);
         INDArray secondTerm = oneMinusBeta1Grad.divi(1 - beta1t);
 
         INDArray alphat =  biasCorrectedEstimateOfMomentum.add(secondTerm).muli(learningRate);
