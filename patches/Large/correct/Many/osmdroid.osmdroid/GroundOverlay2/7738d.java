diff --git a/osmdroid-android/src/main/java/org/osmdroid/views/overlay/GroundOverlay2.java b/osmdroid-android/src/main/java/org/osmdroid/views/overlay/GroundOverlay2.java
index 04d6212..66473b9 100644
--- a/osmdroid-android/src/main/java/org/osmdroid/views/overlay/GroundOverlay2.java
+++ b/osmdroid-android/src/main/java/org/osmdroid/views/overlay/GroundOverlay2.java
@@ -71,7 +71,7 @@
     @Override
     public void draw(Canvas canvas, MapView mapView, boolean shadow)
     {
-		if(null == mImage) {
+		if(null == mImage || shadow) {
 			return;
 		}
 
