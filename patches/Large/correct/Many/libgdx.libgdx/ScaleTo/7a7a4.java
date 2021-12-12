diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/actions/ScaleTo.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/actions/ScaleTo.java
index bd68815..37cb2ca 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/actions/ScaleTo.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/actions/ScaleTo.java
@@ -33,7 +33,7 @@
 	protected float deltaScaleX;
 	protected float deltaScaleY;
 
-	public static AnimationAction $ (float scaleX, float scaleY, float duration) {
+	public static ScaleTo $ (float scaleX, float scaleY, float duration) {
 		ScaleTo action = pool.obtain();
 		action.scaleX = scaleX;
 		action.scaleY = scaleY;
