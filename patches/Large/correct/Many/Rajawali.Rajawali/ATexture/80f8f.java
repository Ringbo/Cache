diff --git a/src/rajawali/materials/textures/ATexture.java b/src/rajawali/materials/textures/ATexture.java
index a0fbbc0..e37b5d0 100644
--- a/src/rajawali/materials/textures/ATexture.java
+++ b/src/rajawali/materials/textures/ATexture.java
@@ -130,7 +130,7 @@
 		this();
 		mTextureType = textureType;
 		mTextureName = textureName;
-		mMipmap = false;
+		mMipmap = true;
 		mShouldRecycle = false;
 		mWrapType = WrapType.REPEAT;
 		mFilterType = FilterType.LINEAR;
