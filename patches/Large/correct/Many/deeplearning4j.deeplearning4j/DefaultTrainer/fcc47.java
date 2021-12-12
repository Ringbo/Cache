diff --git a/deeplearning4j-scaleout/deeplearning4j-scaleout-parallelwrapper/src/main/java/org/deeplearning4j/parallelism/trainer/DefaultTrainer.java b/deeplearning4j-scaleout/deeplearning4j-scaleout-parallelwrapper/src/main/java/org/deeplearning4j/parallelism/trainer/DefaultTrainer.java
index a9f9a4a..23b9b17 100644
--- a/deeplearning4j-scaleout/deeplearning4j-scaleout-parallelwrapper/src/main/java/org/deeplearning4j/parallelism/trainer/DefaultTrainer.java
+++ b/deeplearning4j-scaleout/deeplearning4j-scaleout-parallelwrapper/src/main/java/org/deeplearning4j/parallelism/trainer/DefaultTrainer.java
@@ -261,14 +261,13 @@
 
                     // we replicate original model params & updater state, just in case it's pre-trained model
                     synchronized (originalModel) {
-                        replicatedModel.setParams(originalModel.params());
+                        replicatedModel.setParams(originalModel.params().unsafeDuplication(true));
 
                         Updater updaterReplica = ((MultiLayerNetwork) replicatedModel).getUpdater();
                         Updater updaterOrigina = ((MultiLayerNetwork) originalModel).getUpdater();
 
                         if (updaterOrigina != null && updaterOrigina.getStateViewArray() != null)
-                            updaterReplica.setStateViewArray((MultiLayerNetwork) replicatedModel,
-                                            updaterOrigina.getStateViewArray().dup(), false);
+                            updaterReplica.setStateViewArray((MultiLayerNetwork) replicatedModel, updaterOrigina.getStateViewArray().unsafeDuplication(true), false);
 
                         Nd4j.getExecutioner().commit();
                     }
@@ -291,13 +290,13 @@
 
                     // we replicate original model params & updater state, just in case it's pre-trained model
                     synchronized (originalModel) {
-                        replicatedModel.setParams(originalModel.params());
+                        replicatedModel.setParams(originalModel.params().unsafeDuplication(true));
 
                         ComputationGraphUpdater updaterReplica = ((ComputationGraph) replicatedModel).getUpdater();
                         ComputationGraphUpdater updaterOrigina = ((ComputationGraph) originalModel).getUpdater();
 
                         if (updaterOrigina != null && updaterOrigina.getStateViewArray() != null)
-                            updaterReplica.setStateViewArray(updaterOrigina.getStateViewArray().dup());
+                            updaterReplica.setStateViewArray(updaterOrigina.getStateViewArray().unsafeDuplication(true));
 
                         Nd4j.getExecutioner().commit();
                     }
