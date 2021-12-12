diff --git a/telecomm/java/android/telecom/Connection.java b/telecomm/java/android/telecom/Connection.java
index 9a53d8c..ca444d4 100644
--- a/telecomm/java/android/telecom/Connection.java
+++ b/telecomm/java/android/telecom/Connection.java
@@ -2598,7 +2598,6 @@
     }
 
     /**
-     *
      * Request audio routing to a specific bluetooth device. Calling this method may result in
      * the device routing audio to a different bluetooth device than the one specified if the
      * bluetooth stack is unable to route audio to the requested device.
@@ -2609,13 +2608,13 @@
      * Used by self-managed {@link ConnectionService}s which wish to use bluetooth audio for a
      * self-managed {@link Connection} (see {@link PhoneAccount#CAPABILITY_SELF_MANAGED}.)
      * <p>
-     * See also {@link InCallService#requestBluetoothAudio(String)}
-     * @param bluetoothAddress The address of the bluetooth device to connect to, as returned by
-     *                         {@link BluetoothDevice#getAddress()}.
+     * See also {@link InCallService#requestBluetoothAudio(BluetoothDevice)}
+     * @param bluetoothDevice The bluetooth device to connect to.
      */
-    public void requestBluetoothAudio(@NonNull String bluetoothAddress) {
+    public void requestBluetoothAudio(@NonNull BluetoothDevice bluetoothDevice) {
         for (Listener l : mListeners) {
-            l.onAudioRouteChanged(this, CallAudioState.ROUTE_BLUETOOTH, bluetoothAddress);
+            l.onAudioRouteChanged(this, CallAudioState.ROUTE_BLUETOOTH,
+                    bluetoothDevice.getAddress());
         }
     }
 
