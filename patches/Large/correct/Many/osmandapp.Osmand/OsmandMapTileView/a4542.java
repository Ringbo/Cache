diff --git a/OsmAnd/src/net/osmand/plus/views/OsmandMapTileView.java b/OsmAnd/src/net/osmand/plus/views/OsmandMapTileView.java
index 996d3db..dad33d8 100644
--- a/OsmAnd/src/net/osmand/plus/views/OsmandMapTileView.java
+++ b/OsmAnd/src/net/osmand/plus/views/OsmandMapTileView.java
@@ -861,7 +861,7 @@
 		final boolean wasMultiTouchinZoomMode = multiTouchSupport.isInZoomMode();
 		final boolean isMultiTouch = multiTouchSupport.onTouchEvent(event);
 		doubleTapScaleDetector.onTouchEvent(event);
-		if (!isMultiTouch && !wasMultiTouchZoomMode && !doubleTapScaleDetector.isInZoomMode()) {
+		if (!isMultiTouch && !wasMultiTouchinZoomMode && !doubleTapScaleDetector.isInZoomMode()) {
 			gestureDetector.onTouchEvent(event);
 		}
 		return true;
