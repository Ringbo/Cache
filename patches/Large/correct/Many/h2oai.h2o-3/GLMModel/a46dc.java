diff --git a/h2o-algos/src/main/java/hex/glm/GLMModel.java b/h2o-algos/src/main/java/hex/glm/GLMModel.java
index 0196840..13247fe 100755
--- a/h2o-algos/src/main/java/hex/glm/GLMModel.java
+++ b/h2o-algos/src/main/java/hex/glm/GLMModel.java
@@ -651,13 +651,13 @@
       if (_submodels[l].trainVal != null && tFrame != null) {
         _training_metrics = _submodels[l].trainVal.makeModelMetrics(m,tFrame,tFrame.vec(m._output.responseName()).sigma());
         if(_binomial)
-          _threshold =_training_metrics.auc().maxF1();
+          _threshold =_training_metrics.auc().defaultThreshold();
       }
       if(_submodels[l].holdOutVal != null && vFrame != null) {
         _threshold = _submodels[l].trainVal.bestThreshold();
         _validation_metrics = _submodels[l].holdOutVal.makeModelMetrics(m, vFrame, vFrame.vec(m._output.responseName()).sigma());
         if(_binomial)
-          _threshold = _validation_metrics.auc().maxF1();
+          _threshold = _validation_metrics.auc().defaultThreshold();
       }
       if(_global_beta == null) _global_beta = MemoryManager.malloc8d(_coefficient_names.length);
       else Arrays.fill(_global_beta,0);
