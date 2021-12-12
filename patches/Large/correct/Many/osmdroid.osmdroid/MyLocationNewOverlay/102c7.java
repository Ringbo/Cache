diff --git a/osmdroid-android/src/main/java/org/osmdroid/views/overlay/mylocation/MyLocationNewOverlay.java b/osmdroid-android/src/main/java/org/osmdroid/views/overlay/mylocation/MyLocationNewOverlay.java
index cad1f86..b5b0797 100644
--- a/osmdroid-android/src/main/java/org/osmdroid/views/overlay/mylocation/MyLocationNewOverlay.java
+++ b/osmdroid-android/src/main/java/org/osmdroid/views/overlay/mylocation/MyLocationNewOverlay.java
@@ -477,7 +477,7 @@
 	@Override
 	public void onLocationChanged(final Location location, IMyLocationProvider source) {
 
-		if (location != null) {
+		if (location != null && mHandler!=null) {
 			// These location updates can come in from different threads
 			mHandler.postAtTime(new Runnable() {
 				@Override
