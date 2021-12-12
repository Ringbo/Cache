diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/ScrollPane.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/ScrollPane.java
index 8e330f0..d614b6b 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/ScrollPane.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/ScrollPane.java
@@ -803,7 +803,7 @@
 
 	/** Returns the width of the scrolled viewport. */
 	public float getScrollWidth () {
-		return areaHeight;
+		return areaWidth;
 	}
 
 	/** Returns the height of the scrolled viewport. */
