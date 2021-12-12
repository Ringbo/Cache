diff --git a/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java b/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java
index a2b817c..ca60212 100755
--- a/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java
+++ b/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java
@@ -1699,9 +1699,9 @@
             ModelMetricsMultinomial mm = (ModelMetricsMultinomial)(mm1);
             err.train_confusion_matrix = mm.cm();
           }
-          if (ftrain.numRows() < training_rows) {
+          if (ftrain.numRows() != training_rows) {
             _output._training_metrics._description = "Metrics reported on temporary training frame with " + ftrain.numRows() + " samples";
-          } else if (ftrain._key.toString().contains("chunks")){
+          } else if (ftrain._key != null && ftrain._key.toString().contains("chunks")){
             _output._training_metrics._description = "Metrics reported on temporary (load-balanced) training frame";
           } else {
             _output._training_metrics._description = "Metrics reported on full training frame";
@@ -1724,12 +1724,12 @@
                 ModelMetricsMultinomial mm = (ModelMetricsMultinomial)mtest;
                 err.valid_confusion_matrix = mm.cm();
               }
-              if (ftest.numRows() < validation_rows) {
+              if (ftest.numRows() != validation_rows) {
                 _output._validation_metrics._description = "Metrics reported on temporary validation frame with " + ftest.numRows() + " samples";
                 if (get_params()._score_validation_sampling == DeepLearningParameters.ClassSamplingMethod.Stratified) {
                   _output._validation_metrics._description += " (stratified sampling)";
                 }
-              } else if (ftest._key.toString().contains("chunks")){
+              } else if (ftest._key != null && ftest._key.toString().contains("chunks")){
                 _output._validation_metrics._description = "Metrics reported on temporary (load-balanced) validation frame";
               } else {
                 _output._validation_metrics._description = "Metrics reported on full validation frame";
