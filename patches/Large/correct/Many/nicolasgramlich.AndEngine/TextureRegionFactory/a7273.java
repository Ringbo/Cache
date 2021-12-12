diff --git a/src/org/anddev/andengine/opengl/texture/region/TextureRegionFactory.java b/src/org/anddev/andengine/opengl/texture/region/TextureRegionFactory.java
index ee26475..efeb77f 100644
--- a/src/org/anddev/andengine/opengl/texture/region/TextureRegionFactory.java
+++ b/src/org/anddev/andengine/opengl/texture/region/TextureRegionFactory.java
@@ -42,7 +42,7 @@
 		if(pAssetBasePath.endsWith("/") || pAssetBasePath.length() == 0) {
 			TextureRegionFactory.sAssetBasePath = pAssetBasePath;
 		} else {
-			throw new IllegalStateException("pAssetBasePath must end with '/' or be lenght zero.");
+			throw new IllegalArgumentException("pAssetBasePath must end with '/' or be lenght zero.");
 		}
 	}
 
