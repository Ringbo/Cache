diff --git a/gdx/src/com/badlogic/gdx/graphics/g2d/BitmapFont.java b/gdx/src/com/badlogic/gdx/graphics/g2d/BitmapFont.java
index 13cfa60..6c53a07 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g2d/BitmapFont.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g2d/BitmapFont.java
@@ -318,7 +318,7 @@
 		this.integer = integer;
 		this.data = data;
 		load(data);
-		ownsTexture = region != null;
+		ownsTexture = region == null;
 	}
 
 	private void load (BitmapFontData data) {
