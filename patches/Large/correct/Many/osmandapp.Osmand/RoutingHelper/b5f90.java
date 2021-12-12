diff --git a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
index ac932b2..708decc 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
@@ -483,7 +483,7 @@
 			route.passIntermediatePoint();
 			TargetPointsHelper targets = app.getTargetPointsHelper();
 			String name = "";
-			if(intermediatePoints != null ) {
+			if(intermediatePoints != null && !intermediatePoints.isEmpty()) {
 				LatLon rm = intermediatePoints.remove(0);
 				List<TargetPoint> ll = targets.getIntermediatePointsNavigation();
 				int ind = -1;
