diff --git a/library/core/src/main/java/com/google/android/exoplayer2/extractor/flv/VideoTagPayloadReader.java b/library/core/src/main/java/com/google/android/exoplayer2/extractor/flv/VideoTagPayloadReader.java
index 3ff7dd6..8a4d314 100644
--- a/library/core/src/main/java/com/google/android/exoplayer2/extractor/flv/VideoTagPayloadReader.java
+++ b/library/core/src/main/java/com/google/android/exoplayer2/extractor/flv/VideoTagPayloadReader.java
@@ -93,7 +93,7 @@
           avcConfig.initializationData, Format.NO_VALUE, avcConfig.pixelWidthAspectRatio, null);
       output.format(format);
       hasOutputFormat = true;
-    } else if (packetType == AVC_PACKET_TYPE_AVC_NALU) {
+    } else if (packetType == AVC_PACKET_TYPE_AVC_NALU && hasOutputFormat) {
       // TODO: Deduplicate with Mp4Extractor.
       // Zero the top three bytes of the array that we'll use to decode nal unit lengths, in case
       // they're only 1 or 2 bytes long.
