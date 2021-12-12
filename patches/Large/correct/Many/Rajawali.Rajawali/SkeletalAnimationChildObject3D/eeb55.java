diff --git a/rajawali/src/main/java/org/rajawali3d/animation/mesh/SkeletalAnimationChildObject3D.java b/rajawali/src/main/java/org/rajawali3d/animation/mesh/SkeletalAnimationChildObject3D.java
index aee10a0..f760ee1 100644
--- a/rajawali/src/main/java/org/rajawali3d/animation/mesh/SkeletalAnimationChildObject3D.java
+++ b/rajawali/src/main/java/org/rajawali3d/animation/mesh/SkeletalAnimationChildObject3D.java
@@ -89,7 +89,7 @@
 			mTmpScale.setAll(mScale.x, mScale.y, mScale.z);
 		
 		mMMatrix.identity().translate(mPosition).scale(mTmpScale).multiply(mRotationMatrix);
-		if (parentMatrix != null) mMMatrix.leftMultiply(mParentMatrix);
+		if (parentMatrix != null) mMMatrix.leftMultiply(parentMatrix);
 	}
 
 	public void setShaderParams(Camera camera) {
