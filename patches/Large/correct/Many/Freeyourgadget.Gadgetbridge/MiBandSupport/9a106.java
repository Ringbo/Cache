diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/miband/MiBandSupport.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/miband/MiBandSupport.java
index 527f704..72d5bc8 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/miband/MiBandSupport.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/miband/MiBandSupport.java
@@ -361,7 +361,7 @@
         LOG.info("Attempting to set wear location...");
         BluetoothGattCharacteristic characteristic = getCharacteristic(MiBandService.UUID_CHARACTERISTIC_CONTROL_POINT);
         if (characteristic != null) {
-            transaction.add(new ConditionalWriteAction() {
+            transaction.add(new ConditionalWriteAction(characteristic) {
                 @Override
                 protected byte[] checkCondition() {
                     if (getDeviceInfo() != null && getDeviceInfo().isAmazFit()) {
