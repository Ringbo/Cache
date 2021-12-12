diff --git a/OsmAnd/src/net/osmand/plus/activities/ShowRouteInfoDialogFragment.java b/OsmAnd/src/net/osmand/plus/activities/ShowRouteInfoDialogFragment.java
index 1d4a906..746d58a 100644
--- a/OsmAnd/src/net/osmand/plus/activities/ShowRouteInfoDialogFragment.java
+++ b/OsmAnd/src/net/osmand/plus/activities/ShowRouteInfoDialogFragment.java
@@ -395,7 +395,7 @@
 						gpxItem);
 
 				final MapRouteInfoMenu mapRouteInfoMenu = activity.getMapLayers().getMapControlsLayer().getMapRouteInfoMenu();
-				if (mapRouteInfoMenu.isVisible()) {
+				if (MapRouteInfoMenu.isVisible()) {
 					// We arrived here by the route info menu.
 					// First, we close it and then show the details.
 					mapRouteInfoMenu.setOnDismissListener(new OnDismissListener() {
