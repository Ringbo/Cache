diff --git a/h2o-algos/src/main/java/hex/deeplearning/DeepLearning.java b/h2o-algos/src/main/java/hex/deeplearning/DeepLearning.java
index 1eef55e..81fd642 100755
--- a/h2o-algos/src/main/java/hex/deeplearning/DeepLearning.java
+++ b/h2o-algos/src/main/java/hex/deeplearning/DeepLearning.java
@@ -370,14 +370,14 @@
         new ProgressUpdate("Training...").fork(_progressKey);
 
         //main loop
-        int iteration = 0;
+        int iteration = 1;
         do {
           model.set_model_info(mp._epochs == 0 ? model.model_info() : H2O.CLOUD.size() > 1 && mp._replicate_training_data ? (mp._single_node_mode ?
-                  new DeepLearningTask2(self(), train, model.model_info(), rowFraction(train, mp, model), ++iteration).doAll(Key.make(H2O.SELF)).model_info() : //replicated data + single node mode
-                  new DeepLearningTask2(self(), train, model.model_info(), rowFraction(train, mp, model), ++iteration).doAllNodes(             ).model_info()): //replicated data + multi-node mode
-                  new DeepLearningTask (self(),        model.model_info(), rowFraction(train, mp, model), ++iteration).doAll     (    train    ).model_info()); //distributed data (always in multi-node mode)
+                  new DeepLearningTask2(self(), train, model.model_info(), rowFraction(train, mp, model), iteration).doAll(Key.make(H2O.SELF)).model_info() : //replicated data + single node mode
+                  new DeepLearningTask2(self(), train, model.model_info(), rowFraction(train, mp, model), iteration).doAllNodes(             ).model_info()): //replicated data + multi-node mode
+                  new DeepLearningTask (self(),        model.model_info(), rowFraction(train, mp, model), iteration).doAll     (    train    ).model_info()); //distributed data (always in multi-node mode)
         }
-        while (isRunning() && model.doScoring(trainScoreFrame, validScoreFrame, self(), _progressKey, iteration));
+        while (isRunning() && model.doScoring(trainScoreFrame, validScoreFrame, self(), _progressKey, iteration++));
 
         // replace the model with the best model so far (if it's better)
         if (isRunning() && _parms._overwrite_with_best_model && model.actual_best_model_key != null && _parms._nfolds == 0) {
@@ -392,7 +392,7 @@
             mi.set_processed_local(model.model_info().get_processed_local());
             model.set_model_info(mi);
             model.update(self());
-            model.doScoring(trainScoreFrame, validScoreFrame, self(), _progressKey, -1);
+            model.doScoring(trainScoreFrame, validScoreFrame, self(), _progressKey, iteration);
             assert(best_model.error() == model.error());
           }
         }
