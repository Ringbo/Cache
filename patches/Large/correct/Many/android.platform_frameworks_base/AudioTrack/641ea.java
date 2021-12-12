diff --git a/media/java/android/media/AudioTrack.java b/media/java/android/media/AudioTrack.java
index bdf6d9f..e0fa592f 100644
--- a/media/java/android/media/AudioTrack.java
+++ b/media/java/android/media/AudioTrack.java
@@ -885,10 +885,10 @@
     // postcondition:
     //    mNativeBufferSizeInBytes is valid (multiple of frame size, positive)
     private void audioBuffSizeCheck(int audioBufferSize) {
-        // NB: this section is only valid with PCM data.
+        // NB: this section is only valid with PCM or IEC61937 data.
         //     To update when supporting compressed formats
         int frameSizeInBytes;
-        if (AudioFormat.isEncodingLinearPcm(mAudioFormat)) {
+        if (AudioFormat.isEncodingLinearFrames(mAudioFormat)) {
             frameSizeInBytes = mChannelCount * AudioFormat.getBytesPerSample(mAudioFormat);
         } else {
             frameSizeInBytes = 1;
