diff --git a/VisualizationModule/src/org/gephi/visualization/opengl/text/TextModel.java b/VisualizationModule/src/org/gephi/visualization/opengl/text/TextModel.java
index 586a53d..30c45df 100644
--- a/VisualizationModule/src/org/gephi/visualization/opengl/text/TextModel.java
+++ b/VisualizationModule/src/org/gephi/visualization/opengl/text/TextModel.java
@@ -268,10 +268,10 @@
         if (sizeModeClass.equals("FixedSizeMode")) {
 //            sizeMode = new FixedSizeMode(this);
             sizeMode = VizController.getInstance().getTextManager().getSizeModes()[0];
-        } else if (colorModeClass.equals("ProportionalSizeMode")) {
+        } else if (sizeModeClass.equals("ProportionalSizeMode")) {
 //            sizeMode = new ProportionalSizeMode(this);
             sizeMode = VizController.getInstance().getTextManager().getSizeModes()[2];
-        } else if (colorModeClass.equals("ScaledSizeMode")) {
+        } else if (sizeModeClass.equals("ScaledSizeMode")) {
 //            sizeMode = new ScaledSizeMode(this);
             sizeMode = VizController.getInstance().getTextManager().getSizeModes()[1];
         }
