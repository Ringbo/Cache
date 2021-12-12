diff --git a/OsmAnd/src/net/osmand/plus/base/MapViewTrackingUtilities.java b/OsmAnd/src/net/osmand/plus/base/MapViewTrackingUtilities.java
index e8b9d5a..ce0478f 100644
--- a/OsmAnd/src/net/osmand/plus/base/MapViewTrackingUtilities.java
+++ b/OsmAnd/src/net/osmand/plus/base/MapViewTrackingUtilities.java
@@ -197,7 +197,7 @@
 					// decrease a bit
 					zdelta += 1;
 				}
-				double targetZoom = Math.max(tb.getZoom() + tb.getZoomFloatPart() + zdelta, settings.AUTO_ZOOM_MAP.get().maxZoom); 
+				double targetZoom = Math.min(tb.getZoom() + tb.getZoomFloatPart() + zdelta, settings.AUTO_ZOOM_MAP.get().maxZoom); 
 				int threshold = settings.AUTO_FOLLOW_ROUTE.get();
 				if (now - lastTimeAutoZooming > 4500 && (now - lastTimeAutoZooming > threshold || !isUserZoomed)) {
 					isUserZoomed = false;
