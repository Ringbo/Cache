diff --git a/osmdroid-android/src/main/java/org/osmdroid/views/overlay/mylocation/MyLocationNewOverlay.java b/osmdroid-android/src/main/java/org/osmdroid/views/overlay/mylocation/MyLocationNewOverlay.java
index 83bf828..58f9447 100644
--- a/osmdroid-android/src/main/java/org/osmdroid/views/overlay/mylocation/MyLocationNewOverlay.java
+++ b/osmdroid-android/src/main/java/org/osmdroid/views/overlay/mylocation/MyLocationNewOverlay.java
@@ -264,7 +264,7 @@
         if (shadow)
             return;
 
-		if (mLocation != null) {
+		if (mLocation != null && isMyLocationEnabled()) {
             drawMyLocation(canvas, mapView, mLocation);
         }
     }
