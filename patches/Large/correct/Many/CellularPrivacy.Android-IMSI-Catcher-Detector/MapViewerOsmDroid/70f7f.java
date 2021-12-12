diff --git a/app/src/main/java/com/SecUpwN/AIMSICD/activities/MapViewerOsmDroid.java b/app/src/main/java/com/SecUpwN/AIMSICD/activities/MapViewerOsmDroid.java
index a0aebc3..c94675e 100644
--- a/app/src/main/java/com/SecUpwN/AIMSICD/activities/MapViewerOsmDroid.java
+++ b/app/src/main/java/com/SecUpwN/AIMSICD/activities/MapViewerOsmDroid.java
@@ -211,22 +211,13 @@
         }
     }
 
-    // E:V:A 20150105
-    // TODO: Remove HYBRID and SATELLITE MAP choices as they don't work!
-    // See: https://github.com/SecUpwN/Android-IMSI-Catcher-Detector/issues/228
     private void setupMapType(int mapType) {
         mMap.setTileSource(TileSourceFactory.DEFAULT_TILE_SOURCE);
         switch (mapType) {
             case 0:
                 mMap.setTileSource(TileSourceFactory.DEFAULT_TILE_SOURCE); //setMapType(GoogleMap.MAP_TYPE_NORMAL);
                 break;
-            //case 1:
-            //    mMap.setTileSource(TileSourceFactory.MAPNIK); //.setMapType(GoogleMap.MAP_TYPE_HYBRID);
-            //    break;
-            //case 2:
-            //    mMap.setTileSource(TileSourceFactory.MAPQUESTAERIAL); //.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
-            //    break;
-            case 3:
+            case 1:
                 mMap.setTileSource(TileSourceFactory.CYCLEMAP); //.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                 break;
             default:
