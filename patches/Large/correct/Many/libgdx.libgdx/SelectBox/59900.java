diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/SelectBox.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/SelectBox.java
index e0068c4..16098a1 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/SelectBox.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/SelectBox.java
@@ -314,7 +314,7 @@
 
 	/** Disables scrolling of the list shown when the select box is open. */
 	public void setScrollingDisabled (boolean y) {
-		selectBoxList.setScrollingDisabled(false, y);
+		selectBoxList.setScrollingDisabled(true, y);
 		invalidateHierarchy();
 	}
 
