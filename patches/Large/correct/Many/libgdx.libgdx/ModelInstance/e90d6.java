diff --git a/gdx/src/com/badlogic/gdx/graphics/g3d/ModelInstance.java b/gdx/src/com/badlogic/gdx/graphics/g3d/ModelInstance.java
index ef16a9c..d166dc0 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g3d/ModelInstance.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g3d/ModelInstance.java
@@ -406,7 +406,7 @@
 	/** @param id The ID of the animation to fetch (case sensitive).
 	 * @return The {@link Animation} with the specified id, or null if not available. */
 	public Animation getAnimation (final String id) {
-		return getAnimation(id, true);
+		return getAnimation(id, false);
 	}
 
 	/** @param id The ID of the animation to fetch.
