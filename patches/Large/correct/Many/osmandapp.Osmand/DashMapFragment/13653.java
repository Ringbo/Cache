diff --git a/OsmAnd/src/net/osmand/plus/dashboard/DashMapFragment.java b/OsmAnd/src/net/osmand/plus/dashboard/DashMapFragment.java
index 0dccdf5..83c761c 100644
--- a/OsmAnd/src/net/osmand/plus/dashboard/DashMapFragment.java
+++ b/OsmAnd/src/net/osmand/plus/dashboard/DashMapFragment.java
@@ -81,7 +81,7 @@
 		osmandMapTileView = surf.getMapView();
 		osmandMapTileView.getView().setVisibility(View.VISIBLE);
 		osmandMapTileView.removeAllLayers();
-		MapVectorLayer mapVectorLayer = new MapVectorLayer(null);
+		MapVectorLayer mapVectorLayer = new MapVectorLayer(null, true);
 		MapTextLayer mapTextLayer = new MapTextLayer();
 		mapTextLayer.setAlwaysVisible(true);
 		// 5.95 all labels
