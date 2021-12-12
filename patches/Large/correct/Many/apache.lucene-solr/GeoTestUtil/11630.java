diff --git a/lucene/test-framework/src/java/org/apache/lucene/geo/GeoTestUtil.java b/lucene/test-framework/src/java/org/apache/lucene/geo/GeoTestUtil.java
index 8817d20..bb29b0b 100644
--- a/lucene/test-framework/src/java/org/apache/lucene/geo/GeoTestUtil.java
+++ b/lucene/test-framework/src/java/org/apache/lucene/geo/GeoTestUtil.java
@@ -245,7 +245,7 @@
       return new double[] { nextLatitudeBetween(polygon.minLat, polygon.maxLat), nextLongitudeBetween(polygon.minLon, polygon.maxLon) };
     } else if (surpriseMe < 20) {
       // target a vertex
-      int vertex = randomInt(polyLats.length - 1);
+      int vertex = randomInt(polyLats.length - 2);
       return new double[] { nextLatitudeNear(polyLats[vertex], polyLats[vertex+1] - polyLats[vertex]), 
                             nextLongitudeNear(polyLons[vertex], polyLons[vertex+1] - polyLons[vertex]) };
     } else if (surpriseMe < 30) {
@@ -253,12 +253,12 @@
       Polygon container = boxPolygon(new Rectangle(polygon.minLat, polygon.maxLat, polygon.minLon, polygon.maxLon));
       double containerLats[] = container.getPolyLats();
       double containerLons[] = container.getPolyLons();
-      int startVertex = randomInt(containerLats.length - 1);
+      int startVertex = randomInt(containerLats.length - 2);
       return nextPointAroundLine(containerLats[startVertex], containerLons[startVertex], 
                                  containerLats[startVertex+1], containerLons[startVertex+1]);
     } else {
       // target points around diagonals between vertices
-      int startVertex = randomInt(polyLats.length - 1);
+      int startVertex = randomInt(polyLats.length - 2);
       // but favor edges heavily
       int endVertex = randomBoolean() ? startVertex + 1 : randomInt(polyLats.length - 1);
       return nextPointAroundLine(polyLats[startVertex], polyLons[startVertex], 
