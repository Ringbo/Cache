diff --git a/media/java/android/media/AudioService.java b/media/java/android/media/AudioService.java
index f8688da..5b6ca29 100644
--- a/media/java/android/media/AudioService.java
+++ b/media/java/android/media/AudioService.java
@@ -4740,7 +4740,8 @@
         } else if (device == AudioSystem.DEVICE_OUT_DGTL_DOCK_HEADSET) {
             connType = AudioRoutesInfo.MAIN_DOCK_SPEAKERS;
             intent.setAction(AudioManager.ACTION_DIGITAL_AUDIO_DOCK_PLUG);
-        } else if (device == AudioSystem.DEVICE_OUT_HDMI) {
+        } else if (device == AudioSystem.DEVICE_OUT_HDMI ||
+                device == AudioSystem.DEVICE_OUT_HDMI_ARC) {
             connType = AudioRoutesInfo.MAIN_HDMI;
             configureHdmiPlugIntent(intent, state);
         }
@@ -4835,7 +4836,8 @@
                 for (AudioPort port : ports) {
                     if (port instanceof AudioDevicePort) {
                         final AudioDevicePort devicePort = (AudioDevicePort) port;
-                        if (devicePort.type() == AudioManager.DEVICE_OUT_HDMI) {
+                        if (devicePort.type() == AudioManager.DEVICE_OUT_HDMI ||
+                                devicePort.type() == AudioManager.DEVICE_OUT_HDMI_ARC) {
                             // format the list of supported encodings
                             int[] formats = devicePort.formats();
                             if (formats.length > 0) {
