diff --git a/gdx/src/com/badlogic/gdx/graphics/Texture.java b/gdx/src/com/badlogic/gdx/graphics/Texture.java
index 311683f..35c11a5 100644
--- a/gdx/src/com/badlogic/gdx/graphics/Texture.java
+++ b/gdx/src/com/badlogic/gdx/graphics/Texture.java
@@ -127,7 +127,7 @@
 	}
 
 	public Texture (FileHandle file, Format format, boolean useMipMaps) {
-		if (file.name().contains(".etc1")) {
+		if (file.name().endsWith(".etc1")) {
 			create(new ETC1TextureData(file, useMipMaps));
 		} else {
 			create(new FileTextureData(file, null, format, useMipMaps));
