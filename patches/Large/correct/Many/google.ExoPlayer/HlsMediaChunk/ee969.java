diff --git a/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsMediaChunk.java b/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsMediaChunk.java
index 5c316a5..1af0881 100644
--- a/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsMediaChunk.java
+++ b/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsMediaChunk.java
@@ -95,7 +95,7 @@
     this.extractorNeedsInit = extractorNeedsInit;
     this.shouldSpliceIn = shouldSpliceIn;
     // Note: this.dataSource and dataSource may be different.
-    adjustedEndTimeUs = startTimeUs;
+    adjustedEndTimeUs = endTimeUs;
     this.isEncrypted = this.dataSource instanceof Aes128DataSource;
     uid = UID_SOURCE.getAndIncrement();
   }
