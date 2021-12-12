diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/multilayer/MultiLayerNetwork.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/multilayer/MultiLayerNetwork.java
index e95725b..1e309a6 100755
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/multilayer/MultiLayerNetwork.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/multilayer/MultiLayerNetwork.java
@@ -1573,7 +1573,7 @@
     *
     * @return trainingListeners
     */
-   public Collection<IterationListener> getTrainingListeners() {
+   public Collection<trainingListeners> getTrainingListeners() {
        return trainingListeners;
    }
 
