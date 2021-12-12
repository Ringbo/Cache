diff --git a/OsmAnd/src/net/osmand/plus/OsmAndFormatter.java b/OsmAnd/src/net/osmand/plus/OsmAndFormatter.java
index b11fc6a..3b33103 100644
--- a/OsmAnd/src/net/osmand/plus/OsmAndFormatter.java
+++ b/OsmAnd/src/net/osmand/plus/OsmAndFormatter.java
@@ -117,7 +117,7 @@
 			return MessageFormat.format("{0,number,#.##} " + ctx.getString(mainUnitStr), ((float) meters) / mainUnitInMeters).replace('\n', ' '); //$NON-NLS-1$
 		} else if (mc == MetricsConstants.MILES_AND_YARDS && meters > 0.249f * mainUnitInMeters) {
 			return MessageFormat.format("{0,number,#.##} " + ctx.getString(mainUnitStr), ((float) meters) / mainUnitInMeters).replace('\n', ' '); //$NON-NLS-1$
-		} else if (mc == MetricsConstants.NAUTICAL_MILES && meters > 0.09f * mainUnitInMeters) {
+		} else if (mc == MetricsConstants.NAUTICAL_MILES && meters > 0.99f * mainUnitInMeters) {
 			return MessageFormat.format("{0,number,#.##} " + ctx.getString(mainUnitStr), ((float) meters) / mainUnitInMeters).replace('\n', ' '); //$NON-NLS-1$
 		} else {
 			if (mc == MetricsConstants.KILOMETERS_AND_METERS) {
