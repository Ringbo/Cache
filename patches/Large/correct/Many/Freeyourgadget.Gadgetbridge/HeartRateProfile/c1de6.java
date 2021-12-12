diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/btle/profiles/heartrate/HeartRateProfile.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/btle/profiles/heartrate/HeartRateProfile.java
index 841c096..9b199ad 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/btle/profiles/heartrate/HeartRateProfile.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/btle/profiles/heartrate/HeartRateProfile.java
@@ -71,7 +71,7 @@
                 format = BluetoothGattCharacteristic.FORMAT_UINT8;
             }
             final int heartRate = characteristic.getIntValue(format, 1);
-            LOG.info("Heart rate: " + heartRate, Toast.LENGTH_LONG, GB.INFO);
+            LOG.info("Heart rate: " + heartRate);
         }
         return false;
     }
