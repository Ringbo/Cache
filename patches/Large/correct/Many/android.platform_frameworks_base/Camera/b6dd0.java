diff --git a/core/java/android/hardware/Camera.java b/core/java/android/hardware/Camera.java
index 207785c..c2f3ae7 100644
--- a/core/java/android/hardware/Camera.java
+++ b/core/java/android/hardware/Camera.java
@@ -357,7 +357,7 @@
         }
     }
 
-    private native final void setPreviewDisplay(Surface surface);
+    private native final void setPreviewDisplay(Surface surface) throws IOException;
 
     /**
      * Sets the {@link SurfaceTexture} to be used for live preview.
@@ -380,7 +380,7 @@
      * @throws IOException if the method fails (for example, if the surface
      *     texture is unavailable or unsuitable).
      */
-    public native final void setPreviewTexture(SurfaceTexture surfaceTexture);
+    public native final void setPreviewTexture(SurfaceTexture surfaceTexture) throws IOException;
 
     /**
      * Callback interface used to deliver copies of preview frames as
