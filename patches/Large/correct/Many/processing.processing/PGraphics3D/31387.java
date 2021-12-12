diff --git a/core/src/processing/opengl/PGraphics3D.java b/core/src/processing/opengl/PGraphics3D.java
index 3fa0490..bfced64 100644
--- a/core/src/processing/opengl/PGraphics3D.java
+++ b/core/src/processing/opengl/PGraphics3D.java
@@ -85,7 +85,7 @@
   @Override
   protected void begin2D() {
     pushProjection();
-    ortho(-width/2, +width/2, -height/2, +height/2, -1, +1);
+    ortho(-width/2, +width/2, +height/2, -height/2, -1, +1);
     pushMatrix();
     camera(width/2, height/2);
   }
