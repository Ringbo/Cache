diff --git a/core/java/android/hardware/camera2/CameraManager.java b/core/java/android/hardware/camera2/CameraManager.java
index faa782a..b513379 100644
--- a/core/java/android/hardware/camera2/CameraManager.java
+++ b/core/java/android/hardware/camera2/CameraManager.java
@@ -1013,10 +1013,10 @@
                 if (DEBUG) {
                     Log.v(TAG,
                             String.format(
-                                "Device status was previously available (%d), " +
-                                " and is now again available (%d)" +
+                                "Device status was previously available (%b), " +
+                                " and is now again available (%b)" +
                                 "so no new client visible update will be sent",
-                                isAvailable(status), isAvailable(status)));
+                                isAvailable(oldStatus), isAvailable(status)));
                 }
                 return;
             }
