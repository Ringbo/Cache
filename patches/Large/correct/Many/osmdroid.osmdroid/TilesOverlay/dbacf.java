diff --git a/osmdroid-android/src/org/osmdroid/views/overlay/TilesOverlay.java b/osmdroid-android/src/org/osmdroid/views/overlay/TilesOverlay.java
index 3dde9c4..5dd852b 100644
--- a/osmdroid-android/src/org/osmdroid/views/overlay/TilesOverlay.java
+++ b/osmdroid-android/src/org/osmdroid/views/overlay/TilesOverlay.java
@@ -283,6 +283,12 @@
 		return mLoadingBackgroundColor;
 	}
 
+	/**
+	 * Set the color to use to draw the background while we're waiting for the tile
+	 * to load.
+	 * @param pLoadingBackgroundColor the color to use.
+	 * If the value is {@link Color.TRANSPARENT} then there will be no loading tile.
+	 */
 	public void setLoadingBackgroundColor(final int pLoadingBackgroundColor) {
 		if (mLoadingBackgroundColor != pLoadingBackgroundColor) {
 			mLoadingBackgroundColor = pLoadingBackgroundColor;
@@ -302,12 +308,12 @@
 	}
 
 	private Drawable getLoadingTile() {
-		if (mLoadingTile == null) {
+		if (mLoadingTile == null && mLoadingBackgroundColor != Color.TRANSPARENT) {
 			try {
-				final int tileSize = mTileProvider.getTileSource() != null ? mTileProvider
-						.getTileSource().getTileSizePixels() : 256;
-				final Bitmap bitmap = Bitmap
-						.createBitmap(tileSize, tileSize, Bitmap.Config.RGB_565);
+				final int tileSize = mTileProvider.getTileSource() != null ?
+						mTileProvider.getTileSource().getTileSizePixels() : 256;
+				final Bitmap bitmap = Bitmap.createBitmap(
+						tileSize, tileSize, Bitmap.Config.ARGB_8888);
 				final Canvas canvas = new Canvas(bitmap);
 				final Paint paint = new Paint();
 				canvas.drawColor(mLoadingBackgroundColor);
