diff --git a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
index 4a97093..8de6051 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
@@ -434,7 +434,7 @@
 			if(isFollowingMode) {
 				voiceRouter.arrivedDestinationPoint(description);
 			}
-			if (OsmandPlugin.onDestinationReached()) {
+			if (!OsmandPlugin.onDestinationReached()) {
 				clearCurrentRoute(null, null);
 				setRoutePlanningMode(false);
 				app.runInUIThread(new Runnable() {
