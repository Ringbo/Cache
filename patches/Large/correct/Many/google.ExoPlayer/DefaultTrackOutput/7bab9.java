diff --git a/library/src/main/java/com/google/android/exoplayer/extractor/DefaultTrackOutput.java b/library/src/main/java/com/google/android/exoplayer/extractor/DefaultTrackOutput.java
index 9c52451..0072f45 100644
--- a/library/src/main/java/com/google/android/exoplayer/extractor/DefaultTrackOutput.java
+++ b/library/src/main/java/com/google/android/exoplayer/extractor/DefaultTrackOutput.java
@@ -239,7 +239,7 @@
         return TrackStream.FORMAT_READ;
       case TrackStream.BUFFER_READ:
         if (buffer.timeUs < decodeOnlyUntilUs) {
-          buffer.setFlags(C.BUFFER_FLAG_DECODE_ONLY);
+          buffer.addFlag(C.BUFFER_FLAG_DECODE_ONLY);
         }
         // Read encryption data if the sample is encrypted.
         if (buffer.isEncrypted()) {
