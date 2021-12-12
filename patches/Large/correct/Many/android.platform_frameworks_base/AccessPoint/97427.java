diff --git a/packages/SettingsLib/src/com/android/settingslib/wifi/AccessPoint.java b/packages/SettingsLib/src/com/android/settingslib/wifi/AccessPoint.java
index 01d9014..f2898c9 100644
--- a/packages/SettingsLib/src/com/android/settingslib/wifi/AccessPoint.java
+++ b/packages/SettingsLib/src/com/android/settingslib/wifi/AccessPoint.java
@@ -764,7 +764,7 @@
         if (WifiTracker.sVerboseLogging) {
             // Add RSSI/band information for this config, what was seen up to 6 seconds ago
             // verbose WiFi Logging is only turned on thru developers settings
-            if (mInfo != null && mNetworkInfo != null) { // This is the active connection
+            if (isActive() && mInfo != null) {
                 summary.append(" f=" + Integer.toString(mInfo.getFrequency()));
             }
             summary.append(" " + getVisibilityStatus());
@@ -826,7 +826,7 @@
 
         long now = System.currentTimeMillis();
 
-        if (mInfo != null) {
+        if (isActive() && mInfo != null) {
             bssid = mInfo.getBSSID();
             if (bssid != null) {
                 visibility.append(" ").append(bssid);
