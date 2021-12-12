diff --git a/OsmAnd-java/src/net/osmand/util/GeoPolylineParserUtil.java b/OsmAnd-java/src/net/osmand/util/GeoPolylineParserUtil.java
index 7209dfc..eee0fae 100644
--- a/OsmAnd-java/src/net/osmand/util/GeoPolylineParserUtil.java
+++ b/OsmAnd-java/src/net/osmand/util/GeoPolylineParserUtil.java
@@ -15,7 +15,7 @@
 		List<LatLon> track = new ArrayList<LatLon>();
 		int index = 0;
 		int lat = 0, lng = 0;
-		double precision = 1E6;
+		double precision = 1E5;
 
 		while (index < encoded.length()) {
 			int b, shift = 0, result = 0;
