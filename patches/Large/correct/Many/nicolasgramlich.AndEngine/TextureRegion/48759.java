diff --git a/src/org/andengine/opengl/texture/region/TextureRegion.java b/src/org/andengine/opengl/texture/region/TextureRegion.java
index 8e832a3..64bf4d8 100644
--- a/src/org/andengine/opengl/texture/region/TextureRegion.java
+++ b/src/org/andengine/opengl/texture/region/TextureRegion.java
@@ -75,9 +75,9 @@
 	@Override
 	public TextureRegion deepCopy() {
 		if(this.mRotated) {
-			return new TextureRegion(this.mTexture, this.mTextureX, this.mTextureY, this.mTextureHeight, this.mTextureWidth, this.mRotated);
+			return new TextureRegion(this.mTexture, this.mTextureX, this.mTextureY, this.mTextureHeight, this.mTextureWidth, this.mScale, this.mRotated);
 		} else {
-			return new TextureRegion(this.mTexture, this.mTextureX, this.mTextureY, this.mTextureWidth, this.mTextureHeight, this.mRotated);
+			return new TextureRegion(this.mTexture, this.mTextureX, this.mTextureY, this.mTextureWidth, this.mTextureHeight, this.mScale, this.mRotated);
 		}
 	}
 
