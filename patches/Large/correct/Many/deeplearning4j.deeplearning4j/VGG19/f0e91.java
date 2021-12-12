diff --git a/deeplearning4j-zoo/src/main/java/org/deeplearning4j/zoo/model/VGG19.java b/deeplearning4j-zoo/src/main/java/org/deeplearning4j/zoo/model/VGG19.java
index 7e20e61..cdd72e1 100644
--- a/deeplearning4j-zoo/src/main/java/org/deeplearning4j/zoo/model/VGG19.java
+++ b/deeplearning4j-zoo/src/main/java/org/deeplearning4j/zoo/model/VGG19.java
@@ -65,7 +65,7 @@
 
     @Override
     public Class<? extends Model> modelType() {
-        return ComputationGraph.class;
+        return MultiLayerNetwork.class;
     }
 
     public MultiLayerConfiguration conf() {
