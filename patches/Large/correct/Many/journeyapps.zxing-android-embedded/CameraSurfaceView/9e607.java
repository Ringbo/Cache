diff --git a/src/com/google/zxing/client/android/CameraSurfaceView.java b/src/com/google/zxing/client/android/CameraSurfaceView.java
index 06132cd..e532cd0 100644
--- a/src/com/google/zxing/client/android/CameraSurfaceView.java
+++ b/src/com/google/zxing/client/android/CameraSurfaceView.java
@@ -48,10 +48,7 @@
     surfaceHolder.setCallback(this);
     hasSurface = false;
     scannerAlpha = 0;
-
-    // FIXME(dswitkin): This resolution needs to be made dynamic to handle different devices and
-    // orientations.
-    surfaceHolder.setFixedSize(320, 240);
+    surfaceHolder.setSizeFromLayout();
   }
 
   public boolean surfaceCreated(SurfaceHolder holder) {
