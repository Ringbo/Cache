diff --git a/h2/src/test/org/h2/test/db/TestSpatial.java b/h2/src/test/org/h2/test/db/TestSpatial.java
index f165fc9..765e73b 100644
--- a/h2/src/test/org/h2/test/db/TestSpatial.java
+++ b/h2/src/test/org/h2/test/db/TestSpatial.java
@@ -641,7 +641,7 @@
     }
 
     private void checkSRID(byte[] bytes, int srid) {
-        Point point = (Point) ValueGeometry.get(bytes).getGeometry();
+        Point point = (Point) ValueGeometry.getFromEWKB(bytes).getGeometry();
         assertEquals(1.1, point.getX());
         assertEquals(1.2, point.getY());
         assertEquals(srid, point.getSRID());
