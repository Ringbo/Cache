diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/policy/FlashlightController.java b/packages/SystemUI/src/com/android/systemui/statusbar/policy/FlashlightController.java
index e05e34b..36cfb86 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/policy/FlashlightController.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/policy/FlashlightController.java
@@ -77,7 +77,7 @@
     public void initialize() {
         try {
             mCameraId = getCameraId();
-        } catch (CameraAccessException e) {
+        } catch (Throwable e) {
             Log.e(TAG, "Couldn't initialize.", e);
             return;
         }
