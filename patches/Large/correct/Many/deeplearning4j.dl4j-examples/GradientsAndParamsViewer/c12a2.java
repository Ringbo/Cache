diff --git a/dl4j-examples/src/main/java/org/deeplearning4j/examples/userInterface/util/GradientsAndParamsViewer.java b/dl4j-examples/src/main/java/org/deeplearning4j/examples/userInterface/util/GradientsAndParamsViewer.java
index 34ab819..427fa20 100644
--- a/dl4j-examples/src/main/java/org/deeplearning4j/examples/userInterface/util/GradientsAndParamsViewer.java
+++ b/dl4j-examples/src/main/java/org/deeplearning4j/examples/userInterface/util/GradientsAndParamsViewer.java
@@ -185,7 +185,7 @@
                 shapesGroup.getChildren().add(this);
                 initialized = true;
             }
-            if (needsUpdate) {
+            if (needsUpdate || stepping || paused) {
                 //double hue=360.0/(1+ Math.exp(gradientFactor*lastGradient));
                 double hue = 260 - 260.0 / (1 + Math.exp(gradientFactor * lastGradient));
                 // Blue is negative, Green is near zero, Red is positive.
