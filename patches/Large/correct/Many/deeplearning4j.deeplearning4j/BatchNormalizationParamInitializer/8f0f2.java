diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/params/BatchNormalizationParamInitializer.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/params/BatchNormalizationParamInitializer.java
index 01f9769..d1c1d8c 100644
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/params/BatchNormalizationParamInitializer.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/params/BatchNormalizationParamInitializer.java
@@ -32,7 +32,7 @@
         BatchNormalization normalization = (BatchNormalization) conf.getLayer();
         int size = ArrayUtil.prod(normalization.getShape());
 
-        params.put(AVG_MEAN, Nd4j.zeros(1,size,1));
+        params.put(AVG_MEAN, Nd4j.zeros(1,size));
         params.put(AVG_VAR,Nd4j.zerosLike(params.get(AVG_MEAN)));
 
 
