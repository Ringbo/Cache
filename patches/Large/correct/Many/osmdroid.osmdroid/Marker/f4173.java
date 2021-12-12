diff --git a/osmdroid-android/src/main/java/org/osmdroid/views/overlay/Marker.java b/osmdroid-android/src/main/java/org/osmdroid/views/overlay/Marker.java
index a40a191..4f1bad3 100644
--- a/osmdroid-android/src/main/java/org/osmdroid/views/overlay/Marker.java
+++ b/osmdroid-android/src/main/java/org/osmdroid/views/overlay/Marker.java
@@ -339,7 +339,7 @@
 
 		mIcon.setAlpha((int)(mAlpha*255));
 		
-		float rotationOnScreen = (mFlat ? -mBearing : mapView.getMapOrientation()-mBearing);
+		float rotationOnScreen = (mFlat ? -mBearing : -mapView.getMapOrientation()-mBearing);
 		drawAt(canvas, mPositionPixels.x, mPositionPixels.y, rotationOnScreen);
 		if (isInfoWindowShown()) {
 			//showInfoWindow();
