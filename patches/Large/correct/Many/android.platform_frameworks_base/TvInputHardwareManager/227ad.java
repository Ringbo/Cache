diff --git a/services/core/java/com/android/server/tv/TvInputHardwareManager.java b/services/core/java/com/android/server/tv/TvInputHardwareManager.java
index 77ab33b..48ac228 100644
--- a/services/core/java/com/android/server/tv/TvInputHardwareManager.java
+++ b/services/core/java/com/android/server/tv/TvInputHardwareManager.java
@@ -743,7 +743,7 @@
                             && sinkConfig.channelMask() != mDesiredChannelMask)
                     || (mDesiredFormat != AudioFormat.ENCODING_DEFAULT
                             && sinkConfig.format() != mDesiredFormat)) {
-                sinkConfig = mAudioSource.buildConfig(mDesiredSamplingRate, mDesiredChannelMask,
+                sinkConfig = mAudioSink.buildConfig(mDesiredSamplingRate, mDesiredChannelMask,
                         mDesiredFormat, null);
                 shouldRecreateAudioPatch = true;
             }
