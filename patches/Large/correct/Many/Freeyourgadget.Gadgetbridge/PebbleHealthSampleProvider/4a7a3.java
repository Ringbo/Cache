diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/pebble/PebbleHealthSampleProvider.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/pebble/PebbleHealthSampleProvider.java
index 6cacb54..392744e 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/pebble/PebbleHealthSampleProvider.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/pebble/PebbleHealthSampleProvider.java
@@ -48,7 +48,7 @@
 
         for (PebbleHealthActivityOverlay overlay : overlayRecords) {
             for (PebbleHealthActivitySample sample : samples) {
-                if (overlay.getTimestampFrom() >= sample.getTimestamp() && overlay.getTimestampTo() <= sample.getTimestamp()) {
+                if (overlay.getTimestampFrom() <= sample.getTimestamp() && sample.getTimestamp() <= overlay.getTimestampTo()) {
                     // patch in the raw kind
                     sample.setRawKind(overlay.getRawKind());
                 }
