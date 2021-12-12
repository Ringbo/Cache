diff --git a/mockrxandroidble/src/main/java/com/polidea/rxandroidble/mockrxandroidble/RxBleClientMock.java b/mockrxandroidble/src/main/java/com/polidea/rxandroidble/mockrxandroidble/RxBleClientMock.java
index 89f69e5..c0db7dd 100644
--- a/mockrxandroidble/src/main/java/com/polidea/rxandroidble/mockrxandroidble/RxBleClientMock.java
+++ b/mockrxandroidble/src/main/java/com/polidea/rxandroidble/mockrxandroidble/RxBleClientMock.java
@@ -105,9 +105,9 @@
         }
 
         /**
-         * Create the {@link RxBleClientMock} instance using the configured values.
+         * Create the {@link RxBleDeviceMock} instance using the configured values.
          */
-        public RxBleDeviceMock build() {
+        public RxBleDevice build() {
             if (this.rssi == -1) throw new IllegalStateException("Rssi is required. DeviceBuilder#rssi should be called.");
             if (this.deviceMacAddress == null) throw new IllegalStateException("DeviceMacAddress required."
                     + " DeviceBuilder#deviceMacAddress should be called.");
