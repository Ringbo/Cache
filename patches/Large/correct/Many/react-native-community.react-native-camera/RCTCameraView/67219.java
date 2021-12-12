diff --git a/android/src/main/java/com/lwansbrough/RCTCamera/RCTCameraView.java b/android/src/main/java/com/lwansbrough/RCTCamera/RCTCameraView.java
index 4c609e2..f9fe98e 100644
--- a/android/src/main/java/com/lwansbrough/RCTCamera/RCTCameraView.java
+++ b/android/src/main/java/com/lwansbrough/RCTCamera/RCTCameraView.java
@@ -74,7 +74,7 @@
                 _viewFinder.setFlashMode(this._flashMode);
             }
             if (-1 != this._torchMode) {
-                _viewFinder.setFlashMode(this._torchMode);
+                _viewFinder.setTorchMode(this._torchMode);
             }
             addView(_viewFinder);
         }
