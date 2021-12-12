diff --git a/OsmAnd/src/net/osmand/plus/routing/RouteCalculationResult.java b/OsmAnd/src/net/osmand/plus/routing/RouteCalculationResult.java
index 432894a..7d012c9 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RouteCalculationResult.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RouteCalculationResult.java
@@ -725,7 +725,7 @@
 	}
 	
 	public Location getLocationFromRouteDirection(RouteDirectionInfo i){
-		if(i.routePointOffset < locations.size()){
+		if(i != null && locations != null && i.routePointOffset < locations.size()){
 			return locations.get(i.routePointOffset);
 		}
 		return null;
