diff --git a/services/java/com/android/server/wifi/WifiService.java b/services/java/com/android/server/wifi/WifiService.java
index 5a24ebb..2ae254c 100644
--- a/services/java/com/android/server/wifi/WifiService.java
+++ b/services/java/com/android/server/wifi/WifiService.java
@@ -582,7 +582,8 @@
      */
     public void setWifiApEnabled(WifiConfiguration wifiConfig, boolean enabled) {
         enforceChangePermission();
-        if (wifiConfig.isValid()) {
+        // null wifiConfig is a meaningful input for CMD_SET_AP
+        if (wifiConfig == null || wifiConfig.isValid()) {
             mWifiController.obtainMessage(CMD_SET_AP, enabled ? 1 : 0, 0, wifiConfig).sendToTarget();
         } else {
             Slog.e(TAG, "Invalid WifiConfiguration");
