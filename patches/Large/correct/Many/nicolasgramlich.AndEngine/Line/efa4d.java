diff --git a/src/org/anddev/andengine/entity/primitive/Line.java b/src/org/anddev/andengine/entity/primitive/Line.java
index ddd17f9..4f7b39d 100644
--- a/src/org/anddev/andengine/entity/primitive/Line.java
+++ b/src/org/anddev/andengine/entity/primitive/Line.java
@@ -200,7 +200,7 @@
 
 	@Override
 	protected void postDraw(Camera pCamera) {
-		this.mMesh.preDraw(this.mShaderProgram);
+		this.mMesh.postDraw(this.mShaderProgram);
 
 		super.postDraw(pCamera);
 	}
