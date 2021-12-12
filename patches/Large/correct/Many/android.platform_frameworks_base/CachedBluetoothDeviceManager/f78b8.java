diff --git a/packages/SettingsLib/src/com/android/settingslib/bluetooth/CachedBluetoothDeviceManager.java b/packages/SettingsLib/src/com/android/settingslib/bluetooth/CachedBluetoothDeviceManager.java
index 2554d59..50c6aac 100644
--- a/packages/SettingsLib/src/com/android/settingslib/bluetooth/CachedBluetoothDeviceManager.java
+++ b/packages/SettingsLib/src/com/android/settingslib/bluetooth/CachedBluetoothDeviceManager.java
@@ -84,7 +84,7 @@
      * @return the cached device object for this device, or null if it has
      *   not been previously seen
      */
-    public CachedBluetoothDevice findDevice(BluetoothDevice device) {
+    public synchronized CachedBluetoothDevice findDevice(BluetoothDevice device) {
         for (CachedBluetoothDevice cachedDevice : mCachedDevices) {
             if (cachedDevice.getDevice().equals(device)) {
                 return cachedDevice;
