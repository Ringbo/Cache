diff --git a/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/convolution/SubsamplingLayerTest.java b/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/convolution/SubsamplingLayerTest.java
index 5cef625..4da7ed0 100644
--- a/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/convolution/SubsamplingLayerTest.java
+++ b/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/layers/convolution/SubsamplingLayerTest.java
@@ -268,7 +268,7 @@
                         .build())
                 .layer(1, new SubsamplingLayer.Builder()
                         .poolingType(SubsamplingLayer.PoolingType.MAX)
-                        .kernelSize(imageHeight-kernelHeight+1,1)
+                        .kernelSize(imageHeight-kernelHeight+2,1)   //imageHeight-kernelHeight+1 is ok: full height
                         .stride(1,1)
                         .build())
                 .layer(2, new OutputLayer.Builder()
