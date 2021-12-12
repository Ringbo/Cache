diff --git a/OsmAnd/src/net/osmand/plus/OsmAndFormatter.java b/OsmAnd/src/net/osmand/plus/OsmAndFormatter.java
index 94d84b3..75f5fd3 100644
--- a/OsmAnd/src/net/osmand/plus/OsmAndFormatter.java
+++ b/OsmAnd/src/net/osmand/plus/OsmAndFormatter.java
@@ -69,11 +69,11 @@
 				pointer = 1;
 			}
 		}
-		//Miles exceptions: 2000ft->0.5mi, 1000ft->0.25mi, 1000yd->0.5mi, 500yd->0.25mi, 1000m ->0.5mi, 500m -> 0.3mi
-		if (mc == MetricsConstants.MILES_AND_METERS && roundDist == 500) {
+		//Miles exceptions: 2000ft->0.5mi, 1000ft->0.25mi, 1000yd->0.5mi, 500yd->0.25mi, 1000m ->0.5mi, 500m -> 0.25mi
+		if (mc == MetricsConstants.MILES_AND_METERS && roundDist == 1000) {
 			roundDist = 0.5f * METERS_IN_ONE_MILE;
 		} else if (mc == MetricsConstants.MILES_AND_METERS && roundDist == 500) {
-			roundDist = 0.3f * METERS_IN_ONE_MILE;
+			roundDist = 0.25f * METERS_IN_ONE_MILE;
 		} else if (mc == MetricsConstants.MILES_AND_FOOTS && roundDist == 2000 / (double) FOOTS_IN_ONE_METER) {
 			roundDist = 0.5f * METERS_IN_ONE_MILE;
 		} else if (mc == MetricsConstants.MILES_AND_FOOTS && roundDist == 1000 / (double) FOOTS_IN_ONE_METER) {
@@ -122,7 +122,7 @@
 			return MessageFormat.format("{0,number,#.##} " + ctx.getString(mainUnitStr), ((float) meters) / mainUnitInMeters).replace('\n', ' '); //$NON-NLS-1$
 		} else if (mc == MetricsConstants.MILES_AND_FOOTS && meters > 0.249f * mainUnitInMeters) {
 			return MessageFormat.format("{0,number,#.##} " + ctx.getString(mainUnitStr), ((float) meters) / mainUnitInMeters).replace('\n', ' '); //$NON-NLS-1$
-		} else if (mc == MetricsConstants.MILES_AND_METERS && meters > 0.499f * mainUnitInMeters) {
+		} else if (mc == MetricsConstants.MILES_AND_METERS && meters > 0.249f * mainUnitInMeters) {
 			return MessageFormat.format("{0,number,#.##} " + ctx.getString(mainUnitStr), ((float) meters) / mainUnitInMeters).replace('\n', ' '); //$NON-NLS-1$
 		} else if (mc == MetricsConstants.MILES_AND_YARDS && meters > 0.249f * mainUnitInMeters) {
 			return MessageFormat.format("{0,number,#.##} " + ctx.getString(mainUnitStr), ((float) meters) / mainUnitInMeters).replace('\n', ' '); //$NON-NLS-1$
