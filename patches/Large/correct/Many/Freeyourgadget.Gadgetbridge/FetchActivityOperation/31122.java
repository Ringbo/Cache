diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/miband2/operations/FetchActivityOperation.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/miband2/operations/FetchActivityOperation.java
index 768f923..85200a6 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/miband2/operations/FetchActivityOperation.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/miband2/operations/FetchActivityOperation.java
@@ -218,7 +218,7 @@
     private void handleActivityMetadata(byte[] value) {
         if (value.length == 15) {
             // first two bytes are whether our request was accepted
-            if (ArrayUtils.equals(MiBand2Service.RESPONSE_ACTIVITY_DATA_START_DATE_SUCCESS, value, 0, 2)) {
+            if (ArrayUtils.equals(MiBand2Service.RESPONSE_ACTIVITY_DATA_START_DATE_SUCCESS, value, 0, 3)) {
                 // the third byte (0x01 on success) = ?
                 // the 4th - 7th bytes probably somehow represent the number of bytes/packets to expect
 
