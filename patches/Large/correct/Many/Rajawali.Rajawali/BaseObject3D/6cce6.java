diff --git a/src/rajawali/BaseObject3D.java b/src/rajawali/BaseObject3D.java
index a5d2a7d..bede0c1 100644
--- a/src/rajawali/BaseObject3D.java
+++ b/src/rajawali/BaseObject3D.java
@@ -345,7 +345,7 @@
 		}
 		// Draw children without frustum test
 		for (int i = 0, j = mChildren.size(); i < j; i++)
-			mChildren.get(i).render(camera, projMatrix, vMatrix, mMMatrix, pickerInfo);
+			mChildren.get(i).render(camera, vpMatrix, projMatrix, vMatrix, mMMatrix, pickerInfo);
 
 		if (mRenderChildrenAsBatch) {
 			mMaterial.unbindTextures();
