diff --git a/osmdroid-android/src/org/osmdroid/tileprovider/tilesource/QuadTreeTileSource.java b/osmdroid-android/src/org/osmdroid/tileprovider/tilesource/QuadTreeTileSource.java
index 714f518..04c2f45 100644
--- a/osmdroid-android/src/org/osmdroid/tileprovider/tilesource/QuadTreeTileSource.java
+++ b/osmdroid-android/src/org/osmdroid/tileprovider/tilesource/QuadTreeTileSource.java
@@ -3,11 +3,11 @@
 import org.osmdroid.ResourceProxy.string;
 import org.osmdroid.tileprovider.MapTile;
 
-class QuadTreeTileSource extends OnlineTileSourceBase {
+public class QuadTreeTileSource extends OnlineTileSourceBase {
 
-	QuadTreeTileSource(final String aName, final string aResourceId, final int aZoomMinLevel,
-			final int aZoomMaxLevel, final int aTileSizePixels, final String aImageFilenameEnding,
-			final String... aBaseUrl) {
+	public QuadTreeTileSource(final String aName, final string aResourceId,
+			final int aZoomMinLevel, final int aZoomMaxLevel, final int aTileSizePixels,
+			final String aImageFilenameEnding, final String... aBaseUrl) {
 		super(aName, aResourceId, aZoomMinLevel, aZoomMaxLevel, aTileSizePixels,
 				aImageFilenameEnding, aBaseUrl);
 	}
@@ -24,7 +24,7 @@
 	 *            The tile coordinates to convert
 	 * @return The QuadTree as String.
 	 */
-	private String quadTree(final MapTile aTile) {
+	protected String quadTree(final MapTile aTile) {
 		final StringBuilder quadKey = new StringBuilder();
 		for (int i = aTile.getZoomLevel(); i > 0; i--) {
 			int digit = 0;
