diff --git a/opengl/java/android/opengl/GLSurfaceView.java b/opengl/java/android/opengl/GLSurfaceView.java
index 1406f6b..3c76115 100644
--- a/opengl/java/android/opengl/GLSurfaceView.java
+++ b/opengl/java/android/opengl/GLSurfaceView.java
@@ -595,9 +595,8 @@
         mDetached = false;
     }
 
-    /** @hide */
     @Override
-    protected void onDetachedFromWindowInternal() {
+    protected void onDetachedFromWindow() {
         if (LOG_ATTACH_DETACH) {
             Log.d(TAG, "onDetachedFromWindow");
         }
@@ -605,7 +604,7 @@
             mGLThread.requestExitAndWait();
         }
         mDetached = true;
-        super.onDetachedFromWindowInternal();
+        super.onDetachedFromWindow();
     }
 
     // ----------------------------------------------------------------------
