diff --git a/services/java/com/android/server/WifiService.java b/services/java/com/android/server/WifiService.java
index 660681b..5bfe6f8 100644
--- a/services/java/com/android/server/WifiService.java
+++ b/services/java/com/android/server/WifiService.java
@@ -1402,7 +1402,7 @@
         long ident = Binder.clearCallingIdentity();
         try {
             if (hadLock) {
-                noteAcquireWifiLock(wifiLock);
+                noteReleaseWifiLock(wifiLock);
                 switch(wifiLock.mMode) {
                     case WifiManager.WIFI_MODE_FULL:
                         ++mFullLocksReleased;
