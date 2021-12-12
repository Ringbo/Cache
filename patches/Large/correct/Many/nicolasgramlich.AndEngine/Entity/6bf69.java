diff --git a/src/org/anddev/andengine/entity/Entity.java b/src/org/anddev/andengine/entity/Entity.java
index cd64008..d22f9af 100644
--- a/src/org/anddev/andengine/entity/Entity.java
+++ b/src/org/anddev/andengine/entity/Entity.java
@@ -879,7 +879,7 @@
 
 		final IEntity parent = this.mParent;
 		if(parent != null) {
-			sceneToLocalTransformation.postConcat(parent.getSceneToLocalTransformation());
+			sceneToLocalTransformation.preConcat(parent.getSceneToLocalTransformation());
 		}
 
 		return sceneToLocalTransformation;
