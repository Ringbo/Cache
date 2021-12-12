diff --git a/rajawali/src/main/java/org/rajawali3d/scene/Scene.java b/rajawali/src/main/java/org/rajawali3d/scene/Scene.java
index f1a2f2d..bda14af 100644
--- a/rajawali/src/main/java/org/rajawali3d/scene/Scene.java
+++ b/rajawali/src/main/java/org/rajawali3d/scene/Scene.java
@@ -992,7 +992,7 @@
 			//Check if we need to switch the camera, and if so, do it.
 			if (mNextCamera != null) {
 				mCamera = mNextCamera;
-                mCamera.setProjectionMatrix(mRenderer.getViewportWidth(), mRenderer.getDefaultViewportHeight());
+                mCamera.setProjectionMatrix(mRenderer.getViewportWidth(), mRenderer.getViewportHeight());
 				mNextCamera = null;
 			}
 		}
