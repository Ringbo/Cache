diff --git a/deeplearning4j/deeplearning4j-core/src/test/java/org/deeplearning4j/gradientcheck/CNN1DGradientCheckTest.java b/deeplearning4j/deeplearning4j-core/src/test/java/org/deeplearning4j/gradientcheck/CNN1DGradientCheckTest.java
index 1f5de0f..44d62a9 100644
--- a/deeplearning4j/deeplearning4j-core/src/test/java/org/deeplearning4j/gradientcheck/CNN1DGradientCheckTest.java
+++ b/deeplearning4j/deeplearning4j-core/src/test/java/org/deeplearning4j/gradientcheck/CNN1DGradientCheckTest.java
@@ -82,7 +82,7 @@
                                         .build())
                                 .layer(new RnnOutputLayer.Builder(LossFunctions.LossFunction.MCXENT)
                                         .activation(Activation.SOFTMAX).nOut(finalNOut).build())
-                                .setInputType(InputType.recurrent(convNIn)).build();
+                                .setInputType(InputType.recurrent(convNIn, length)).build();
 
                         String json = conf.toJson();
                         MultiLayerConfiguration c2 = MultiLayerConfiguration.fromJson(json);
@@ -165,7 +165,7 @@
                                         .stride(stride).padding(padding).pnorm(pnorm).build())
                                 .layer(new RnnOutputLayer.Builder(LossFunctions.LossFunction.MCXENT)
                                         .activation(Activation.SOFTMAX).nOut(finalNOut).build())
-                                .setInputType(InputType.recurrent(convNIn)).build();
+                                .setInputType(InputType.recurrent(convNIn, length)).build();
 
                         String json = conf.toJson();
                         MultiLayerConfiguration c2 = MultiLayerConfiguration.fromJson(json);
@@ -241,7 +241,7 @@
                                                         .stride(stride).padding(padding).pnorm(pnorm).build())
                                         .layer(3, new RnnOutputLayer.Builder(LossFunctions.LossFunction.MCXENT)
                                                         .activation(Activation.SOFTMAX).nOut(finalNOut).build())
-                                        .setInputType(InputType.recurrent(convNIn)).build();
+                                        .setInputType(InputType.recurrent(convNIn, length)).build();
 
                         String json = conf.toJson();
                         MultiLayerConfiguration c2 = MultiLayerConfiguration.fromJson(json);
