diff --git a/OsmAnd-java/src/net/osmand/util/MapUtils.java b/OsmAnd-java/src/net/osmand/util/MapUtils.java
index 5246883..a13ff81 100644
--- a/OsmAnd-java/src/net/osmand/util/MapUtils.java
+++ b/OsmAnd-java/src/net/osmand/util/MapUtils.java
@@ -120,7 +120,7 @@
 	}
 
 	public static double checkLongitude(double longitude) {
-		if (longitude > MIN_LONGITUDE && longitude <= MAX_LONGITUDE) {
+		if (longitude >= MIN_LONGITUDE && longitude <= MAX_LONGITUDE) {
 			return longitude;
 		}
 		while (longitude <= MIN_LONGITUDE || longitude > MAX_LONGITUDE) {
