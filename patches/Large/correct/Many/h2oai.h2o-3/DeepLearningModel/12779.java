diff --git a/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java b/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java
index 10efdcc..babc88c 100755
--- a/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java
+++ b/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java
@@ -1695,7 +1695,7 @@
           err.training_MSE = mm1._MSE;
           err.training_R2 = mm1.r2();
           _output._training_metrics = mm1;
-          if (get_params()._score_training_samples != 0 && get_params()._score_training_samples != ftrain.numRows()) {
+          if (get_params()._score_training_samples != 0 && get_params()._score_training_samples < ftrain.numRows()) {
             _output._training_metrics._description = "Metrics reported on " + ftrain.numRows() + " training set samples";
           }
 
