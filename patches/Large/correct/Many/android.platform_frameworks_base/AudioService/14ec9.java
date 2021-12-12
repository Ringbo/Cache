diff --git a/services/core/java/com/android/server/audio/AudioService.java b/services/core/java/com/android/server/audio/AudioService.java
index e9555f7..e5c3106 100644
--- a/services/core/java/com/android/server/audio/AudioService.java
+++ b/services/core/java/com/android/server/audio/AudioService.java
@@ -3931,7 +3931,7 @@
 
     public int setBluetoothA2dpDeviceConnectionState(BluetoothDevice device, int state, int profile)
     {
-        if (mAudioHandler.hasMessages(MSG_SET_A2DP_SINK_CONNECTION_STATE)) {
+        if (mAudioHandler.hasMessages(MSG_SET_A2DP_SINK_CONNECTION_STATE, device)) {
             return 0;
         }
         return setBluetoothA2dpDeviceConnectionStateInt(
@@ -5070,7 +5070,7 @@
 
     private void onSetA2dpSinkConnectionState(BluetoothDevice btDevice, int state)
     {
-        if (DEBUG_VOL) {
+        if (DEBUG_DEVICES) {
             Log.d(TAG, "onSetA2dpSinkConnectionState btDevice=" + btDevice+"state=" + state);
         }
         if (btDevice == null) {
@@ -5173,7 +5173,7 @@
 
         int device = AudioSystem.DEVICE_OUT_BLUETOOTH_A2DP;
         synchronized (mConnectedDevices) {
-            if (mAudioHandler.hasMessages(MSG_SET_A2DP_SINK_CONNECTION_STATE)) {
+            if (mAudioHandler.hasMessages(MSG_SET_A2DP_SINK_CONNECTION_STATE, btDevice)) {
                 return;
             }
             final String key = makeDeviceListKey(device, address);
