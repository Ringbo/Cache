diff --git a/services/java/com/android/server/DevicePolicyManagerService.java b/services/java/com/android/server/DevicePolicyManagerService.java
index ab70e6f..7ecd2c0 100644
--- a/services/java/com/android/server/DevicePolicyManagerService.java
+++ b/services/java/com/android/server/DevicePolicyManagerService.java
@@ -1664,7 +1664,7 @@
                 if (realQuality < quality
                         && quality != DevicePolicyManager.PASSWORD_QUALITY_COMPLEX) {
                     Slog.w(TAG, "resetPassword: password quality 0x"
-                            + Integer.toHexString(quality)
+                            + Integer.toHexString(realQuality)
                             + " does not meet required quality 0x"
                             + Integer.toHexString(quality));
                     return false;
