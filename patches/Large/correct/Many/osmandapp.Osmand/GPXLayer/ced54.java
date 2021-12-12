diff --git a/OsmAnd/src/net/osmand/plus/views/GPXLayer.java b/OsmAnd/src/net/osmand/plus/views/GPXLayer.java
index 55223e7..5ef2974 100644
--- a/OsmAnd/src/net/osmand/plus/views/GPXLayer.java
+++ b/OsmAnd/src/net/osmand/plus/views/GPXLayer.java
@@ -302,7 +302,7 @@
 		for (SelectedGpxFile g : selectedGPXFiles) {
 			List<TrkSegment> points = g.getPointsToDisplay();
 			boolean routePoints = g.isRoutePoints();
-			updatePaints(g.getColor(), g.isShowCurrentTrack(), routePoints, settings, tileBox);
+			updatePaints(g.getColor(), routePoints, g.isShowCurrentTrack(), settings, tileBox);
 			drawSegments(canvas, tileBox, points);
 		}
 	}
