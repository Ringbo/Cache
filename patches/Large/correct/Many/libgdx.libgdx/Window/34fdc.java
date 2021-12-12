diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Window.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Window.java
index c78e84c..f4ec715 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Window.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Window.java
@@ -320,7 +320,7 @@
 	}
 
 	public float getPrefWidth () {
-		return Math.max(super.getPrefWidth(), titleLabel.getPrefWidth() + getPadLeft() + getPadRight());
+		return Math.max(super.getPrefWidth(), titleTable.getPrefWidth() + getPadLeft() + getPadRight());
 	}
 
 	public Table getTitleTable () {
