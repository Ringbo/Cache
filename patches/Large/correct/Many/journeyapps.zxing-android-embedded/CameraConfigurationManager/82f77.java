diff --git a/src/com/google/zxing/client/android/camera/CameraConfigurationManager.java b/src/com/google/zxing/client/android/camera/CameraConfigurationManager.java
index e06b01c..35dbf8c 100644
--- a/src/com/google/zxing/client/android/camera/CameraConfigurationManager.java
+++ b/src/com/google/zxing/client/android/camera/CameraConfigurationManager.java
@@ -58,7 +58,7 @@
     screenResolution = new Point(display.getWidth(), display.getHeight());
     Log.d(TAG, "Screen resolution: " + screenResolution);
     cameraResolution = getCameraResolution(parameters, screenResolution);
-    Log.d(TAG, "Camera resolution: " + screenResolution);
+    Log.d(TAG, "Camera resolution: " + cameraResolution);
   }
 
   /**
