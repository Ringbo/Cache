diff --git a/library/src/main/java/com/google/android/exoplayer/extractor/ts/H265Reader.java b/library/src/main/java/com/google/android/exoplayer/extractor/ts/H265Reader.java
index 77642b6..636fd11 100644
--- a/library/src/main/java/com/google/android/exoplayer/extractor/ts/H265Reader.java
+++ b/library/src/main/java/com/google/android/exoplayer/extractor/ts/H265Reader.java
@@ -271,7 +271,7 @@
     bitArray.skipBits(2); // amp_enabled_flag (1), sample_adaptive_offset_enabled_flag (1)
     if (bitArray.readBit()) { // pcm_enabled_flag
       // pcm_sample_bit_depth_luma_minus1 (4), pcm_sample_bit_depth_chroma_minus1 (4)
-      bitArray.skipBits(4);
+      bitArray.skipBits(8);
       bitArray.readUnsignedExpGolombCodedInt(); // log2_min_pcm_luma_coding_block_size_minus3
       bitArray.readUnsignedExpGolombCodedInt(); // log2_diff_max_min_pcm_luma_coding_block_size
       bitArray.skipBits(1); // pcm_loop_filter_disabled_flag
