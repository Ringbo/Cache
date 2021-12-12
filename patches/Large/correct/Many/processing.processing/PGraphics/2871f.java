diff --git a/core/src/processing/core/PGraphics.java b/core/src/processing/core/PGraphics.java
index 23951f3..211c0c7 100644
--- a/core/src/processing/core/PGraphics.java
+++ b/core/src/processing/core/PGraphics.java
@@ -1784,7 +1784,7 @@
     if (kind == POINT) {
       if (is3D() && len != 2 && len != 3) {
         throw new IllegalArgumentException("Use createShape(POINT, x, y) or createShape(POINT, x, y, z)");
-      } else if (len != 2) {
+      } else if (is2D() && len != 2) {
         throw new IllegalArgumentException("Use createShape(POINT, x, y)");
       }
       return createShapePrimitive(kind, p);
@@ -1792,7 +1792,7 @@
     } else if (kind == LINE) {
       if (is3D() && len != 4 && len != 6) {
         throw new IllegalArgumentException("Use createShape(LINE, x1, y1, x2, y2) or createShape(LINE, x1, y1, z1, x2, y2, z1)");
-      } else if (len != 4) {
+      } else if (is2D() && len != 4) {
         throw new IllegalArgumentException("Use createShape(LINE, x1, y1, x2, y2)");
       }
       return createShapePrimitive(kind, p);
