diff --git a/services/core/java/com/android/server/connectivity/Tethering.java b/services/core/java/com/android/server/connectivity/Tethering.java
index 2c8e1dc..ef86c6c 100644
--- a/services/core/java/com/android/server/connectivity/Tethering.java
+++ b/services/core/java/com/android/server/connectivity/Tethering.java
@@ -429,7 +429,8 @@
             if (bluetoothTethered) {
                 showTetheredNotification(com.android.internal.R.drawable.stat_sys_tether_general);
             } else {
-                showTetheredNotification(com.android.internal.R.drawable.stat_sys_tether_wifi);
+                /* We now have a status bar icon for WifiTethering, so drop the notification */
+                clearTetheredNotification();
             }
         } else if (bluetoothTethered) {
             showTetheredNotification(com.android.internal.R.drawable.stat_sys_tether_bluetooth);
