diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/util/ConvolutionUtils.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/util/ConvolutionUtils.java
index 961a991..b4c918d 100644
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/util/ConvolutionUtils.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/util/ConvolutionUtils.java
@@ -166,7 +166,7 @@
             throw new DL4JInvalidInputException(sb.toString());
         }
 
-        if (eKernel.length == 2 && convolutionMode != ConvolutionMode.Same
+        if (eKernel.length == 3 && convolutionMode != ConvolutionMode.Same
                 && (eKernel[2] <= 0 || eKernel[2] > inShape[2] + 2 * padding[2])) {
             int inD = inShape[2];
             StringBuilder sb = new StringBuilder();
