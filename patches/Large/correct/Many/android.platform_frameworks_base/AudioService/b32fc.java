diff --git a/services/core/java/com/android/server/audio/AudioService.java b/services/core/java/com/android/server/audio/AudioService.java
index 5d386bd..61a7263 100644
--- a/services/core/java/com/android/server/audio/AudioService.java
+++ b/services/core/java/com/android/server/audio/AudioService.java
@@ -3620,7 +3620,9 @@
             pw.print("   Devices: ");
             final int devices = AudioSystem.getDevicesForStream(mStreamType);
             int device, i = 0, n = 0;
-            while ((device = 1 << i) <= AudioSystem.DEVICE_OUT_DEFAULT) {
+            // iterate all devices from 1 to DEVICE_OUT_DEFAULT exclusive
+            // (the default device is not returned by getDevicesForStream)
+            while ((device = 1 << i) != AudioSystem.DEVICE_OUT_DEFAULT) {
                 if ((devices & device) != 0) {
                     if (n++ > 0) {
                         pw.print(", ");
