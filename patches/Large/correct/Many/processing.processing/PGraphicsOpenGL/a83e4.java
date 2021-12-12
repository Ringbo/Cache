diff --git a/core/src/processing/opengl/PGraphicsOpenGL.java b/core/src/processing/opengl/PGraphicsOpenGL.java
index 744c889..7506da9 100644
--- a/core/src/processing/opengl/PGraphicsOpenGL.java
+++ b/core/src/processing/opengl/PGraphicsOpenGL.java
@@ -5928,7 +5928,7 @@
   protected void createPTexture() {
     updatePixelSize();
     if (texture != null) {
-      texture = new Texture(this, pixelWidth, pixelHeight, texture.getParameters());
+      ptexture = new Texture(this, pixelWidth, pixelHeight, texture.getParameters());
       ptexture.invertedY(true);
       ptexture.colorBuffer(true);
     }
