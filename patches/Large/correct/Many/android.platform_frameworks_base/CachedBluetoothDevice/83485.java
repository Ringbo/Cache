diff --git a/packages/SettingsLib/src/com/android/settingslib/bluetooth/CachedBluetoothDevice.java b/packages/SettingsLib/src/com/android/settingslib/bluetooth/CachedBluetoothDevice.java
index c075703..a879d16 100644
--- a/packages/SettingsLib/src/com/android/settingslib/bluetooth/CachedBluetoothDevice.java
+++ b/packages/SettingsLib/src/com/android/settingslib/bluetooth/CachedBluetoothDevice.java
@@ -809,7 +809,9 @@
             // No separate prompt is displayed after pairing.
             if (getPhonebookPermissionChoice() == CachedBluetoothDevice.ACCESS_UNKNOWN) {
                 if (mDevice.getBluetoothClass().getDeviceClass()
-                        == BluetoothClass.Device.AUDIO_VIDEO_HANDSFREE) {
+                        == BluetoothClass.Device.AUDIO_VIDEO_HANDSFREE ||
+                    mDevice.getBluetoothClass().getDeviceClass()
+                        == BluetoothClass.Device.AUDIO_VIDEO_WEARABLE_HEADSET) {
                     setPhonebookPermissionChoice(CachedBluetoothDevice.ACCESS_ALLOWED);
                 } else {
                     setPhonebookPermissionChoice(CachedBluetoothDevice.ACCESS_REJECTED);
