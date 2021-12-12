diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/training/CenterLossOutputLayer.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/training/CenterLossOutputLayer.java
index 15d4d83..12f33d8 100755
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/training/CenterLossOutputLayer.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/training/CenterLossOutputLayer.java
@@ -86,7 +86,7 @@
         double intraClassScore = intraClassLoss.computeScore(centersForExamples, input, Activation.IDENTITY.getActivationFunction(), maskArray, false);
         intraClassScore = intraClassScore * layerConf().getLambda() / 2;
         if(System.getenv("PRINT_CENTERLOSS")!=null) {
-            System.out.println("Center loss is "+intraClassLoss);
+            System.out.println("Center loss is "+intraClassScore);
         }
 
 
