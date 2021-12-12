diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/convolution/KernelValidationUtil.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/convolution/KernelValidationUtil.java
index 8edf50c..39cb857 100644
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/convolution/KernelValidationUtil.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/convolution/KernelValidationUtil.java
@@ -11,12 +11,13 @@
     public static void validateShapes(int inHeight, int inWidth, int kernelHeight, int kernelWidth, int strideHeight,
                                int strideWidth, int padHeight, int padWidth) {
 
-        // Check filter >= size + padding
-        if (kernelHeight >= (inHeight + 2*padHeight))
+        
+        // Check filter > size + padding
+        if (kernelHeight > (inHeight + 2*padHeight))
             throw new InvalidInputTypeException("Invalid input: activations into layer are h=" + inHeight
                     + " but kernel size is " + kernelHeight + " with padding " + padHeight);
 
-        if (kernelWidth >= (inWidth + 2*padWidth))
+        if (kernelWidth > (inWidth + 2*padWidth))
             throw new InvalidInputTypeException("Invalid input: activations into layer are w=" + inWidth +
                     " but kernel size is " + kernelWidth + " with padding " + padWidth);
 
