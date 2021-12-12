diff --git a/src/net/java/sip/communicator/impl/neomedia/device/DeviceConfiguration.java b/src/net/java/sip/communicator/impl/neomedia/device/DeviceConfiguration.java
index 021f4f6..d824d37 100644
--- a/src/net/java/sip/communicator/impl/neomedia/device/DeviceConfiguration.java
+++ b/src/net/java/sip/communicator/impl/neomedia/device/DeviceConfiguration.java
@@ -225,7 +225,7 @@
 
             if(audioDevName == null)
             {
-                // the default behaviour if nothing set is to use javasound
+                // the default behaviour if nothing set is to use portaudio
                 // this will also choose the capture device
                 if(PortAudioAuto.isSupported())
                 {
@@ -255,11 +255,11 @@
                 {
                     logger.warn("Computer sound config changed or " +
                         "there is a problem since last config was saved, " +
-                        "will back to javasound");
+                        "will back to default");
                     setAudioPlaybackDevice(null, false);
                     setAudioNotifyDevice(null, false);
                     setAudioCaptureDevice(null, false);
-                    setAudioSystem(AUDIO_SYSTEM_JAVASOUND, null, false);
+                    setAudioSystem(AUDIO_SYSTEM_PORTAUDIO, null, false);
                 }
             }
             if (audioCaptureDevice != null)
