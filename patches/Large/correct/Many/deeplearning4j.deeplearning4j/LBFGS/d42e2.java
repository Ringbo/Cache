diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/optimize/solvers/LBFGS.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/optimize/solvers/LBFGS.java
index 0f13765..0e6cd36 100644
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/optimize/solvers/LBFGS.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/optimize/solvers/LBFGS.java
@@ -118,7 +118,7 @@
 
     	//In general: have m elements in s,y,rho.
         //But for first few iterations, have less.
-        int numVectors = Integer.min(m,s.size());
+        int numVectors = Math.min(m,s.size());
         
         double[] alpha = new double[numVectors];
         
