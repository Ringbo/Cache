diff --git a/osmdroid-android/src/org/andnav/osm/views/OpenStreetMapView.java b/osmdroid-android/src/org/andnav/osm/views/OpenStreetMapView.java
index 407d257..73d7878 100644
--- a/osmdroid-android/src/org/andnav/osm/views/OpenStreetMapView.java
+++ b/osmdroid-android/src/org/andnav/osm/views/OpenStreetMapView.java
@@ -311,7 +311,7 @@
 	}
 
 	public double getLatitudeSpan() {
-		return this.getDrawnBoundingBoxE6().getLongitudeSpanE6() / 1E6;
+		return this.getDrawnBoundingBoxE6().getLatitudeSpanE6() / 1E6;
 	}
 
 	public int getLatitudeSpanE6() {
