diff --git a/OsmAnd/src/net/osmand/plus/views/FavouritesLayer.java b/OsmAnd/src/net/osmand/plus/views/FavouritesLayer.java
index 6e96289..e0ff43b 100644
--- a/OsmAnd/src/net/osmand/plus/views/FavouritesLayer.java
+++ b/OsmAnd/src/net/osmand/plus/views/FavouritesLayer.java
@@ -143,7 +143,7 @@
 				}
 				for (FavouritePoint o : fullObjects) {
 					if (o != contextMenuLayer.getMoveableObject()) {
-						MapMarker mapMarker = mapMarkersHelper.getMapMarker(objectInMotion);
+						MapMarker mapMarker = mapMarkersHelper.getMapMarker(o);
 						drawPoint(canvas, tileBox, latLonBounds, o, mapMarker);
 					}
 				}
