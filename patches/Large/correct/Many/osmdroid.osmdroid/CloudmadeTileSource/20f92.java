diff --git a/osmdroid-android/src/org/osmdroid/tileprovider/tilesource/CloudmadeTileSource.java b/osmdroid-android/src/org/osmdroid/tileprovider/tilesource/CloudmadeTileSource.java
index 4c1f510..546b422 100644
--- a/osmdroid-android/src/org/osmdroid/tileprovider/tilesource/CloudmadeTileSource.java
+++ b/osmdroid-android/src/org/osmdroid/tileprovider/tilesource/CloudmadeTileSource.java
@@ -6,13 +6,13 @@
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 
-class CloudmadeTileSource extends OnlineTileSourceBase implements IStyledTileSource<Integer> {
+public class CloudmadeTileSource extends OnlineTileSourceBase implements IStyledTileSource<Integer> {
 
 	private static final Logger logger = LoggerFactory.getLogger(CloudmadeTileSource.class);
 
 	private Integer mStyle = 1;
 
-	CloudmadeTileSource(final String pName, final ResourceProxy.string pResourceId,
+	public CloudmadeTileSource(final String pName, final ResourceProxy.string pResourceId,
 			final int pZoomMinLevel, final int pZoomMaxLevel, final int pTileSizePixels,
 			final String pImageFilenameEnding, final String... pBaseUrl) {
 		super(pName, pResourceId, pZoomMinLevel, pZoomMaxLevel, pTileSizePixels,
