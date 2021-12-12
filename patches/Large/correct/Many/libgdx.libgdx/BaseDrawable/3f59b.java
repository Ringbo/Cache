diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/utils/BaseDrawable.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/utils/BaseDrawable.java
index 6d581f3..ee3809c 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/utils/BaseDrawable.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/utils/BaseDrawable.java
@@ -99,7 +99,7 @@
 
 	public void setMinSize (float minWidth, float minHeight) {
 		setMinWidth(minWidth);
-		setMinHeight(minWidth);
+		setMinHeight(minHeight);
 	}
 
 	public String getName () {
