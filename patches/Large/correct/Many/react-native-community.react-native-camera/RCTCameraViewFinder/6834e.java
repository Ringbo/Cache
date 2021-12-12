diff --git a/android/src/main/java/com/lwansbrough/RCTCamera/RCTCameraViewFinder.java b/android/src/main/java/com/lwansbrough/RCTCamera/RCTCameraViewFinder.java
index da78f0b..7267f23 100644
--- a/android/src/main/java/com/lwansbrough/RCTCamera/RCTCameraViewFinder.java
+++ b/android/src/main/java/com/lwansbrough/RCTCamera/RCTCameraViewFinder.java
@@ -74,7 +74,7 @@
     }
 
     public void setFlashMode(int flashMode) {
-        RCTCamera.getInstance().setTorchMode(_cameraType, flashMode);
+        RCTCamera.getInstance().setFlashMode(_cameraType, flashMode);
     }
 
     private void startPreview() {
