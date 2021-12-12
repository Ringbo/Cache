diff --git a/osmdroid-android/src/org/andnav/osm/views/OpenStreetMapView.java b/osmdroid-android/src/org/andnav/osm/views/OpenStreetMapView.java
index 73d7878..82ec4c6 100644
--- a/osmdroid-android/src/org/andnav/osm/views/OpenStreetMapView.java
+++ b/osmdroid-android/src/org/andnav/osm/views/OpenStreetMapView.java
@@ -323,7 +323,7 @@
 	}
 
 	public int getLongitudeSpanE6() {
-		return this.getDrawnBoundingBoxE6().getLatitudeSpanE6();
+		return this.getDrawnBoundingBoxE6().getLongitudeSpanE6();
 	}
 
 	public BoundingBoxE6 getDrawnBoundingBoxE6() {
