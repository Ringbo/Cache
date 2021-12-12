diff --git a/library/src/main/java/com/google/android/exoplayer/extractor/ogg/FlacReader.java b/library/src/main/java/com/google/android/exoplayer/extractor/ogg/FlacReader.java
index 1b539e5..f7b1904 100644
--- a/library/src/main/java/com/google/android/exoplayer/extractor/ogg/FlacReader.java
+++ b/library/src/main/java/com/google/android/exoplayer/extractor/ogg/FlacReader.java
@@ -67,7 +67,7 @@
       metadata[4] = (byte) 0x80; // Set the last metadata block flag, ignore the other blocks
       List<byte[]> initializationData = Collections.singletonList(metadata);
       trackOutput.format(Format.createAudioSampleFormat(null, MimeTypes.AUDIO_FLAC,
-          Format.NO_VALUE, streamInfo.bitRate(), streamInfo.channels, streamInfo.sampleRate,
+          streamInfo.bitRate(), Format.NO_VALUE, streamInfo.channels, streamInfo.sampleRate,
           initializationData, null));
     } else if (data[0] == AUDIO_PACKET_TYPE) {
       if (!firstAudioPacketProcessed) {
