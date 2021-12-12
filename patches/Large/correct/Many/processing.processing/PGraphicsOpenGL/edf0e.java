diff --git a/core/src/processing/opengl/PGraphicsOpenGL.java b/core/src/processing/opengl/PGraphicsOpenGL.java
index a4a660b..631672e 100644
--- a/core/src/processing/opengl/PGraphicsOpenGL.java
+++ b/core/src/processing/opengl/PGraphicsOpenGL.java
@@ -10480,6 +10480,8 @@
     // Copy many vertices using arrayCopy
     private void copyManyCoords(InGeometry in, int i0, int index, int nvert) {
       for (int i = 0; i < nvert; i++) {
+        // Position data needs to be copied in batches of three, because the
+        // input vertices don't have a w coordinate.
         int inIdx = i0 + i;
         int tessIdx = firstPolyVertex + i;
         PApplet.arrayCopy(in.vertices, 3 * inIdx,
@@ -10500,7 +10502,7 @@
                         polyNormals, 3 * firstPolyVertex, 3 * nvert);
       for (String name: polyAttribs.keySet()) {
         VertexAttribute attrib = polyAttribs.get(name);
-        if (!attrib.isPosition()) continue;
+        if (!attrib.isNormal()) continue;
         float[] inValues = in.fattribs.get(name);
         float[] tessValues = fpolyAttribs.get(name);
         PApplet.arrayCopy(inValues, 3 * i0,
