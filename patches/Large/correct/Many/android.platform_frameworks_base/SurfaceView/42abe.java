diff --git a/core/java/android/view/SurfaceView.java b/core/java/android/view/SurfaceView.java
index a97babd..ef78559 100644
--- a/core/java/android/view/SurfaceView.java
+++ b/core/java/android/view/SurfaceView.java
@@ -454,7 +454,7 @@
     }
 
     private void updateOpaqueFlag() {
-        if (PixelFormat.formatHasAlpha(mRequestedFormat)) {
+        if (!PixelFormat.formatHasAlpha(mRequestedFormat)) {
             mSurfaceFlags |= SurfaceControl.OPAQUE;
         } else {
             mSurfaceFlags &= ~SurfaceControl.OPAQUE;
