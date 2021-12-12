diff --git a/gdx/src/com/badlogic/gdx/graphics/g2d/Sprite.java b/gdx/src/com/badlogic/gdx/graphics/g2d/Sprite.java
index e67bda4..e773701 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g2d/Sprite.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g2d/Sprite.java
@@ -190,7 +190,7 @@
 
 	/** Sets the position where the sprite will be drawn, relative to its current origin.  */
 	public void setOriginBasedPosition (float x, float y) {
-		setPosition(x - this.originX, y - this.originX);
+		setPosition(x - this.originX, y - this.originY);
 	}
 
 	/** Sets the x position where the sprite will be drawn. If origin, rotation, or scale are changed, it is slightly more efficient
