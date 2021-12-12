diff --git a/OsmAnd/src/net/osmand/plus/views/OsmandMapTileView.java b/OsmAnd/src/net/osmand/plus/views/OsmandMapTileView.java
index c676f7a..56e196d 100644
--- a/OsmAnd/src/net/osmand/plus/views/OsmandMapTileView.java
+++ b/OsmAnd/src/net/osmand/plus/views/OsmandMapTileView.java
@@ -220,10 +220,10 @@
 			public void onTwoFingerTap() {
 				//afterTwoFingersTap = true;
 				if (isZoomingAllowed(getZoom(), -1.1f)) {
-					boolean mapLinked = MapActivity.getMapViewTrackingUtilities().isMapLinkedToLocation();
+					boolean mapLinked = ctx.getMapViewTrackingUtilities().isMapLinkedToLocation();
 					getAnimatedDraggingThread().startZooming(getZoom() - 1, currentViewport.getZoomFloatPart(), false);
 					if (mapLinked) {
-						MapActivity.getMapViewTrackingUtilities().setMapLinkedToLocation(true);
+						ctx.getMapViewTrackingUtilities().setMapLinkedToLocation(true);
 					}
 				}
 			}
