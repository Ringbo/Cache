diff --git a/src/org/andengine/entity/Entity.java b/src/org/andengine/entity/Entity.java
index 8716fa9..5e28b48 100644
--- a/src/org/andengine/entity/Entity.java
+++ b/src/org/andengine/entity/Entity.java
@@ -1058,7 +1058,7 @@
 	 */
 	@Override
 	public float[] convertLocalToSceneCoordinates(final float[] pCoordinates) {
-		return this.convertSceneToLocalCoordinates(pCoordinates, Entity.VERTICES_LOCAL_TO_SCENE_TMP);
+		return this.convertLocalToSceneCoordinates(pCoordinates, Entity.VERTICES_LOCAL_TO_SCENE_TMP);
 	}
 
 	/* (non-Javadoc)
