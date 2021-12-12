diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/huami/miband3/MiBand3FirmwareInfo.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/huami/miband3/MiBand3FirmwareInfo.java
index a9aedb3..89c4a16 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/huami/miband3/MiBand3FirmwareInfo.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/huami/miband3/MiBand3FirmwareInfo.java
@@ -69,7 +69,7 @@
             return HuamiFirmwareType.INVALID;
         }
         if (ArrayUtils.startsWith(bytes, RES_HEADER)) {
-            if (bytes.length > 100000) { // don't know how to distinguish from Bip/Cor .res
+            if (bytes.length > 150000) { // don't know how to distinguish from Bip/Cor .res
                 return HuamiFirmwareType.INVALID;
             }
             return HuamiFirmwareType.RES;
