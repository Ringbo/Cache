diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/gradientcheck/GradientCheckUtil.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/gradientcheck/GradientCheckUtil.java
index 9af527a..41a2ec1 100644
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/gradientcheck/GradientCheckUtil.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/gradientcheck/GradientCheckUtil.java
@@ -351,7 +351,7 @@
                                          double minAbsoluteError, boolean print, boolean exitOnFirstError, INDArray[] inputs,
                                          INDArray[] labels, INDArray[] fMask, INDArray[] lMask) {
         return checkGradients(graph, epsilon, maxRelError, minAbsoluteError, print, exitOnFirstError, inputs,
-                labels, fMask, lMask);
+                labels, fMask, lMask, null);
     }
 
     public static boolean checkGradients(ComputationGraph graph, double epsilon, double maxRelError,
