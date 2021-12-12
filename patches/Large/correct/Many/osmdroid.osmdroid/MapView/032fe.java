diff --git a/osmdroid-android/src/main/java/org/osmdroid/views/MapView.java b/osmdroid-android/src/main/java/org/osmdroid/views/MapView.java
index b8e6116..236f571 100644
--- a/osmdroid-android/src/main/java/org/osmdroid/views/MapView.java
+++ b/osmdroid-android/src/main/java/org/osmdroid/views/MapView.java
@@ -308,7 +308,7 @@
 
 	void setMapCenter(final int aLatitudeE6, final int aLongitudeE6) {
 		final Point coords = TileSystem.LatLongToPixelXY(aLatitudeE6 / 1E6, aLongitudeE6 / 1E6,
-				getZoomLevel(), null);
+				getZoomLevel(false), null);
 		final int worldSize_2 = TileSystem.MapSize(this.getZoomLevel(false)) / 2;
 		if (getAnimation() == null || getAnimation().hasEnded()) {
 			logger.debug("StartScroll");
@@ -488,7 +488,7 @@
 		if (mZoomLevel >= maxZoomLevel) {
 			return false;
 		}
-		if (mIsAnimating.get() & mTargetZoomLevel.get() >= maxZoomLevel) {
+		if (mIsAnimating.get() && mTargetZoomLevel.get() >= maxZoomLevel) {
 			return false;
 		}
 		return true;
