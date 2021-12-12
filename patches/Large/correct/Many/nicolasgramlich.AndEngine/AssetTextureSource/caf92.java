diff --git a/src/org/anddev/andengine/opengl/texture/source/AssetTextureSource.java b/src/org/anddev/andengine/opengl/texture/source/AssetTextureSource.java
index a555654..30b7bba 100644
--- a/src/org/anddev/andengine/opengl/texture/source/AssetTextureSource.java
+++ b/src/org/anddev/andengine/opengl/texture/source/AssetTextureSource.java
@@ -44,7 +44,7 @@
 		try {
 			BitmapFactory.decodeStream(pContext.getAssets().open(pAssetPath), null, decodeOptions);
 		} catch (final IOException e) {
-			Debug.w("Texture asset not found, " + pAssetPath, e);
+			Debug.e("Texture asset not found, " + pAssetPath, e);
 		}
 		this.mWidth = decodeOptions.outWidth;
 		this.mHeight = decodeOptions.outHeight;
