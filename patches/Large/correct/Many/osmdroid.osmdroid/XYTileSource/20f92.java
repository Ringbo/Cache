diff --git a/osmdroid-android/src/org/osmdroid/tileprovider/tilesource/XYTileSource.java b/osmdroid-android/src/org/osmdroid/tileprovider/tilesource/XYTileSource.java
index 334bcb7..d68b059 100644
--- a/osmdroid-android/src/org/osmdroid/tileprovider/tilesource/XYTileSource.java
+++ b/osmdroid-android/src/org/osmdroid/tileprovider/tilesource/XYTileSource.java
@@ -3,9 +3,9 @@
 import org.osmdroid.ResourceProxy.string;
 import org.osmdroid.tileprovider.MapTile;
 
-class XYTileSource extends OnlineTileSourceBase {
+public class XYTileSource extends OnlineTileSourceBase {
 
-	XYTileSource(final String aName, final string aResourceId, final int aZoomMinLevel,
+	public XYTileSource(final String aName, final string aResourceId, final int aZoomMinLevel,
 			final int aZoomMaxLevel, final int aTileSizePixels, final String aImageFilenameEnding,
 			final String... aBaseUrl) {
 		super(aName, aResourceId, aZoomMinLevel, aZoomMaxLevel, aTileSizePixels,
