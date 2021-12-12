diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/AppMessageHandlerMisfit.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/AppMessageHandlerMisfit.java
index 02183fb..1bb5199 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/AppMessageHandlerMisfit.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/AppMessageHandlerMisfit.java
@@ -83,7 +83,7 @@
                         Long deviceId = DBHelper.getDevice(getDevice(), db.getDaoSession()).getId();
                         for (int i = 0; i < samples; i++) {
                             short sample = buf.getShort();
-                            misfitSamples[i] = new PebbleMisfitSample(timestamp + i * 60, userId, deviceId, sample & 0xffff);
+                            misfitSamples[i] = new PebbleMisfitSample(timestamp + i * 60, deviceId, userId, sample & 0xffff);
                             misfitSamples[i].setProvider(sampleProvider);
                             int steps = misfitSamples[i].getSteps();
                             totalSteps += steps;
