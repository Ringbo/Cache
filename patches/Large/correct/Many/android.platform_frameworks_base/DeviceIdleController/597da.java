diff --git a/services/core/java/com/android/server/DeviceIdleController.java b/services/core/java/com/android/server/DeviceIdleController.java
index b814dab..c472181 100644
--- a/services/core/java/com/android/server/DeviceIdleController.java
+++ b/services/core/java/com/android/server/DeviceIdleController.java
@@ -812,7 +812,7 @@
                 MIN_DEEP_MAINTENANCE_TIME = mParser.getLong(
                         KEY_MIN_DEEP_MAINTENANCE_TIME,
                         !COMPRESS_TIME ? 30 * 1000L : 5 * 1000L);
-                long inactiveTimeoutDefault = (mSmallBatteryDevice ? 3 : 30) * 60 * 1000L;
+                long inactiveTimeoutDefault = (mSmallBatteryDevice ? 15 : 30) * 60 * 1000L;
                 INACTIVE_TIMEOUT = mParser.getLong(KEY_INACTIVE_TIMEOUT,
                         !COMPRESS_TIME ? inactiveTimeoutDefault : (inactiveTimeoutDefault / 10));
                 SENSING_TIMEOUT = mParser.getLong(KEY_SENSING_TIMEOUT,
@@ -822,7 +822,7 @@
                 LOCATION_ACCURACY = mParser.getFloat(KEY_LOCATION_ACCURACY, 20);
                 MOTION_INACTIVE_TIMEOUT = mParser.getLong(KEY_MOTION_INACTIVE_TIMEOUT,
                         !COMPRESS_TIME ? 10 * 60 * 1000L : 60 * 1000L);
-                long idleAfterInactiveTimeout = (mSmallBatteryDevice ? 3 : 30) * 60 * 1000L;
+                long idleAfterInactiveTimeout = (mSmallBatteryDevice ? 15 : 30) * 60 * 1000L;
                 IDLE_AFTER_INACTIVE_TIMEOUT = mParser.getLong(KEY_IDLE_AFTER_INACTIVE_TIMEOUT,
                         !COMPRESS_TIME ? idleAfterInactiveTimeout
                                        : (idleAfterInactiveTimeout / 10));
