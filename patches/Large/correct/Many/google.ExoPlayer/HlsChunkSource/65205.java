diff --git a/library/src/main/java/com/google/android/exoplayer/hls/HlsChunkSource.java b/library/src/main/java/com/google/android/exoplayer/hls/HlsChunkSource.java
index 0ca9ab4..3c2c271 100644
--- a/library/src/main/java/com/google/android/exoplayer/hls/HlsChunkSource.java
+++ b/library/src/main/java/com/google/android/exoplayer/hls/HlsChunkSource.java
@@ -184,7 +184,7 @@
         variantIndex = i;
       }
       maxWidth = Math.max(enabledVariants[i].width, maxWidth);
-      maxHeight = Math.max(enabledVariants[i].width, maxHeight);
+      maxHeight = Math.max(enabledVariants[i].height, maxHeight);
     }
     // TODO: We should allow the default values to be passed through the constructor.
     this.maxWidth = maxWidth > 0 ? maxWidth : 1920;
