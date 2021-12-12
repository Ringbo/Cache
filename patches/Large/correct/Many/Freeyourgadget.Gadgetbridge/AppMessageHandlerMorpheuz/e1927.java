diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/AppMessageHandlerMorpheuz.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/AppMessageHandlerMorpheuz.java
index d6e0189..4f7a14a 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/AppMessageHandlerMorpheuz.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/AppMessageHandlerMorpheuz.java
@@ -114,7 +114,7 @@
                                 Long userId = DBHelper.getUser(db.getDaoSession()).getId();
                                 Long deviceId = DBHelper.getDevice(getDevice(), db.getDaoSession()).getId();
                                 PebbleMorpheuzSampleProvider sampleProvider = new PebbleMorpheuzSampleProvider(getDevice(), db.getDaoSession());
-                                PebbleMorpheuzSample sample = new PebbleMorpheuzSample(recording_base_timestamp + index * 600, userId, deviceId, intensity);
+                                PebbleMorpheuzSample sample = new PebbleMorpheuzSample(recording_base_timestamp + index * 600, deviceId, userId, intensity);
                                 sample.setProvider(sampleProvider);
                                 sampleProvider.addGBActivitySample(sample);
                             } catch (Exception e) {
