diff --git a/src/org/anddev/andengine/entity/layer/tiled/tmx/TMXLayer.java b/src/org/anddev/andengine/entity/layer/tiled/tmx/TMXLayer.java
index f591723..c5ad8fe 100644
--- a/src/org/anddev/andengine/entity/layer/tiled/tmx/TMXLayer.java
+++ b/src/org/anddev/andengine/entity/layer/tiled/tmx/TMXLayer.java
@@ -70,7 +70,7 @@
 		final float width = super.mWidth;
 		super.mBaseWidth = width;
 
-		super.mHeight = pTMXTiledMap.getTileHeight() * this.mTileColumns;
+		super.mHeight = pTMXTiledMap.getTileHeight() * this.mTileRows;
 		final float height = super.mHeight;
 		super.mBaseHeight = height;
 
