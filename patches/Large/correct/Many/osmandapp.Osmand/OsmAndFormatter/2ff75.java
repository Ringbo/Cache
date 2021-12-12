diff --git a/OsmAnd/src/net/osmand/plus/OsmAndFormatter.java b/OsmAnd/src/net/osmand/plus/OsmAndFormatter.java
index 5b57871..8eab765 100644
--- a/OsmAnd/src/net/osmand/plus/OsmAndFormatter.java
+++ b/OsmAnd/src/net/osmand/plus/OsmAndFormatter.java
@@ -132,7 +132,7 @@
 			return (kmh10 / 10f) + " " + ctx.getString(R.string.km_h);
 		} else {
 			float mph = kmh * METERS_IN_KILOMETER / METERS_IN_ONE_MILE;
-			if (mph >= 10) {
+			if (mph >= 10 || am.hasFastSpeed()) {
 				return ((int) Math.round(mph)) + " " + ctx.getString(R.string.mile_per_hour);
 			} else {
 				int mph10 = (int) Math.round(mph * 10f);
