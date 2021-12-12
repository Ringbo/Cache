diff --git a/OsmAnd-java/src/net/osmand/binary/GeocodingUtilities.java b/OsmAnd-java/src/net/osmand/binary/GeocodingUtilities.java
index b301583..4adb060 100644
--- a/OsmAnd-java/src/net/osmand/binary/GeocodingUtilities.java
+++ b/OsmAnd-java/src/net/osmand/binary/GeocodingUtilities.java
@@ -151,7 +151,7 @@
 		List<GeocodingResult> lst = new ArrayList<GeocodingUtilities.GeocodingResult>();
 		List<RouteSegmentPoint> listR = new ArrayList<BinaryRoutePlanner.RouteSegmentPoint>();
 		rp.findRouteSegment(lat, lon, ctx, listR);
-		double dist = 0;
+		dist = 0;
 		TLongHashSet set = new TLongHashSet();
 		Set<String> streetNames = new HashSet<String>();
 		for(RouteSegmentPoint p : listR) {
@@ -161,7 +161,7 @@
 			}
 			boolean emptyName = Algorithms.isEmpty(road.getName()) && Algorithms.isEmpty(road.getRef()) ;
 			if(!emptyName) {
-				if(dist == 0) {
+				if(dist == 0 || dist > p.dist) {
 					dist = p.dist;
 				}
 				GeocodingResult sr = new GeocodingResult();
