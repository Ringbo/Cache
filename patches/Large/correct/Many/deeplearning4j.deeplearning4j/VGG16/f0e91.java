diff --git a/deeplearning4j-zoo/src/main/java/org/deeplearning4j/zoo/model/VGG16.java b/deeplearning4j-zoo/src/main/java/org/deeplearning4j/zoo/model/VGG16.java
index 6e4a806..7bc9838 100644
--- a/deeplearning4j-zoo/src/main/java/org/deeplearning4j/zoo/model/VGG16.java
+++ b/deeplearning4j-zoo/src/main/java/org/deeplearning4j/zoo/model/VGG16.java
@@ -77,7 +77,7 @@
 
     @Override
     public Class<? extends Model> modelType() {
-        return ComputationGraph.class;
+        return MultiLayerNetwork.class;
     }
 
     public MultiLayerConfiguration conf() {
