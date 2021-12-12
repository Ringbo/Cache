diff --git a/core/java/android/view/ViewRootImpl.java b/core/java/android/view/ViewRootImpl.java
index 4742818..19b1cf3 100644
--- a/core/java/android/view/ViewRootImpl.java
+++ b/core/java/android/view/ViewRootImpl.java
@@ -1938,7 +1938,7 @@
                 mSurfaceHolder.setSurfaceFrameSize(mWidth, mHeight);
                 mSurfaceHolder.mSurfaceLock.unlock();
                 if (mSurface.isValid()) {
-                    if (!hadSurface || surfaceGenerationId != mSurface.getGenerationId()) {
+                    if (!hadSurface) {
                         mSurfaceHolder.ungetCallbacks();
 
                         mIsCreating = true;
@@ -1951,7 +1951,7 @@
                         }
                         surfaceChanged = true;
                     }
-                    if (surfaceChanged) {
+                    if (surfaceChanged || surfaceGenerationId != mSurface.getGenerationId()) {
                         mSurfaceHolderCallback.surfaceChanged(mSurfaceHolder,
                                 lp.format, mWidth, mHeight);
                         SurfaceHolder.Callback callbacks[] = mSurfaceHolder.getCallbacks();
