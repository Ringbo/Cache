diff --git a/services/java/com/android/server/SystemServer.java b/services/java/com/android/server/SystemServer.java
index 61c8b79..d24b3ee 100644
--- a/services/java/com/android/server/SystemServer.java
+++ b/services/java/com/android/server/SystemServer.java
@@ -1270,7 +1270,8 @@
 
             if (mPackageManager.hasSystemFeature(PackageManager.FEATURE_USB_HOST)
                 || mPackageManager.hasSystemFeature(
-                PackageManager.FEATURE_USB_ACCESSORY)) {
+                PackageManager.FEATURE_USB_ACCESSORY)
+                || isEmulator) {
                 // Manage USB host and device support
                 traceBeginAndSlog("StartUsbService");
                 mSystemServiceManager.startService(USB_SERVICE_CLASS);
