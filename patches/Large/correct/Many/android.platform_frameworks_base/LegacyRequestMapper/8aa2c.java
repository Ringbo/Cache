diff --git a/core/java/android/hardware/camera2/legacy/LegacyRequestMapper.java b/core/java/android/hardware/camera2/legacy/LegacyRequestMapper.java
index 1e4561f..4a9afa6 100644
--- a/core/java/android/hardware/camera2/legacy/LegacyRequestMapper.java
+++ b/core/java/android/hardware/camera2/legacy/LegacyRequestMapper.java
@@ -162,7 +162,7 @@
                     CONTROL_AE_EXPOSURE_COMPENSATION,
                     /*defaultValue*/0);
 
-            if (!compensationRange.inRange(compensation)) {
+            if (!compensationRange.contains(compensation)) {
                 Log.w(TAG,
                         "convertRequestMetadata - control.aeExposureCompensation " +
                         "is out of range, ignoring value");
