diff --git a/core/java/android/bluetooth/BluetoothGatt.java b/core/java/android/bluetooth/BluetoothGatt.java
index 3df4336..71edc8a 100644
--- a/core/java/android/bluetooth/BluetoothGatt.java
+++ b/core/java/android/bluetooth/BluetoothGatt.java
@@ -1514,22 +1514,24 @@
      * @return true, if the request is send to the Bluetooth stack.
      * @hide
      */
-    public boolean requestLeConnectionUpdate(int minConnectionInterval,
-                                                 int maxConnectionInterval,
-                                                 int slaveLatency, int supervisionTimeout) {
+    public boolean requestLeConnectionUpdate(int minConnectionInterval, int maxConnectionInterval,
+                                             int slaveLatency, int supervisionTimeout,
+                                             int minConnectionEventLen, int maxConnectionEventLen) {
         if (DBG) {
             Log.d(TAG, "requestLeConnectionUpdate() - min=(" + minConnectionInterval
                        + ")" + (1.25 * minConnectionInterval)
                        + "msec, max=(" + maxConnectionInterval + ")"
                         + (1.25 * maxConnectionInterval) + "msec, latency=" + slaveLatency
-                       + ", timeout=" + supervisionTimeout + "msec");
+                        + ", timeout=" + supervisionTimeout + "msec" + ", min_ce="
+                        + minConnectionEventLen + ", max_ce=" + maxConnectionEventLen);
         }
         if (mService == null || mClientIf == 0) return false;
 
         try {
             mService.leConnectionUpdate(mClientIf, mDevice.getAddress(),
                                                minConnectionInterval, maxConnectionInterval,
-                                               slaveLatency, supervisionTimeout);
+                                        slaveLatency, supervisionTimeout,
+                                        minConnectionEventLen, maxConnectionEventLen);
         } catch (RemoteException e) {
             Log.e(TAG, "", e);
             return false;
