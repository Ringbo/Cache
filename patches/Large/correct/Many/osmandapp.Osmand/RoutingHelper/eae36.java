diff --git a/OsmAnd/src/net/osmand/plus/activities/RoutingHelper.java b/OsmAnd/src/net/osmand/plus/activities/RoutingHelper.java
index 79f230b..3444e83 100644
--- a/OsmAnd/src/net/osmand/plus/activities/RoutingHelper.java
+++ b/OsmAnd/src/net/osmand/plus/activities/RoutingHelper.java
@@ -325,7 +325,7 @@
 
 		lastFixedLocation = currentLocation;
 		if(calculateRoute){
-			calculateRoute(lastFixedLocation, finalLocation, currentGPXRoute);
+			recalculateRouteInBackground(lastFixedLocation, finalLocation, currentGPXRoute);
 		}
 	}
 	
@@ -422,7 +422,7 @@
 		return 0;
 	}
 	
-	public void calculateRoute(final Location start, final LatLon end, final List<Location> currentGPXRoute){
+	private void recalculateRouteInBackground(final Location start, final LatLon end, final List<Location> currentGPXRoute){
 		if(start == null || end == null){
 			return;
 		}
