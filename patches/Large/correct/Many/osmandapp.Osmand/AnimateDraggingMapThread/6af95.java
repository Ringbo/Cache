diff --git a/OsmAnd/src/net/osmand/plus/views/AnimateDraggingMapThread.java b/OsmAnd/src/net/osmand/plus/views/AnimateDraggingMapThread.java
index 844c6d8..461dd0e 100644
--- a/OsmAnd/src/net/osmand/plus/views/AnimateDraggingMapThread.java
+++ b/OsmAnd/src/net/osmand/plus/views/AnimateDraggingMapThread.java
@@ -219,7 +219,7 @@
 		final float mMoveY = rb.getPixYFromLatLon(startLat, startLon) - rb.getPixYFromLatLon(finalLat, finalLon);
 
 		final boolean doNotUseAnimations = tileView.getSettings().DO_NOT_USE_ANIMATIONS.get();
-		final float animationTime = doNotUseAnimations ? 0 : Math.max(450, (Math.abs(mStX) + Math.abs(mStY)) / 1200f * MOVE_MOVE_ANIMATION_TIME);
+		final float animationTime = doNotUseAnimations ? 1 : Math.max(450, (Math.abs(mStX) + Math.abs(mStY)) / 1200f * MOVE_MOVE_ANIMATION_TIME);
 
 		startThreadAnimating(new Runnable() {
 
@@ -228,7 +228,7 @@
 				setTargetValues(endZoom, 0, finalLat, finalLon);
 
 				if (moveZoom != startZoom) {
-					animatingZoomInThread(startZoom, startZoomFP, moveZoom, startZoomFP, doNotUseAnimations ? 0 : ZOOM_MOVE_ANIMATION_TIME, notifyListener);
+					animatingZoomInThread(startZoom, startZoomFP, moveZoom, startZoomFP, doNotUseAnimations ? 1 : ZOOM_MOVE_ANIMATION_TIME, notifyListener);
 				}
 
 				if (!stopped) {
@@ -239,7 +239,7 @@
 				}
 				
 				if (!stopped && (moveZoom != endZoom || startZoomFP != 0)) {
-					animatingZoomInThread(moveZoom, startZoomFP, endZoom, 0, doNotUseAnimations ? 0 : ZOOM_MOVE_ANIMATION_TIME, notifyListener);
+					animatingZoomInThread(moveZoom, startZoomFP, endZoom, 0, doNotUseAnimations ? 1 : ZOOM_MOVE_ANIMATION_TIME, notifyListener);
 				}
 				tileView.setFractionalZoom(endZoom, 0, notifyListener);
 
