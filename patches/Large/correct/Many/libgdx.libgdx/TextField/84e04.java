diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/TextField.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/TextField.java
index d37111b..4a47c94 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/TextField.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/TextField.java
@@ -364,7 +364,11 @@
 		return false;
 	}
 
-	private void copy () {
+	/**
+	 * Copies the contents of this TextField to the {@link Clipboard} implementation
+	 * set on this TextField.
+	 */
+	public void copy () {
 		if (hasSelection) {
 			int minIndex = Math.min(cursor, selectionStart);
 			int maxIndex = Math.max(cursor, selectionStart);
@@ -372,6 +376,10 @@
 		}
 	}
 
+	/**
+	 * Pastes the content of the {@link Clipboard} implementation set on this Textfield
+	 * to this TextField.
+	 */
 	private void paste () {
 		String content = clipboard.getContents();
 		if (content != null) {
