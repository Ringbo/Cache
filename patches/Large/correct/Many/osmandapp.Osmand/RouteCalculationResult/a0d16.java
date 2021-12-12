diff --git a/OsmAnd/src/net/osmand/plus/routing/RouteCalculationResult.java b/OsmAnd/src/net/osmand/plus/routing/RouteCalculationResult.java
index 2da7f92..e0a66e9 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RouteCalculationResult.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RouteCalculationResult.java
@@ -500,7 +500,7 @@
 	 */
 	private void introduceFirstPointAndLastPoint(List<Location> locations, List<RouteDirectionInfo> directions, List<RouteSegmentResult> segs, Location start, 
 			LatLon end) {
-		if (!locations.isEmpty() && locations.get(0).distanceTo(start) > 200) {
+		if (!locations.isEmpty() && locations.get(0).distanceTo(start) > 50) {
 			// add start point
 			locations.add(0, start);
 			if(segs != null) {
