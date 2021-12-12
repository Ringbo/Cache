diff --git a/zxing-android-embedded/src/com/journeyapps/barcodescanner/CameraPreview.java b/zxing-android-embedded/src/com/journeyapps/barcodescanner/CameraPreview.java
index 5b8d9d2..d4a0a93 100644
--- a/zxing-android-embedded/src/com/journeyapps/barcodescanner/CameraPreview.java
+++ b/zxing-android-embedded/src/com/journeyapps/barcodescanner/CameraPreview.java
@@ -460,7 +460,7 @@
             } else {
                 surfaceView.layout(surfaceRect.left, surfaceRect.top, surfaceRect.right, surfaceRect.bottom);
             }
-        } else if(textureView != null) {
+        } else if(textureView != null && Build.VERSION.SDK_INT >= 14) {
             textureView.layout(0, 0, getWidth(), getHeight());
         }
     }
