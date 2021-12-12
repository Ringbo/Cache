diff --git a/OsmAnd/src/net/osmand/plus/activities/MapActivity.java b/OsmAnd/src/net/osmand/plus/activities/MapActivity.java
index 198427a..5b09233 100644
--- a/OsmAnd/src/net/osmand/plus/activities/MapActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/MapActivity.java
@@ -844,7 +844,7 @@
 
 		// Update information 
 		mapLayers.getLocationLayer().setLastKnownLocation(updatedLocation);
-		if (location != null) {
+		if (updatedLocation != null) {
 			updateAutoMapViewConfiguration(updatedLocation);
 		} else {
 			if (mapLayers.getMapInfoLayer().getBackToLocation().isEnabled()) {
