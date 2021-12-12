diff --git a/graphics/java/android/renderscript/RSSurfaceView.java b/graphics/java/android/renderscript/RSSurfaceView.java
index 199952c..20eb93f 100644
--- a/graphics/java/android/renderscript/RSSurfaceView.java
+++ b/graphics/java/android/renderscript/RSSurfaceView.java
@@ -77,7 +77,7 @@
      * This method is part of the SurfaceHolder.Callback interface, and is
      * not normally called or subclassed by clients of RSSurfaceView.
      */
-    public void surfaceDestroyed(SurfaceHolder holder) {
+    public synchronized void surfaceDestroyed(SurfaceHolder holder) {
         // Surface will be destroyed when we return
         if (mRS != null) {
             mRS.setSurface(null, 0, 0);
@@ -88,7 +88,7 @@
      * This method is part of the SurfaceHolder.Callback interface, and is
      * not normally called or subclassed by clients of RSSurfaceView.
      */
-    public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {
+    public synchronized void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {
         if (mRS != null) {
             mRS.setSurface(holder, w, h);
         }
@@ -125,7 +125,7 @@
         return rs;
     }
 
-    public void destroyRenderScriptGL() {
+    public synchronized void destroyRenderScriptGL() {
         mRS.destroy();
         mRS = null;
     }
