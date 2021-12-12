diff --git a/packages/SettingsLib/src/com/android/settingslib/bluetooth/CachedBluetoothDeviceManager.java b/packages/SettingsLib/src/com/android/settingslib/bluetooth/CachedBluetoothDeviceManager.java
index a3ae926..abd4e29 100755
--- a/packages/SettingsLib/src/com/android/settingslib/bluetooth/CachedBluetoothDeviceManager.java
+++ b/packages/SettingsLib/src/com/android/settingslib/bluetooth/CachedBluetoothDeviceManager.java
@@ -103,7 +103,7 @@
      */
     public String getName(BluetoothDevice device) {
         CachedBluetoothDevice cachedDevice = findDevice(device);
-        if (cachedDevice != null) {
+        if (cachedDevice != null && cachedDevice.getName() != null) {
             return cachedDevice.getName();
         }
 
