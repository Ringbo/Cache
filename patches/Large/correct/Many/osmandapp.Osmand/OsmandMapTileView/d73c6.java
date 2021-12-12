diff --git a/OsmAnd/src/net/osmand/plus/views/OsmandMapTileView.java b/OsmAnd/src/net/osmand/plus/views/OsmandMapTileView.java
index aec9ba5..f78d82a 100644
--- a/OsmAnd/src/net/osmand/plus/views/OsmandMapTileView.java
+++ b/OsmAnd/src/net/osmand/plus/views/OsmandMapTileView.java
@@ -219,7 +219,7 @@
 			@Override
 			public void onTwoFingerTap() {
 				//afterTwoFingersTap = true;
-				if (isZoomingAllowed(getZoom(), -1)) {
+				if (isZoomingAllowed(getZoom(), -1.1f)) {
 					getAnimatedDraggingThread().startZooming(getZoom() - 1, currentViewport.getZoomFloatPart(), true);
 				}
 			}
