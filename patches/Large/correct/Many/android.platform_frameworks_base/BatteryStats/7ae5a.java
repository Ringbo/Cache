diff --git a/core/java/android/os/BatteryStats.java b/core/java/android/os/BatteryStats.java
index c72b828..b0ae0e6 100644
--- a/core/java/android/os/BatteryStats.java
+++ b/core/java/android/os/BatteryStats.java
@@ -851,11 +851,11 @@
             }
             if (fullWifiLockOnTime != 0 || scanWifiLockOnTime != 0) {
                 pw.println(prefix + "    Full Wifi Lock Time: " 
-                        + formatTime(fullWifiLockOnTime / 1000) 
+                        + formatTimeMs(fullWifiLockOnTime / 1000) 
                         + "(" + formatRatioLocked(fullWifiLockOnTime, 
                                 whichBatteryRealtime)+ ")");
                 pw.println(prefix + "    Scan Wifi Lock Time: " 
-                        + formatTime(scanWifiLockOnTime / 1000)
+                        + formatTimeMs(scanWifiLockOnTime / 1000)
                         + "(" + formatRatioLocked(scanWifiLockOnTime, 
                                 whichBatteryRealtime)+ ")");
             }
