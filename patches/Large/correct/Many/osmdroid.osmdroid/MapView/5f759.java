diff --git a/osmdroid-android/src/org/osmdroid/views/MapView.java b/osmdroid-android/src/org/osmdroid/views/MapView.java
index c25dd65..467a335 100644
--- a/osmdroid-android/src/org/osmdroid/views/MapView.java
+++ b/osmdroid-android/src/org/osmdroid/views/MapView.java
@@ -1424,7 +1424,7 @@
 		/**
 		 * The location of the child within the map view.
 		 */
-		public GeoPoint geoPoint;
+		public IGeoPoint geoPoint;
 
 		/**
 		 * The alignment the alignment of the view compared to the location.
@@ -1456,7 +1456,7 @@
 		 *            the additional Y offset from the alignment location to draw the child within
 		 *            the map view
 		 */
-		public LayoutParams(final int width, final int height, final GeoPoint geoPoint,
+		public LayoutParams(final int width, final int height, final IGeoPoint geoPoint,
 				final int alignment, final int offsetX, final int offsetY) {
 			super(width, height);
 			if (geoPoint != null) {
