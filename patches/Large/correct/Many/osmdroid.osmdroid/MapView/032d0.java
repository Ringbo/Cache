diff --git a/osmdroid-android/src/main/java/org/osmdroid/views/MapView.java b/osmdroid-android/src/main/java/org/osmdroid/views/MapView.java
index df4fcc4..38b8700 100644
--- a/osmdroid-android/src/main/java/org/osmdroid/views/MapView.java
+++ b/osmdroid-android/src/main/java/org/osmdroid/views/MapView.java
@@ -422,7 +422,7 @@
 
 	@Deprecated
 	public void zoomToBoundingBox(final BoundingBoxE6 boundingBox) {
-		BoundingBox box = new BoundingBox(boundingBox.getLatNorthE6()/1e6, boundingBox.getLonEastE6()/1e6, boundingBox.getLatSouthE6()/186, boundingBox.getLonWestE6()/1e6);
+		BoundingBox box = new BoundingBox(boundingBox.getLatNorthE6()/1e6, boundingBox.getLonEastE6()/1e6, boundingBox.getLatSouthE6()/1e6, boundingBox.getLonWestE6()/1e6);
 		zoomToBoundingBox(box, false);
 	}
 
