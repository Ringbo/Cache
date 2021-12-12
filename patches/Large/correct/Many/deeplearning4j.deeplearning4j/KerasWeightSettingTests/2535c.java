diff --git a/deeplearning4j-modelimport/src/test/java/org/deeplearning4j/nn/modelimport/keras/weights/KerasWeightSettingTests.java b/deeplearning4j-modelimport/src/test/java/org/deeplearning4j/nn/modelimport/keras/weights/KerasWeightSettingTests.java
index 6ad9243..a244962 100644
--- a/deeplearning4j-modelimport/src/test/java/org/deeplearning4j/nn/modelimport/keras/weights/KerasWeightSettingTests.java
+++ b/deeplearning4j-modelimport/src/test/java/org/deeplearning4j/nn/modelimport/keras/weights/KerasWeightSettingTests.java
@@ -123,7 +123,7 @@
         int mb = 42;
         int kernel = 3;
 
-        INDArray input = Nd4j.zeros(mb, 1, inputLength);
+        INDArray input = Nd4j.zeros(mb, inputLength);
         INDArray output = model.output(input);
         assert Arrays.equals(output.shape(), new int[]{mb, nOut, inputLength - kernel + 1});
     }
@@ -172,7 +172,7 @@
         assert (embeddingWeightShape[0] == nIn);
         assert (embeddingWeightShape[1] == outputDim);
 
-        INDArray inEmbedding = Nd4j.zeros(mb, 1, inputLength);
+        INDArray inEmbedding = Nd4j.zeros(mb, inputLength);
         INDArray output = model.output(inEmbedding);
         assert Arrays.equals(output.shape(), new int[]{mb, nOut, inputLength});
 
@@ -197,7 +197,7 @@
         assert (embeddingWeightShape[0] == nIn);
         assert (embeddingWeightShape[1] == outputDim);
 
-        INDArray inEmbedding = Nd4j.zeros(mb, 1, inputLength);
+        INDArray inEmbedding = Nd4j.zeros(mb,  inputLength);
         INDArray output = model.output(inEmbedding);
         assert Arrays.equals(output.shape(), new int[]{mb, nOut, inputLength - kernel + 1});
 
