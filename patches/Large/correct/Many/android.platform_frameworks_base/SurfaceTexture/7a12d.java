diff --git a/graphics/java/android/graphics/SurfaceTexture.java b/graphics/java/android/graphics/SurfaceTexture.java
index d62fd67..f3b62ec 100644
--- a/graphics/java/android/graphics/SurfaceTexture.java
+++ b/graphics/java/android/graphics/SurfaceTexture.java
@@ -93,7 +93,7 @@
      * @param texName the OpenGL texture object name (e.g. generated via glGenTextures)
      */
     public SurfaceTexture(int texName) {
-        this(texName, true);
+        this(texName, false);
     }
 
     /**
@@ -104,6 +104,8 @@
      *      When the image stream comes from OpenGL, SurfaceTexture may run in the synchronous
      *      mode where the producer side may be blocked to avoid skipping frames. To avoid the
      *      thread block, set allowSynchronousMode to false.
+     *
+     * @hide
      */
     public SurfaceTexture(int texName, boolean allowSynchronousMode) {
         Looper looper;
