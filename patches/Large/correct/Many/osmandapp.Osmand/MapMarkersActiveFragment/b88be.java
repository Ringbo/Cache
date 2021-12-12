diff --git a/OsmAnd/src/net/osmand/plus/mapmarkers/MapMarkersActiveFragment.java b/OsmAnd/src/net/osmand/plus/mapmarkers/MapMarkersActiveFragment.java
index 8490060..0472875 100644
--- a/OsmAnd/src/net/osmand/plus/mapmarkers/MapMarkersActiveFragment.java
+++ b/OsmAnd/src/net/osmand/plus/mapmarkers/MapMarkersActiveFragment.java
@@ -49,7 +49,7 @@
 
 			@Override
 			public void onItemClick(View view) {
-				int pos = recyclerView.indexOfChild(view);
+				int pos = recyclerView.getChildAdapterPosition(view);
 				MapMarker marker = adapter.getItem(pos);
 				mapActivity.getMyApplication().getSettings().setMapLocationToShow(marker.getLatitude(), marker.getLongitude(),
 						15, marker.getPointDescription(mapActivity), true, marker);
