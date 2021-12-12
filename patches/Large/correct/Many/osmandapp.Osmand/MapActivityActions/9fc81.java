diff --git a/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java b/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
index ebaa324..fb0df7f 100644
--- a/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
+++ b/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
@@ -1272,7 +1272,7 @@
 					}
 				}).reg();
 		final OsmAndLocationProvider loc = app.getLocationProvider();
-		if (app.getTargetPointsHelper().getPointToNavigate() != null) {
+		if (app.getTargetPointsHelper().getPointToNavigate() != null || loc.getLocationSimulation().isRouteAnimating()) {
 			
 			optionsMenuHelper.item(loc.getLocationSimulation().isRouteAnimating() ? R.string.animate_route_off
 					: R.string.animate_route).icons(R.drawable.ic_action_play_dark, R.drawable.ic_action_play_light ) 
