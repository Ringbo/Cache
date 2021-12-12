diff --git a/extensions/flac/src/main/java/com/google/android/exoplayer/ext/flac/FlacExtractor.java b/extensions/flac/src/main/java/com/google/android/exoplayer/ext/flac/FlacExtractor.java
index 3f7a3be..1982036 100644
--- a/extensions/flac/src/main/java/com/google/android/exoplayer/ext/flac/FlacExtractor.java
+++ b/extensions/flac/src/main/java/com/google/android/exoplayer/ext/flac/FlacExtractor.java
@@ -105,7 +105,7 @@
       });
 
       Format mediaFormat = Format.createAudioSampleFormat(null, MimeTypes.AUDIO_RAW,
-          Format.NO_VALUE, streamInfo.bitRate(),
+          streamInfo.bitRate(), Format.NO_VALUE,
           streamInfo.channels, streamInfo.sampleRate, null, null);
       trackOutput.format(mediaFormat);
 
