diff --git a/telecomm/java/android/telecom/InCallService.java b/telecomm/java/android/telecom/InCallService.java
index af65c65..bd25ab2 100644
--- a/telecomm/java/android/telecom/InCallService.java
+++ b/telecomm/java/android/telecom/InCallService.java
@@ -428,12 +428,11 @@
      * A list of available devices can be obtained via
      * {@link CallAudioState#getSupportedBluetoothDevices()}
      *
-     * @param bluetoothAddress The address of the bluetooth device to connect to, as returned by
-     *                         {@link BluetoothDevice#getAddress()}.
+     * @param bluetoothDevice The bluetooth device to connect to.
      */
-    public final void requestBluetoothAudio(@NonNull String bluetoothAddress) {
+    public final void requestBluetoothAudio(@NonNull BluetoothDevice bluetoothDevice) {
         if (mPhone != null) {
-            mPhone.requestBluetoothAudio(bluetoothAddress);
+            mPhone.requestBluetoothAudio(bluetoothDevice.getAddress());
         }
     }
 
