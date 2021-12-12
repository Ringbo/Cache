diff --git a/camera/src/main/java/com/cjt2325/cameralibrary/CameraInterface.java b/camera/src/main/java/com/cjt2325/cameralibrary/CameraInterface.java
index 7cd7bd1..23ec044 100644
--- a/camera/src/main/java/com/cjt2325/cameralibrary/CameraInterface.java
+++ b/camera/src/main/java/com/cjt2325/cameralibrary/CameraInterface.java
@@ -203,7 +203,7 @@
         if (mParams == null) {
             mParams = mCamera.getParameters();
         }
-        if (!mParams.isZoomSupported() && !mParams.isSmoothZoomSupported()) {
+        if (!mParams.isZoomSupported() || !mParams.isSmoothZoomSupported()) {
             return;
         }
         switch (type) {
