diff --git a/services/java/com/android/server/DevicePolicyManagerService.java b/services/java/com/android/server/DevicePolicyManagerService.java
index 6a62809..05f2004 100644
--- a/services/java/com/android/server/DevicePolicyManagerService.java
+++ b/services/java/com/android/server/DevicePolicyManagerService.java
@@ -1638,7 +1638,7 @@
                 if (realQuality < quality
                         && quality != DevicePolicyManager.PASSWORD_QUALITY_COMPLEX) {
                     Slog.w(TAG, "resetPassword: password quality 0x"
-                            + Integer.toHexString(quality)
+                            + Integer.toHexString(realQuality)
                             + " does not meet required quality 0x"
                             + Integer.toHexString(quality));
                     return false;
