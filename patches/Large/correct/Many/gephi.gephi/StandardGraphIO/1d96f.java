diff --git a/modules/VisualizationImpl/src/main/java/org/gephi/visualization/swing/StandardGraphIO.java b/modules/VisualizationImpl/src/main/java/org/gephi/visualization/swing/StandardGraphIO.java
index fd49c8a..67b74a9 100644
--- a/modules/VisualizationImpl/src/main/java/org/gephi/visualization/swing/StandardGraphIO.java
+++ b/modules/VisualizationImpl/src/main/java/org/gephi/visualization/swing/StandardGraphIO.java
@@ -470,7 +470,7 @@
         float newCameraLocation = Math.max(newCameraLocationX, newCameraLocationY);
 
         graphDrawable.cameraLocation[0] = limits.getMinXoctree() + graphWidth / 2;
-        graphDrawable.cameraLocation[1] = limits.getMinYoctree() + graphWidth / 2;
+        graphDrawable.cameraLocation[1] = limits.getMinYoctree() + graphHeight / 2;
         graphDrawable.cameraLocation[2] = newCameraLocation;
 
         graphDrawable.cameraTarget[0] = graphDrawable.cameraLocation[0];
