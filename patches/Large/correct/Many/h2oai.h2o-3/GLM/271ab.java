diff --git a/h2o-algos/src/main/java/hex/glm/GLM.java b/h2o-algos/src/main/java/hex/glm/GLM.java
index 2663de2..4bbfde8 100644
--- a/h2o-algos/src/main/java/hex/glm/GLM.java
+++ b/h2o-algos/src/main/java/hex/glm/GLM.java
@@ -371,7 +371,8 @@
         return; // no point doing anything, it's just the null model
       _iter = _taskInfo._iter;
       LogInfo("starting computation of lambda = " + _lambda + ", previous lambda = " + _taskInfo._lambda);
-      if(activeCols(_lambda, _taskInfo._lambda, _taskInfo._gradient).length > _taskInfo._params.maxActivePredictors)
+      if(activeCols(_lambda, _taskInfo._lambda, _taskInfo._gradient) != null
+              && activeCols(_lambda, _taskInfo._lambda, _taskInfo._gradient).length > _taskInfo._params.maxActivePredictors)
         throw new TooManyPredictorsException();
       double [] beta = contractVec(_taskInfo._beta, _activeCols);
       _lastResult = new IterationInfo(_taskInfo._iter,beta,contractVec(_taskInfo._gradient,_activeCols), _taskInfo._objval);
