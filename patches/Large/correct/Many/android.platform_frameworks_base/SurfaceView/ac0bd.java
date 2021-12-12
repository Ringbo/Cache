diff --git a/core/java/android/view/SurfaceView.java b/core/java/android/view/SurfaceView.java
index 61b1247..6d320ef 100644
--- a/core/java/android/view/SurfaceView.java
+++ b/core/java/android/view/SurfaceView.java
@@ -500,7 +500,12 @@
                         // While creating the surface, we will set it's initial
                         // geometry. Outside of that though, we should generally
                         // leave it to the RenderThread.
-                        if (creating || !mRtHandlingPositionUpdates) {
+                        //
+                        // There is one more case when the buffer size changes we aren't yet
+                        // prepared to sync (as even following the transaction applying
+                        // we still need to latch a buffer).
+                        // b/28866173
+                        if (sizeChanged || creating || !mRtHandlingPositionUpdates) {
                             mSurfaceControl.setPosition(mScreenRect.left, mScreenRect.top);
                             mSurfaceControl.setMatrix(mScreenRect.width() / (float) mSurfaceWidth,
                                     0.0f, 0.0f,
