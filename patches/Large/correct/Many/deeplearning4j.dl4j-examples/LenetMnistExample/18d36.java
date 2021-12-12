diff --git a/src/main/java/org/deeplearning4j/examples/convolution/LenetMnistExample.java b/src/main/java/org/deeplearning4j/examples/convolution/LenetMnistExample.java
index 8b73e26..e05048f 100644
--- a/src/main/java/org/deeplearning4j/examples/convolution/LenetMnistExample.java
+++ b/src/main/java/org/deeplearning4j/examples/convolution/LenetMnistExample.java
@@ -43,7 +43,7 @@
         int outputNum = 10;
         int numSamples = 60000;
         int batchSize = 500;
-        int iterations = 10;
+        int iterations = 1;
         int splitTrainNum = (int) (batchSize*.8);
         int seed = 123;
         int listenerFreq = iterations/5;
