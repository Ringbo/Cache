diff --git a/OsmAnd/src/net/osmand/plus/helpers/GpxUiHelper.java b/OsmAnd/src/net/osmand/plus/helpers/GpxUiHelper.java
index 0e25d29..59f3a88 100644
--- a/OsmAnd/src/net/osmand/plus/helpers/GpxUiHelper.java
+++ b/OsmAnd/src/net/osmand/plus/helpers/GpxUiHelper.java
@@ -1440,7 +1440,7 @@
 			calculatedH[k] = ph + (values.get(nextW).getY() - ph) / (values.get(nextW).getX() - pd) * (calculatedDist[k] - pd);
 		}
 
-		double SLOPE_PROXIMITY = 150;
+		double SLOPE_PROXIMITY = 100;
 
 		if (totalDistance - SLOPE_PROXIMITY < 0) {
 			if (useRightAxis) {
