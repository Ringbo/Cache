diff --git a/core/src/processing/opengl/PGraphicsOpenGL.java b/core/src/processing/opengl/PGraphicsOpenGL.java
index 0770f2d..72d7dff 100644
--- a/core/src/processing/opengl/PGraphicsOpenGL.java
+++ b/core/src/processing/opengl/PGraphicsOpenGL.java
@@ -6681,7 +6681,7 @@
     if (fragFilename == null || fragFilename.equals("")) {
       PGraphics.showWarning(MISSING_FRAGMENT_SHADER);
       return null;
-    } else if (fragFilename == null || fragFilename.equals("")) {
+    } else if (vertFilename == null || vertFilename.equals("")) {
       PGraphics.showWarning(MISSING_VERTEX_SHADER);
       return null;
     } else {
