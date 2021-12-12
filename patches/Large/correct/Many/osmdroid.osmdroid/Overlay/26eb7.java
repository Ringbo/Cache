diff --git a/osmdroid-android/src/main/java/org/osmdroid/views/overlay/Overlay.java b/osmdroid-android/src/main/java/org/osmdroid/views/overlay/Overlay.java
index 30fa32d..38d65b0 100644
--- a/osmdroid-android/src/main/java/org/osmdroid/views/overlay/Overlay.java
+++ b/osmdroid-android/src/main/java/org/osmdroid/views/overlay/Overlay.java
@@ -149,7 +149,7 @@
 	protected final void onDraw(Canvas c, MapView osmv, boolean shadow) {
 		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB && !this.isHardwareAccelerated()
 				&& c.isHardwareAccelerated()) {
-			if (mBackingBitmap == null || c.getWidth() != c.getWidth()
+			if (mBackingBitmap == null || mBackingBitmap.getWidth() != c.getWidth()
 					|| mBackingBitmap.getHeight() != c.getHeight()) {
 				mBackingBitmap = Bitmap.createBitmap(c.getWidth(), c.getHeight(), Config.ARGB_8888);
 				mBackingCanvas = new Canvas(mBackingBitmap);
