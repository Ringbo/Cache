diff --git a/services/java/com/android/server/SystemServer.java b/services/java/com/android/server/SystemServer.java
index cd6e786..a0c7f86 100644
--- a/services/java/com/android/server/SystemServer.java
+++ b/services/java/com/android/server/SystemServer.java
@@ -669,7 +669,8 @@
 
                 mSystemServiceManager.startService("com.android.server.wifi.RttService");
 
-                if (mPackageManager.hasSystemFeature(PackageManager.FEATURE_ETHERNET)) {
+                if (mPackageManager.hasSystemFeature(PackageManager.FEATURE_ETHERNET) ||
+                    mPackageManager.hasSystemFeature(PackageManager.FEATURE_USB_HOST)) {
                     mSystemServiceManager.startService(ETHERNET_SERVICE_CLASS);
                 }
 
