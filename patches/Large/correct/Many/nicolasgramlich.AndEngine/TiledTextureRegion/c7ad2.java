diff --git a/src/org/andengine/opengl/texture/region/TiledTextureRegion.java b/src/org/andengine/opengl/texture/region/TiledTextureRegion.java
index bb0d05e..38a880c 100644
--- a/src/org/andengine/opengl/texture/region/TiledTextureRegion.java
+++ b/src/org/andengine/opengl/texture/region/TiledTextureRegion.java
@@ -146,7 +146,7 @@
 
 	@Override
 	public void setTextureX(final int pTileIndex, final float pTextureX) {
-		this.mTextureRegions[pTileIndex].setTextureY(pTextureX);
+		this.mTextureRegions[pTileIndex].setTextureX(pTextureX);
 	}
 
 	@Override
