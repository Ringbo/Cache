diff --git a/core/java/android/server/BluetoothService.java b/core/java/android/server/BluetoothService.java
index 3cf207f..97c0209 100755
--- a/core/java/android/server/BluetoothService.java
+++ b/core/java/android/server/BluetoothService.java
@@ -530,7 +530,7 @@
         // Bluetooth stack needs a small delay here before adding
         // SDP records, otherwise dbus stalls for over 30 seconds 1 out of 50 runs
         try {
-            Thread.sleep(20);
+            Thread.sleep(50);
         } catch (InterruptedException e) {}
         updateSdpRecords();
         return true;
@@ -602,7 +602,7 @@
         // Bluetooth stack need some a small delay here before adding more
         // SDP records, otherwise dbus stalls for over 30 seconds 1 out of 50 runs
         try {
-            Thread.sleep(20);
+            Thread.sleep(50);
         } catch (InterruptedException e) {}
 
         if (R.getBoolean(com.android.internal.R.bool.config_bluetooth_default_profiles)) {
