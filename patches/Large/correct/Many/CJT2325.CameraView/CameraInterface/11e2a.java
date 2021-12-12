diff --git a/camera/src/main/java/com/cjt2325/cameralibrary/CameraInterface.java b/camera/src/main/java/com/cjt2325/cameralibrary/CameraInterface.java
index 0db17e0..49ea5a9 100644
--- a/camera/src/main/java/com/cjt2325/cameralibrary/CameraInterface.java
+++ b/camera/src/main/java/com/cjt2325/cameralibrary/CameraInterface.java
@@ -251,7 +251,7 @@
 
     private void openCamera(int id) {
         mCamera = Camera.open(id);
-        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN_MR1) {
+        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN_MR1 && mCamera != null) {
             mCamera.enableShutterSound(false);
         }
     }
