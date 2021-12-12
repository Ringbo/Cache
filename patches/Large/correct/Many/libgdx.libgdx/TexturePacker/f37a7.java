diff --git a/extensions/gdx-tools/src/com/badlogic/gdx/tools/texturepacker/TexturePacker.java b/extensions/gdx-tools/src/com/badlogic/gdx/tools/texturepacker/TexturePacker.java
index df1c1e7..a83f1c9 100644
--- a/extensions/gdx-tools/src/com/badlogic/gdx/tools/texturepacker/TexturePacker.java
+++ b/extensions/gdx-tools/src/com/badlogic/gdx/tools/texturepacker/TexturePacker.java
@@ -89,7 +89,7 @@
 
 	public void pack (File outputDir, String packFileName) {
 		if (packFileName.endsWith(settings.atlasExtension))
-			packFileName = packFileName.substring(packFileName.length() - settings.atlasExtension.length());
+			packFileName = packFileName.substring(0, packFileName.length() - settings.atlasExtension.length());
 		outputDir.mkdirs();
 
 		for (int i = 0, n = settings.scale.length; i < n; i++) {
