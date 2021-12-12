diff --git a/h2o-algos/src/main/java/hex/glm/GLM.java b/h2o-algos/src/main/java/hex/glm/GLM.java
index 917c2ea..f4d3a6d 100644
--- a/h2o-algos/src/main/java/hex/glm/GLM.java
+++ b/h2o-algos/src/main/java/hex/glm/GLM.java
@@ -741,7 +741,7 @@
         _state._u = l1Solver._u;
         _state.updateState(beta,gslvr.getGradient(beta));
       } else {
-        if(_state._iter == 0)
+        if(!_parms._lambda_search && _state._iter == 0)
           updateProgress(false);
         Result r = lbfgs.solve(gslvr, beta, _state.ginfo(), new ProgressMonitor() {
           @Override
