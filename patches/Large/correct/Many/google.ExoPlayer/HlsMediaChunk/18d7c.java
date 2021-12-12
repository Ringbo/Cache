diff --git a/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsMediaChunk.java b/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsMediaChunk.java
index 0c41185..7ef6b7a 100644
--- a/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsMediaChunk.java
+++ b/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsMediaChunk.java
@@ -187,7 +187,7 @@
   public void load() throws IOException, InterruptedException {
     if (extractor == null && !isPackedAudio) {
       // See HLS spec, version 20, Section 3.4 for more information on packed audio extraction.
-      extractor = buildExtractorByExtension();
+      extractor = createExtractor();
     }
     maybeLoadInitData();
     if (!loadCanceled) {
@@ -329,11 +329,12 @@
     return new Aes128DataSource(dataSource, encryptionKey, encryptionIv);
   }
 
-  private Extractor buildExtractorByExtension() {
-    // Set the extractor that will read the chunk.
+  private Extractor createExtractor() {
+    // Select the extractor that will read the chunk.
     Extractor extractor;
     boolean usingNewExtractor = true;
-    if (lastPathSegment.endsWith(WEBVTT_FILE_EXTENSION)
+    if (MimeTypes.TEXT_VTT.equals(hlsUrl.format.sampleMimeType)
+        || lastPathSegment.endsWith(WEBVTT_FILE_EXTENSION)
         || lastPathSegment.endsWith(VTT_FILE_EXTENSION)) {
       extractor = new WebvttExtractor(trackFormat.language, timestampAdjuster);
     } else if (!needNewExtractor) {
