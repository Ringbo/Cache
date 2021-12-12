diff --git a/android/src/main/java/com/lwansbrough/RCTCamera/RCTCamera.java b/android/src/main/java/com/lwansbrough/RCTCamera/RCTCamera.java
index 063a40a..9dc3df3 100644
--- a/android/src/main/java/com/lwansbrough/RCTCamera/RCTCamera.java
+++ b/android/src/main/java/com/lwansbrough/RCTCamera/RCTCamera.java
@@ -35,7 +35,7 @@
     }
 
 
-    public Camera acquireCameraInstance(int type) {
+    public synchronized Camera acquireCameraInstance(int type) {
         if (null == _cameras.get(type) && null != _cameraTypeToIndex.get(type)) {
             try {
                 Camera camera = Camera.open(_cameraTypeToIndex.get(type));
@@ -206,7 +206,7 @@
     }
 
     public void setCaptureQuality(int cameraType, String captureQuality) {
-        Camera camera = _cameras.get(cameraType);
+        Camera camera = this.acquireCameraInstance(cameraType);
         if (camera == null) {
             return;
         }
@@ -246,7 +246,7 @@
     }
 
     public CamcorderProfile setCaptureVideoQuality(int cameraType, String captureQuality) {
-        Camera camera = _cameras.get(cameraType);
+        Camera camera = this.acquireCameraInstance(cameraType);
         if (camera == null) {
             return null;
         }
@@ -294,7 +294,7 @@
     }
 
     public void setTorchMode(int cameraType, int torchMode) {
-        Camera camera = _cameras.get(cameraType);
+        Camera camera = this.acquireCameraInstance(cameraType);
         if (null == camera) {
             return;
         }
@@ -318,7 +318,7 @@
     }
 
     public void setFlashMode(int cameraType, int flashMode) {
-        Camera camera = _cameras.get(cameraType);
+        Camera camera = this.acquireCameraInstance(cameraType);
         if (null == camera) {
             return;
         }
