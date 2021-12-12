diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/ButtonGroup.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/ButtonGroup.java
index 3de1422..244c7c3 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/ButtonGroup.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/ButtonGroup.java
@@ -71,7 +71,7 @@
 		if (text == null) throw new IllegalArgumentException("text cannot be null.");
 		for (int i = 0, n = buttons.size; i < n; i++) {
 			Button button = buttons.get(i);
-			if (button instanceof TextButton && text.equals(((TextButton)button).getText())) {
+			if (button instanceof TextButton && text.contentEquals(((TextButton)button).getText())) {
 				button.setChecked(true);
 				return;
 			}
