diff --git a/src/rajawali/materials/ParticleMaterial.java b/src/rajawali/materials/ParticleMaterial.java
index 09e2374..179b7c5 100644
--- a/src/rajawali/materials/ParticleMaterial.java
+++ b/src/rajawali/materials/ParticleMaterial.java
@@ -133,7 +133,7 @@
 	public void setVelocity(final int velocityBufferHandle) {
 		GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, velocityBufferHandle);
 		GLES20.glEnableVertexAttribArray(maVelocityHandle);
-		fix.android.opengl.GLES20.glVertexAttribPointer(maVelocityHandle, 4, GLES20.GL_FLOAT, false,
+		fix.android.opengl.GLES20.glVertexAttribPointer(maVelocityHandle, 3, GLES20.GL_FLOAT, false,
 				0, 0);
     }
 	
