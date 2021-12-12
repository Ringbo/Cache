diff --git a/core/java/android/server/BluetoothService.java b/core/java/android/server/BluetoothService.java
index af3730e..eaf49bb 100644
--- a/core/java/android/server/BluetoothService.java
+++ b/core/java/android/server/BluetoothService.java
@@ -1515,7 +1515,7 @@
 
         handlePanDeviceStateChange(device, BluetoothPan.STATE_CONNECTING,
                                            BluetoothPan.LOCAL_PANU_ROLE);
-        if (connectPanDeviceNative(objectPath, "nap", "panu")) {
+        if (connectPanDeviceNative(objectPath, "nap")) {
             log ("connecting to PAN");
             return true;
         } else {
