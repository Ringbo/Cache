diff --git a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
index c9c62bb..6736e5c 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
@@ -303,7 +303,7 @@
 			RouteCalculationResult previousRoute, boolean targetPointsChanged) {
 		Location locationProjection = currentLocation;
 		if (isPublicTransportMode() && currentLocation != null && finalLocation != null &&
-				(targetPointsChanged || transportRoutingHelper.getRoutes() == null)) {
+				(targetPointsChanged || transportRoutingHelper.getStartLocation() == null)) {
 			transportRoutingHelper.setFinalAndCurrentLocation(finalLocation,
 					new LatLon(currentLocation.getLatitude(), currentLocation.getLongitude()));
 		}
