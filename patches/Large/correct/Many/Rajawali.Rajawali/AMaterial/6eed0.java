diff --git a/src/rajawali/materials/AMaterial.java b/src/rajawali/materials/AMaterial.java
index aec90bf..ff17b0e 100644
--- a/src/rajawali/materials/AMaterial.java
+++ b/src/rajawali/materials/AMaterial.java
@@ -400,7 +400,7 @@
 
 	public void setViewMatrix(float[] viewMatrix) {
 		mViewMatrix = viewMatrix;
-		if(checkValidHandle(muMMatrixHandle, null))
+		if(checkValidHandle(muVMatrixHandle, null))
 			GLES20.glUniformMatrix4fv(muVMatrixHandle, 1, false, viewMatrix, 0);
 	}
 	
