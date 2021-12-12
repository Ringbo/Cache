diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index 4a8e146..49a03c0 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -5421,7 +5421,7 @@
         // If the service process is killed, then ask it to clean up after itself
         final ComponentName errorComponent = new ComponentName(SYSUI_PACKAGE,
                 SYSUI_SCREENSHOT_ERROR_RECEIVER);
-        Intent errorIntent = new Intent();
+        Intent errorIntent = new Intent(Intent.ACTION_USER_PRESENT);
         errorIntent.setComponent(errorComponent);
         errorIntent.addFlags(Intent.FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT |
                 Intent.FLAG_RECEIVER_FOREGROUND);
