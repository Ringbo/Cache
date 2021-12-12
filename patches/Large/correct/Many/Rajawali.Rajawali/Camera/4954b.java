diff --git a/src/rajawali/Camera.java b/src/rajawali/Camera.java
index 365dd10..d528ae1 100644
--- a/src/rajawali/Camera.java
+++ b/src/rajawali/Camera.java
@@ -83,7 +83,7 @@
 		synchronized (mFrustumLock) {
 			Matrix.multiplyMM(mCombinedMatrix, 0, pMatrix, 0, vMatrix, 0);
 			Matrix.invertM(mTmpMatrix, 0, mCombinedMatrix, 0);
-			mFrustum.update(mCombinedMatrix);
+			mFrustum.update(mTmpMatrix);
 		}
 	}
 
