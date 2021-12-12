diff --git a/OsmAnd/src/net/osmand/plus/MapMarkersHelper.java b/OsmAnd/src/net/osmand/plus/MapMarkersHelper.java
index ba314ee..59c36a6 100644
--- a/OsmAnd/src/net/osmand/plus/MapMarkersHelper.java
+++ b/OsmAnd/src/net/osmand/plus/MapMarkersHelper.java
@@ -282,7 +282,7 @@
 	}
 
 	private void removeFromMapMarkersList(MapMarker marker) {
-		List<MapMarker> copyList = new ArrayList<>();
+		List<MapMarker> copyList = new ArrayList<>(mapMarkers);
 		copyList.remove(marker);
 		mapMarkers = copyList;
 	}
@@ -302,7 +302,7 @@
 	}
 
 	private void addToMapMarkersList(int position, List<MapMarker> markers) {
-		List<MapMarker> copyList = new ArrayList<>();
+		List<MapMarker> copyList = new ArrayList<>(mapMarkers);
 		copyList.addAll(position, markers);
 		mapMarkers = copyList;
 	}
