diff --git a/android/core/src/processing/opengl/PGraphicsOpenGL.java b/android/core/src/processing/opengl/PGraphicsOpenGL.java
index 44c5eed..62be761 100644
--- a/android/core/src/processing/opengl/PGraphicsOpenGL.java
+++ b/android/core/src/processing/opengl/PGraphicsOpenGL.java
@@ -1897,7 +1897,7 @@
     } else if (type == LINES) {
       shape = new PShape3D(parent, PShape.GEOMETRY);
       shape.setKind(LINES);
-    } else if (type == TRIANGLES) {
+    } else if (type == TRIANGLE || type == TRIANGLES) {
       shape = new PShape3D(parent, PShape.GEOMETRY);
       shape.setKind(TRIANGLES);
     } else if (type == TRIANGLE_FAN) {
@@ -1906,7 +1906,7 @@
     } else if (type == TRIANGLE_STRIP) {      
       shape = new PShape3D(parent, PShape.GEOMETRY);
       shape.setKind(TRIANGLE_STRIP);
-    } else if (type == QUADS) {
+    } else if (type == QUADS || type == QUADS) {
       shape = new PShape3D(parent, PShape.GEOMETRY);
       shape.setKind(QUADS);
     } else if (type == QUAD_STRIP) {
