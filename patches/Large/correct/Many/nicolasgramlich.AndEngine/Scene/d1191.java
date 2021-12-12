diff --git a/src/org/anddev/andengine/entity/Scene.java b/src/org/anddev/andengine/entity/Scene.java
index 41434c3..e56d094 100644
--- a/src/org/anddev/andengine/entity/Scene.java
+++ b/src/org/anddev/andengine/entity/Scene.java
@@ -283,7 +283,7 @@
 	}
 
 	public void updatePreFrameHandlers(final float pSecondsElapsed) {
-		if(this.mChildScene == null && !this.mChildSceneModalUpdate) {
+		if(this.mChildScene == null || !this.mChildSceneModalUpdate) {
 			this.mPreFrameHandlers.onUpdate(pSecondsElapsed);
 		}
 
@@ -293,7 +293,7 @@
 	}
 
 	public void updatePostFrameHandlers(final float pSecondsElapsed) {
-		if(this.mChildScene == null  && !this.mChildSceneModalUpdate) {
+		if(this.mChildScene == null || !this.mChildSceneModalUpdate) {
 			this.mPostFrameHandlers.onUpdate(pSecondsElapsed);
 		}
 
