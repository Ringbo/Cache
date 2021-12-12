diff --git a/services/core/java/com/android/server/DeviceIdleController.java b/services/core/java/com/android/server/DeviceIdleController.java
index a4d0dc8..74b4543 100644
--- a/services/core/java/com/android/server/DeviceIdleController.java
+++ b/services/core/java/com/android/server/DeviceIdleController.java
@@ -812,9 +812,9 @@
 
                 LIGHT_IDLE_AFTER_INACTIVE_TIMEOUT = mParser.getDurationMillis(
                         KEY_LIGHT_IDLE_AFTER_INACTIVE_TIMEOUT,
-                        !COMPRESS_TIME ? 5 * 60 * 1000L : 15 * 1000L);
+                        !COMPRESS_TIME ? 3 * 60 * 1000L : 15 * 1000L);
                 LIGHT_PRE_IDLE_TIMEOUT = mParser.getDurationMillis(KEY_LIGHT_PRE_IDLE_TIMEOUT,
-                        !COMPRESS_TIME ? 10 * 60 * 1000L : 30 * 1000L);
+                        !COMPRESS_TIME ? 3 * 60 * 1000L : 30 * 1000L);
                 LIGHT_IDLE_TIMEOUT = mParser.getDurationMillis(KEY_LIGHT_IDLE_TIMEOUT,
                         !COMPRESS_TIME ? 5 * 60 * 1000L : 15 * 1000L);
                 LIGHT_IDLE_FACTOR = mParser.getFloat(KEY_LIGHT_IDLE_FACTOR,
