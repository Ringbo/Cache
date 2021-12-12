diff --git a/gdx/src/com/badlogic/gdx/assets/loaders/SkinLoader.java b/gdx/src/com/badlogic/gdx/assets/loaders/SkinLoader.java
index 66d6a2a..297e382 100644
--- a/gdx/src/com/badlogic/gdx/assets/loaders/SkinLoader.java
+++ b/gdx/src/com/badlogic/gdx/assets/loaders/SkinLoader.java
@@ -47,7 +47,7 @@
 		textureParam.minFilter = TextureFilter.Linear;
 		textureParam.magFilter = TextureFilter.Linear;
 		if (parameter == null)
-			deps.add(new AssetDescriptor(Gdx.files.internal(fileName).nameWithoutExtension() + ".png", Texture.class, textureParam));
+			deps.add(new AssetDescriptor(Gdx.files.internal(fileName).pathWithoutExtension() + ".png", Texture.class, textureParam));
 		else
 			deps.add(new AssetDescriptor(parameter.texturePath, Texture.class, textureParam));
 		return deps;
@@ -61,7 +61,7 @@
 	public Skin loadSync (AssetManager manager, String fileName, SkinParameter parameter) {
 		String texturePath;
 		if (parameter == null)
-			texturePath = Gdx.files.internal(fileName).nameWithoutExtension() + ".png";
+			texturePath = Gdx.files.internal(fileName).pathWithoutExtension() + ".png";
 		else
 			texturePath = parameter.texturePath;
 		Texture texture = manager.get(texturePath, Texture.class);
