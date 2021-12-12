diff --git a/rxandroidble/src/main/java/com/polidea/rxandroidble/RxBleClient.java b/rxandroidble/src/main/java/com/polidea/rxandroidble/RxBleClient.java
index de1d8f9..d41fb08 100644
--- a/rxandroidble/src/main/java/com/polidea/rxandroidble/RxBleClient.java
+++ b/rxandroidble/src/main/java/com/polidea/rxandroidble/RxBleClient.java
@@ -9,7 +9,7 @@
 
 import rx.Observable;
 
-public interface RxBleClient {
+public abstract class RxBleClient {
 
     /**
      * A convenience method.
@@ -26,11 +26,11 @@
      * @param context Any context
      * @return BLE client instance.
      */
-    static RxBleClient getInstance(Context context) {
+    public static RxBleClient getInstance(Context context) {
         return RxBleClientImpl.getInstance(context);
     }
 
-    RxBleDevice getBleDevice(String bluetoothAddress);
+    public abstract RxBleDevice getBleDevice(String bluetoothAddress);
 
     /**
      * Returns an infinite observable returning BLE scan results. Scan is automatically started and stopped based on the Observable lifecycle.
@@ -39,7 +39,7 @@
      * @throws com.polidea.rxandroidble.exceptions.BleScanException         in case of error starting the scan
      * @throws com.polidea.rxandroidble.exceptions.BleNotAvailableException in case of Bluetooth not available or not enabled
      */
-    Observable<RxBleScanResult> scanBleDevices(
+    public abstract Observable<RxBleScanResult> scanBleDevices(
             @Nullable UUID[] filterServiceUUIDs
     );
 }
