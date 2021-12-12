diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/actions/AddListenerAction.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/actions/AddListenerAction.java
index 8509aed..2292c3c 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/actions/AddListenerAction.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/actions/AddListenerAction.java
@@ -30,9 +30,9 @@
 	public boolean act (float delta) {
 		Actor actor = (targetActor != null ? targetActor : this.actor);
 		if (capture)
-			targetActor.addCaptureListener(listener);
+			actor.addCaptureListener(listener);
 		else
-			targetActor.addListener(listener);
+			actor.addListener(listener);
 		return true;
 	}
 
