diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/DatalogSessionHealthSteps.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/DatalogSessionHealthSteps.java
index 8783c32..3103dab 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/DatalogSessionHealthSteps.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/DatalogSessionHealthSteps.java
@@ -86,7 +86,7 @@
                 StepsRecord stepsRecord = stepsRecords[j];
                 samples[j] = new PebbleHealthActivitySample(
                         stepsRecord.timestamp,
-                        userId, deviceId,
+                        deviceId, userId,
                         stepsRecord.getRawData(),
                         stepsRecord.intensity,
                         stepsRecord.steps
