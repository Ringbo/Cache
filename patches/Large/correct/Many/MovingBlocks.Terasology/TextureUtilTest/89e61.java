diff --git a/engine-tests/src/test/java/org/terasology/rendering/assets/texture/TextureUtilTest.java b/engine-tests/src/test/java/org/terasology/rendering/assets/texture/TextureUtilTest.java
index c9a9c63..b9b5d91 100644
--- a/engine-tests/src/test/java/org/terasology/rendering/assets/texture/TextureUtilTest.java
+++ b/engine-tests/src/test/java/org/terasology/rendering/assets/texture/TextureUtilTest.java
@@ -65,7 +65,7 @@
     public void testColorTransformedToAssetUriTransformedToColor() throws Exception {
         Color expectedColor = Color.RED;
         AssetUri assetUri = TextureUtil.getTextureUriForColor(expectedColor);
-        Color actualColor = TextureUtil.getColorForColorName(assetUri.getAssetName().toString().substring("color.".length()));
+        Color actualColor = TextureUtil.getColorForColorName(assetUri.getAssetName().toLowerCase().substring("color.".length()));
         assertEquals(expectedColor, actualColor);
 
         int red = 0x12;
@@ -74,7 +74,7 @@
         int alpha = 0xe;
         expectedColor = new Color(red, green, blue, alpha);
         assetUri = TextureUtil.getTextureUriForColor(expectedColor);
-        actualColor = TextureUtil.getColorForColorName(assetUri.getAssetName().toString().substring("color.".length()));
+        actualColor = TextureUtil.getColorForColorName(assetUri.getAssetName().toLowerCase().substring("color.".length()));
         assertEquals(expectedColor, actualColor);
     }
 }
