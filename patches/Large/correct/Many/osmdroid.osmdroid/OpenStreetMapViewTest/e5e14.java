diff --git a/osmdroid-android-it/src/main/java/org/osmdroid/views/OpenStreetMapViewTest.java b/osmdroid-android-it/src/main/java/org/osmdroid/views/OpenStreetMapViewTest.java
index 26ef869..1be5b5d 100644
--- a/osmdroid-android-it/src/main/java/org/osmdroid/views/OpenStreetMapViewTest.java
+++ b/osmdroid-android-it/src/main/java/org/osmdroid/views/OpenStreetMapViewTest.java
@@ -97,7 +97,7 @@
 			mOpenStreetMapView.setZoomLevel(expectedZoom);
 		}
 		if (expectedCenter != null) {
-			mOpenStreetMapView.setCenter(expectedCenter);
+			mOpenStreetMapView.setExpectedCenter(expectedCenter);
 		}
 		final Projection projection = mOpenStreetMapView.getProjection();
 		if (expectedZoom != null) {
