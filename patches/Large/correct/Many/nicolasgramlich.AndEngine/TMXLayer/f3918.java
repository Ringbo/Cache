diff --git a/src/org/anddev/andengine/entity/layer/tiled/tmx/TMXLayer.java b/src/org/anddev/andengine/entity/layer/tiled/tmx/TMXLayer.java
index 4b2fff8..f591723 100644
--- a/src/org/anddev/andengine/entity/layer/tiled/tmx/TMXLayer.java
+++ b/src/org/anddev/andengine/entity/layer/tiled/tmx/TMXLayer.java
@@ -70,7 +70,7 @@
 		final float width = super.mWidth;
 		super.mBaseWidth = width;
 
-		super.mHeight = pTMXTiledMap.getTileWidth() * this.mTileColumns;
+		super.mHeight = pTMXTiledMap.getTileHeight() * this.mTileColumns;
 		final float height = super.mHeight;
 		super.mBaseHeight = height;
 
