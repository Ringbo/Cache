diff --git a/core/src/processing/core/PGraphics3D.java b/core/src/processing/core/PGraphics3D.java
index 12256de..9abf672 100644
--- a/core/src/processing/core/PGraphics3D.java
+++ b/core/src/processing/core/PGraphics3D.java
@@ -979,7 +979,7 @@
   protected void addPoint(int a) {
     if (pointCount == points.length) {
       int[][] temp = new int[pointCount << 1][LINE_FIELD_COUNT];
-      System.arraycopy(points, 0, temp, 0, lineCount);
+      System.arraycopy(points, 0, temp, 0, pointCount);
       points = temp;
     }
     points[pointCount][VERTEX1] = a;
