diff --git a/rxandroidble/src/main/java/com/polidea/rxandroidble/RxBleClientImpl.java b/rxandroidble/src/main/java/com/polidea/rxandroidble/RxBleClientImpl.java
index 6e482df..392815f 100644
--- a/rxandroidble/src/main/java/com/polidea/rxandroidble/RxBleClientImpl.java
+++ b/rxandroidble/src/main/java/com/polidea/rxandroidble/RxBleClientImpl.java
@@ -24,7 +24,7 @@
 
 import rx.Observable;
 
-class RxBleClientImpl implements RxBleClient {
+class RxBleClientImpl extends RxBleClient {
 
     private static RxBleClientImpl CLIENT_INSTANCE;
     private final BluetoothAdapter bluetoothAdapter;
@@ -34,7 +34,7 @@
     private final Map<Set<UUID>, Observable<RxBleScanResult>> queuedScanOperations = new HashMap<>();
     private final Context context;
 
-    static RxBleClientImpl getInstance(Context context) {
+    public static RxBleClientImpl getInstance(Context context) {
 
         if (CLIENT_INSTANCE == null) {
 
