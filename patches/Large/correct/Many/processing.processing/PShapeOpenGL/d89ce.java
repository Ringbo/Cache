diff --git a/core/src/processing/opengl/PShapeOpenGL.java b/core/src/processing/opengl/PShapeOpenGL.java
index a771ff0..d41f313 100644
--- a/core/src/processing/opengl/PShapeOpenGL.java
+++ b/core/src/processing/opengl/PShapeOpenGL.java
@@ -173,7 +173,7 @@
   protected boolean needBufferInit = false;
 
   // Flag to indicate if the shape can have holes or not.
-  protected boolean solid;
+  protected boolean solid = true;
 
   protected boolean breakShape = false;
   protected boolean shapeCreated = false;
@@ -2995,7 +2995,7 @@
     if (rounded) {
       saveBezierVertexSettings();
       inGeo.addRect(a, b, c, d, tl, tr, br, bl, stroke);
-      tessellator.tessellatePolygon(false, true, true);
+      tessellator.tessellatePolygon(true, true, true);
       restoreBezierVertexSettings();
     } else {
       inGeo.addRect(a, b, c, d, stroke);
@@ -3289,7 +3289,7 @@
       saveCurveVertexSettings();
       tessellator.resetCurveVertexCount();
     }
-    tessellator.tessellatePolygon(false, close, true);
+    tessellator.tessellatePolygon(true, close, true);
     if (bez || quad) restoreBezierVertexSettings();
     if (curv) restoreCurveVertexSettings();
   }
