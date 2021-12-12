diff --git a/presto-geospatial/src/main/java/com/facebook/presto/plugin/geospatial/BingTileFunctions.java b/presto-geospatial/src/main/java/com/facebook/presto/plugin/geospatial/BingTileFunctions.java
index 5ec47e2..70abb99 100644
--- a/presto-geospatial/src/main/java/com/facebook/presto/plugin/geospatial/BingTileFunctions.java
+++ b/presto-geospatial/src/main/java/com/facebook/presto/plugin/geospatial/BingTileFunctions.java
@@ -362,7 +362,7 @@
 
     private static Point tileXYToLatitudeLongitude(int tileX, int tileY, int zoomLevel)
     {
-        int mapSize = mapSize(zoomLevel);
+        long mapSize = mapSize(zoomLevel);
         double x = (clip(tileX * TILE_PIXELS, 0, mapSize) / mapSize) - 0.5;
         double y = 0.5 - (clip(tileY * TILE_PIXELS, 0, mapSize) / mapSize);
 
@@ -377,7 +377,7 @@
         double sinLatitude = Math.sin(latitude * Math.PI / 180);
         double y = 0.5 - Math.log((1 + sinLatitude) / (1 - sinLatitude)) / (4 * Math.PI);
 
-        int mapSize = mapSize(zoomLevel);
+        long mapSize = mapSize(zoomLevel);
         int tileX = (int) clip(x * mapSize, 0, mapSize - 1);
         int tileY = (int) clip(y * mapSize, 0, mapSize - 1);
         return BingTile.fromCoordinates(tileX / TILE_PIXELS, tileY / TILE_PIXELS, zoomLevel);
@@ -467,8 +467,8 @@
         return Math.min(Math.max(n, minValue), maxValue);
     }
 
-    private static int mapSize(int zoomLevel)
+    private static long mapSize(int zoomLevel)
     {
-        return 256 << zoomLevel;
+        return 256L << zoomLevel;
     }
 }
