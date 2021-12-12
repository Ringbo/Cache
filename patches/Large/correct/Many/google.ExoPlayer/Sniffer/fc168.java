diff --git a/library/core/src/main/java/com/google/android/exoplayer2/extractor/mp4/Sniffer.java b/library/core/src/main/java/com/google/android/exoplayer2/extractor/mp4/Sniffer.java
index 021c9de..dce00fa 100644
--- a/library/core/src/main/java/com/google/android/exoplayer2/extractor/mp4/Sniffer.java
+++ b/library/core/src/main/java/com/google/android/exoplayer2/extractor/mp4/Sniffer.java
@@ -114,7 +114,7 @@
         // The atom extends to the end of the file.
         long endPosition = input.getLength();
         if (endPosition != C.LENGTH_UNSET) {
-          atomSize = endPosition - input.getPosition() + headerSize;
+          atomSize = endPosition - input.getPeekPosition() + headerSize;
         }
       }
 
