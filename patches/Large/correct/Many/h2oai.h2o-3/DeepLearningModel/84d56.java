diff --git a/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java b/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java
index eeb3ded..eec4f24 100755
--- a/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java
+++ b/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java
@@ -493,7 +493,7 @@
           Log.info("Old value of train_samples_per_iteration: " + actual_train_samples_per_iteration);
           correction = get_params()._target_ratio_comm_to_comp / comm_to_work_ratio;
           correction = Math.max(0.1,Math.min(2, correction)); //it's ok to train up to 10x more training rows per iteration, but not fewer than half.
-          if (actual_train_samples_per_iteration/correction <= 10*tspiGuess || actual_train_samples_per_iteration/correction >= 0.1*tspiGuess) { //stay within 10x of original guess
+          if (actual_train_samples_per_iteration/correction <= 10*tspiGuess && actual_train_samples_per_iteration/correction >= 0.1*tspiGuess) { //stay within 10x of original guess
             if (Math.abs(correction) < 0.8 || Math.abs(correction) > 1.2) { //don't correct unless it's significant (avoid slow drift)
               actual_train_samples_per_iteration /= correction;
               actual_train_samples_per_iteration = Math.max(1, actual_train_samples_per_iteration);
