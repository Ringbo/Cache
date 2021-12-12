diff --git a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
index 095b3c2..ce93989 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
@@ -462,7 +462,7 @@
 		if (serviceToUse == RouteService.OSMAND && !settings.USE_OSMAND_ROUTING_SERVICE_ALWAYS.get()) {
 			double distance = MapUtils.getDistance(end, start.getLatitude(), start.getLongitude());
 			if (distance > DISTANCE_TO_USE_OSMAND_ROUTER) {
-				showMessage(context.getString(R.string.osmand_routing_experimental));
+				showMessage(context.getString(R.string.osmand_routing_experimental), Toast.LENGTH_LONG);
 				serviceToUse = RouteService.CLOUDMADE;
 			}
 		}
