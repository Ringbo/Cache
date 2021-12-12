diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Slider.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Slider.java
index 99115bf..043ce6e 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Slider.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Slider.java
@@ -80,7 +80,7 @@
 
 		addListener(new InputListener() {
 			public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
-				if (disabled) return true;
+				if (disabled) return false;
 				if (draggingPointer != -1) return false;
 				draggingPointer = pointer;
 				calculatePositionAndValue(x, y);
