diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/Stage.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/Stage.java
index ccbbad0..ded7eb5 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/Stage.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/Stage.java
@@ -661,7 +661,7 @@
 				event.setRelatedActor(oldScrollFocus);
 				actor.fire(event);
 				success = !event.isCancelled();
-				if (success) setScrollFocus(oldScrollFocus);
+				if (!success) setScrollFocus(oldScrollFocus);
 			}
 		}
 		Pools.free(event);
