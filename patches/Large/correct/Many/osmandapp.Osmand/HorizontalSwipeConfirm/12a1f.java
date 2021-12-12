diff --git a/OsmAnd/src/net/osmand/plus/views/controls/HorizontalSwipeConfirm.java b/OsmAnd/src/net/osmand/plus/views/controls/HorizontalSwipeConfirm.java
index 2f72050..c3337ee 100644
--- a/OsmAnd/src/net/osmand/plus/views/controls/HorizontalSwipeConfirm.java
+++ b/OsmAnd/src/net/osmand/plus/views/controls/HorizontalSwipeConfirm.java
@@ -41,7 +41,7 @@
 	@Override
 	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
 
-		if (Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH) {
+		if (e1 == null || e2 == null || Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH) {
 			return false;
 		}
 		// right to left swipe
