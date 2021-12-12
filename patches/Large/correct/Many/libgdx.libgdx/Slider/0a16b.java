diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Slider.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Slider.java
index adace9d..5645410 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Slider.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Slider.java
@@ -77,7 +77,8 @@
 			public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
 				if (pointer != draggingPointer) return;
 				draggingPointer = -1;
-				if (!calculatePositionAndValue(x, y)) {
+				// The position is invalid when focus is cancelled
+				if (event.isTouchFocusCancel() || !calculatePositionAndValue(x, y)) {
 					// Fire an event on touchUp even if the value didn't change, so listeners can see when a drag ends via isDragging.
 					ChangeEvent changeEvent = Pools.obtain(ChangeEvent.class);
 					fire(changeEvent);
