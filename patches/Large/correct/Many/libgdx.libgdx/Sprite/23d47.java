diff --git a/gdx/src/com/badlogic/gdx/graphics/g2d/Sprite.java b/gdx/src/com/badlogic/gdx/graphics/g2d/Sprite.java
index fec8f42..309224d 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g2d/Sprite.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g2d/Sprite.java
@@ -528,7 +528,7 @@
 	}
 
 	public void setV (float v) {
-		super.setV(u);
+		super.setV(v);
 		vertices[V2] = v;
 		vertices[V3] = v;
 	}
