diff --git a/core/src/processing/core/PGraphics3D.java b/core/src/processing/core/PGraphics3D.java
index bf3c743..ba5af3c 100644
--- a/core/src/processing/core/PGraphics3D.java
+++ b/core/src/processing/core/PGraphics3D.java
@@ -608,7 +608,7 @@
       endShapeStroke(mode);
     }
 
-    if (fill) {
+    if (fill || textureImage != null) {
       endShapeFill();
     }
 
@@ -622,7 +622,7 @@
     // render shape and fill here if not saving the shapes for later
     // if true, the shapes will be rendered on endDraw
     if (!hints[ENABLE_DEPTH_SORT]) {
-      if (fill) {
+      if (fill || textureImage != null) {
         if (triangleCount > 0) {
           renderTriangles(0, triangleCount);
           if (raw != null) {
