diff --git a/deeplearning4j/deeplearning4j-modelimport/src/main/java/org/deeplearning4j/nn/modelimport/keras/KerasModelImport.java b/deeplearning4j/deeplearning4j-modelimport/src/main/java/org/deeplearning4j/nn/modelimport/keras/KerasModelImport.java
index 5a7acde..a54995f 100644
--- a/deeplearning4j/deeplearning4j-modelimport/src/main/java/org/deeplearning4j/nn/modelimport/keras/KerasModelImport.java
+++ b/deeplearning4j/deeplearning4j-modelimport/src/main/java/org/deeplearning4j/nn/modelimport/keras/KerasModelImport.java
@@ -212,7 +212,7 @@
                                                               boolean enforceTrainingConfig)
             throws IOException, InvalidKerasConfigurationException, UnsupportedKerasConfigurationException {
         KerasModel kerasModel = new KerasModel().modelBuilder().modelJsonFilename(modelJsonFilename)
-                .weightsHdf5Filename(weightsHdf5Filename).enforceTrainingConfig(enforceTrainingConfig)
+                .weightsHdf5FilenameNoRoot(weightsHdf5Filename).enforceTrainingConfig(enforceTrainingConfig)
                 .buildModel();
         return kerasModel.getComputationGraph();
     }
@@ -230,7 +230,7 @@
     public static ComputationGraph importKerasModelAndWeights(String modelJsonFilename, String weightsHdf5Filename)
             throws IOException, InvalidKerasConfigurationException, UnsupportedKerasConfigurationException {
         KerasModel kerasModel = new KerasModel().modelBuilder().modelJsonFilename(modelJsonFilename)
-                .weightsHdf5Filename(weightsHdf5Filename).enforceTrainingConfig(true).buildModel();
+                .weightsHdf5FilenameNoRoot(weightsHdf5Filename).enforceTrainingConfig(true).buildModel();
         return kerasModel.getComputationGraph();
     }
 
@@ -249,7 +249,7 @@
                                                                          String weightsHdf5Filename, boolean enforceTrainingConfig)
             throws IOException, InvalidKerasConfigurationException, UnsupportedKerasConfigurationException {
         KerasSequentialModel kerasModel = new KerasSequentialModel().modelBuilder().modelJsonFilename(modelJsonFilename)
-                .weightsHdf5Filename(weightsHdf5Filename).enforceTrainingConfig(enforceTrainingConfig)
+                .weightsHdf5FilenameNoRoot(weightsHdf5Filename).enforceTrainingConfig(enforceTrainingConfig)
                 .buildSequential();
         return kerasModel.getMultiLayerNetwork();
     }
@@ -268,7 +268,7 @@
                                                                          String weightsHdf5Filename)
             throws IOException, InvalidKerasConfigurationException, UnsupportedKerasConfigurationException {
         KerasSequentialModel kerasModel = new KerasSequentialModel().modelBuilder().modelJsonFilename(modelJsonFilename)
-                .weightsHdf5Filename(weightsHdf5Filename).enforceTrainingConfig(true).buildSequential();
+                .weightsHdf5FilenameNoRoot(weightsHdf5Filename).enforceTrainingConfig(true).buildSequential();
         return kerasModel.getMultiLayerNetwork();
     }
 
