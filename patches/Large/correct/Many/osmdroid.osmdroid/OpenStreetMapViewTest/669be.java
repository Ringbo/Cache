diff --git a/OpenStreetMapViewer/tests/org/osmdroid/views/OpenStreetMapViewTest.java b/OpenStreetMapViewer/tests/org/osmdroid/views/OpenStreetMapViewTest.java
index ed2007d..ca41418 100644
--- a/OpenStreetMapViewer/tests/org/osmdroid/views/OpenStreetMapViewTest.java
+++ b/OpenStreetMapViewer/tests/org/osmdroid/views/OpenStreetMapViewTest.java
@@ -43,7 +43,7 @@
 				mTileProvider);
 		final Bitmap bitmap = Bitmap.createBitmap(WIDTH, HEIGHT, Config.RGB_565);
 		final Canvas canvas = new Canvas(bitmap);
-		mOpenStreetMapView.onDraw(canvas);
+		mOpenStreetMapView.dispatchDraw(canvas);
 
 		super.setUp();
 	}
