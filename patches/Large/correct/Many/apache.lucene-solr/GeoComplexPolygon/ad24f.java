diff --git a/lucene/spatial3d/src/java/org/apache/lucene/spatial3d/geom/GeoComplexPolygon.java b/lucene/spatial3d/src/java/org/apache/lucene/spatial3d/geom/GeoComplexPolygon.java
index 5e91fa7..7f8f649 100644
--- a/lucene/spatial3d/src/java/org/apache/lucene/spatial3d/geom/GeoComplexPolygon.java
+++ b/lucene/spatial3d/src/java/org/apache/lucene/spatial3d/geom/GeoComplexPolygon.java
@@ -492,7 +492,7 @@
         if (left != null && left.traverse(edgeIterator, minValue, maxValue) == false) {
           return false;
         }
-        if (right != null && minValue >= low && right.traverse(edgeIterator, minValue, maxValue) == false) {
+        if (right != null && maxValue >= low && right.traverse(edgeIterator, minValue, maxValue) == false) {
           return false;
         }
       }
