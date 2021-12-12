diff --git a/core/java/android/view/SurfaceView.java b/core/java/android/view/SurfaceView.java
index 34ceeb7..7e0ade4 100644
--- a/core/java/android/view/SurfaceView.java
+++ b/core/java/android/view/SurfaceView.java
@@ -641,7 +641,7 @@
                         mSurface.copyFrom(mSurfaceControl);
                     }
 
-                    if (getContext().getApplicationInfo().targetSdkVersion
+                    if (sizeChanged && getContext().getApplicationInfo().targetSdkVersion
                             < Build.VERSION_CODES.O) {
                         // Some legacy applications use the underlying native {@link Surface} object
                         // as a key to whether anything has changed. In these cases, updates to the
