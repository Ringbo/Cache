diff --git a/hellocharts-library/src/lecho/lib/hellocharts/gesture/PieChartTouchHandler.java b/hellocharts-library/src/lecho/lib/hellocharts/gesture/PieChartTouchHandler.java
index 6b06cdc..9eafa95 100644
--- a/hellocharts-library/src/lecho/lib/hellocharts/gesture/PieChartTouchHandler.java
+++ b/hellocharts-library/src/lecho/lib/hellocharts/gesture/PieChartTouchHandler.java
@@ -58,7 +58,7 @@
 		if (!isInteractive) {
 			return false;
 		}
-		if (isRotationEnabled) {
+		if (!isRotationEnabled) {
 			return false;
 		}
 		if (scroller.computeScrollOffset()) {
@@ -116,7 +116,7 @@
 
 		@Override
 		public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
-			if (isRotationEnabled) {
+			if (!isRotationEnabled) {
 				return false;
 			}
 			// Set up the Scroller for a fling
