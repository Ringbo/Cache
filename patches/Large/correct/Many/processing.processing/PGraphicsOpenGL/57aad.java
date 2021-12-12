diff --git a/core/src/processing/opengl/PGraphicsOpenGL.java b/core/src/processing/opengl/PGraphicsOpenGL.java
index 484dc89..c88d0d5 100644
--- a/core/src/processing/opengl/PGraphicsOpenGL.java
+++ b/core/src/processing/opengl/PGraphicsOpenGL.java
@@ -2363,7 +2363,7 @@
       if (normalMode == NORMAL_MODE_AUTO) inGeo.calcQuadStripNormals();
       tessellator.tessellateQuadStrip();
     } else if (shape == POLYGON) {
-      tessellator.tessellatePolygon(false, mode == CLOSE,
+      tessellator.tessellatePolygon(true, mode == CLOSE,
                                     normalMode == NORMAL_MODE_AUTO);
     }
   }
