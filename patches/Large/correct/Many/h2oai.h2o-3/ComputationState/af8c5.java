diff --git a/h2o-algos/src/main/java/hex/glm/ComputationState.java b/h2o-algos/src/main/java/hex/glm/ComputationState.java
index 5d97a02..456c21a 100644
--- a/h2o-algos/src/main/java/hex/glm/ComputationState.java
+++ b/h2o-algos/src/main/java/hex/glm/ComputationState.java
@@ -309,7 +309,7 @@
     return l1pen()*l1norm + l2pen()*l2norm;
   }
   private double objective() {
-    return _likelihood * _parms._obj_reg + penalty(_beta) + _bc.proxPen(_beta);
+    return _likelihood * _parms._obj_reg + penalty(_beta) + _activeBC.proxPen(_beta);
   }
   protected double  updateState(double [] beta, double likelihood) {
     _beta = beta;
