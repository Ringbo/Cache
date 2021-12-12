diff --git a/OsmAnd/src/net/osmand/plus/base/MapViewTrackingUtilities.java b/OsmAnd/src/net/osmand/plus/base/MapViewTrackingUtilities.java
index 832784c..dbb6c3c 100644
--- a/OsmAnd/src/net/osmand/plus/base/MapViewTrackingUtilities.java
+++ b/OsmAnd/src/net/osmand/plus/base/MapViewTrackingUtilities.java
@@ -199,7 +199,8 @@
 					showViewAngle = routePlanningMode; // disable compass rotation in that mode
 				}
 				registerUnregisterSensor(location);
-				if (settings.ANIMATE_MY_LOCATION.get() && !smallSpeedForAnimation && !movingToMyLocation) {
+				if (settings.ANIMATE_MY_LOCATION.get() && !smallSpeedForAnimation && !movingToMyLocation &&
+						settings.WAKE_ON_VOICE_INT.get() == 0) {
 					mapView.getAnimatedDraggingThread().startMoving(
 							location.getLatitude(), location.getLongitude(), zoom, rotation, false);
 				} else {
