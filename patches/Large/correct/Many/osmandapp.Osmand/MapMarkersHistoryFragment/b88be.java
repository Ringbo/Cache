diff --git a/OsmAnd/src/net/osmand/plus/mapmarkers/MapMarkersHistoryFragment.java b/OsmAnd/src/net/osmand/plus/mapmarkers/MapMarkersHistoryFragment.java
index b906f24..f2c8b76 100644
--- a/OsmAnd/src/net/osmand/plus/mapmarkers/MapMarkersHistoryFragment.java
+++ b/OsmAnd/src/net/osmand/plus/mapmarkers/MapMarkersHistoryFragment.java
@@ -46,7 +46,7 @@
 		adapter.setAdapterListener(new MapMarkersHistoryAdapter.MapMarkersHistoryAdapterListener() {
 			@Override
 			public void onItemClick(View view) {
-				int pos = recyclerView.indexOfChild(view);
+				int pos = recyclerView.getChildAdapterPosition(view);
 				Object item = adapter.getItem(pos);
 				if (item instanceof MapMarker) {
 					MapMarker marker = (MapMarker) item;
