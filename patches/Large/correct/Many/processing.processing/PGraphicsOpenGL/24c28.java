diff --git a/core/src/processing/opengl/PGraphicsOpenGL.java b/core/src/processing/opengl/PGraphicsOpenGL.java
index 72d7dff..03df5d4 100644
--- a/core/src/processing/opengl/PGraphicsOpenGL.java
+++ b/core/src/processing/opengl/PGraphicsOpenGL.java
@@ -6025,7 +6025,7 @@
     } else if (blendMode == SUBTRACT) {
       if (blendEqSupported) {
         pgl.blendEquation(PGL.FUNC_REVERSE_SUBTRACT);
-        pgl.blendFunc(PGL.ONE, PGL.SRC_ALPHA);
+        pgl.blendFunc(PGL.SRC_ALPHA, PGL.ONE);
       } else {
         PGraphics.showWarning(BLEND_DRIVER_ERROR, "SUBTRACT");
       }
