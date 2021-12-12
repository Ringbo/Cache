diff --git a/h2o-algos/src/main/java/hex/optimization/OptimizationUtils.java b/h2o-algos/src/main/java/hex/optimization/OptimizationUtils.java
index 0226a89..2a9a813 100644
--- a/h2o-algos/src/main/java/hex/optimization/OptimizationUtils.java
+++ b/h2o-algos/src/main/java/hex/optimization/OptimizationUtils.java
@@ -318,7 +318,7 @@
       double maxObj = _ginfox._objVal - _minRelativeImprovement*_ginfox._objVal;
       final double dgInit = ArrayUtils.innerProduct(_ginfox._gradient, direction);
       final double dgtest = dgInit * _ftol;
-      assert dgtest < 0:"invalid gradient/direction, got positive differential " + dgtest;
+      assert dgtest <= 0:"invalid gradient/direction, got positive differential " + dgtest;
       if(dgtest >= 0)
         return false;
       double [] beta = new double[_beta.length];
