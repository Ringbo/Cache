diff --git a/media/java/android/media/AudioService.java b/media/java/android/media/AudioService.java
index d1b9351..754d5a2 100644
--- a/media/java/android/media/AudioService.java
+++ b/media/java/android/media/AudioService.java
@@ -1381,7 +1381,8 @@
                             address);
                     mConnectedDevices.remove(AudioSystem.DEVICE_OUT_BLUETOOTH_A2DP);
                 } else if (!isConnected &&
-                           (state == BluetoothA2dp.STATE_CONNECTED || state != BluetoothA2dp.STATE_PLAYING)){
+                             (state == BluetoothA2dp.STATE_CONNECTED ||
+                              state == BluetoothA2dp.STATE_PLAYING)) {
                     AudioSystem.setDeviceConnectionState(AudioSystem.DEVICE_OUT_BLUETOOTH_A2DP,
                                                          AudioSystem.DEVICE_STATE_AVAILABLE,
                                                          address);
