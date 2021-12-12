diff --git a/src/org/andengine/input/touch/detector/PinchZoomDetector.java b/src/org/andengine/input/touch/detector/PinchZoomDetector.java
index 05f060a..5c41c35 100644
--- a/src/org/andengine/input/touch/detector/PinchZoomDetector.java
+++ b/src/org/andengine/input/touch/detector/PinchZoomDetector.java
@@ -112,7 +112,7 @@
 	 * Calculate the euclidian distance between the first two fingers.
 	 */
 	private static float calculatePointerDistance(final MotionEvent pMotionEvent) {
-		return MathUtils.distance(pMotionEvent.getX(0), pMotionEvent.getY(0), pMotionEvent.getX(1), pMotionEvent.getX(1));
+		return MathUtils.distance(pMotionEvent.getX(0), pMotionEvent.getY(0), pMotionEvent.getX(1), pMotionEvent.getY(1));
 	}
 
 	// ===========================================================
