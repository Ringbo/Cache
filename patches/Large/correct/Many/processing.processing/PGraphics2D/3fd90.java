diff --git a/core/src/processing/core/PGraphics2D.java b/core/src/processing/core/PGraphics2D.java
index 68c19ea..0c0bfa7 100644
--- a/core/src/processing/core/PGraphics2D.java
+++ b/core/src/processing/core/PGraphics2D.java
@@ -283,7 +283,7 @@
     case TRIANGLE_FAN:
       // do fill and stroke separately because otherwise
       // the lines will be stroked more than necessary
-      if (fill) {
+      if (fill || textureImage != null) {
         fpolygon.vertexCount = 3;
 
         for (int i = 1; i < vertexCount-1; i++) {
@@ -342,7 +342,7 @@
       increment = (shape == TRIANGLES) ? 3 : 1;
       // do fill and stroke separately because otherwise
       // the lines will be stroked more than necessary
-      if (fill) {
+      if (fill || textureImage != null) {
         fpolygon.vertexCount = 3;
         for (int i = 0; i < vertexCount-2; i += increment) {
           for (int j = 0; j < 3; j++) {
@@ -379,7 +379,7 @@
       break;
 
     case QUADS:
-      if (fill) {
+      if (fill || textureImage != null) {
         fpolygon.vertexCount = 4;
         for (int i = 0; i < vertexCount-3; i += 4) {
           for (int j = 0; j < 4; j++) {
@@ -412,7 +412,7 @@
       break;
 
     case QUAD_STRIP:
-      if (fill) {
+      if (fill || textureImage != null) {
         fpolygon.vertexCount = 4;
         for (int i = 0; i < vertexCount-3; i += 2) {
           for (int j = 0; j < 4; j++) {
@@ -445,7 +445,7 @@
 
     case POLYGON:
       if (isConvex()) {
-        if (fill) {
+        if (fill || textureImage != null) {
           //System.out.println("convex");
           fpolygon.renderPolygon(vertices, vertexCount);
           //if (stroke) polygon.unexpand();
@@ -463,7 +463,7 @@
         }
       } else {  // not convex
         //System.out.println("concave");
-        if (fill) {
+        if (fill || textureImage != null) {
           // the triangulator produces polygons that don't align
           // when smoothing is enabled. but if there is a stroke around
           // the polygon, then smoothing can be temporarily disabled.
