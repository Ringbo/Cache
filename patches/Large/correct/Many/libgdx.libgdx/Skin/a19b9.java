diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Skin.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Skin.java
index dec0b29..0715992 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Skin.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Skin.java
@@ -188,12 +188,12 @@
 		if (tiled != null) return tiled;
 
 		Drawable drawable = optional(name, Drawable.class);
-		if (tiled != null) {
+		if (drawable != null) {
 			if (!(drawable instanceof TiledDrawable)) {
 				throw new GdxRuntimeException("Drawable found but is not a TiledDrawable: " + name + ", "
 					+ drawable.getClass().getName());
 			}
-			return tiled;
+			return (TiledDrawable)drawable;
 		}
 
 		tiled = new TiledDrawable(getRegion(name));
