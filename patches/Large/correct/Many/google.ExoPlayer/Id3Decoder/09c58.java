diff --git a/library/src/main/java/com/google/android/exoplayer2/metadata/id3/Id3Decoder.java b/library/src/main/java/com/google/android/exoplayer2/metadata/id3/Id3Decoder.java
index 723a29e..92c6efb 100644
--- a/library/src/main/java/com/google/android/exoplayer2/metadata/id3/Id3Decoder.java
+++ b/library/src/main/java/com/google/android/exoplayer2/metadata/id3/Id3Decoder.java
@@ -98,7 +98,7 @@
 
     // Otherwise look for a second zero byte.
     while (terminationPos < data.length - 1) {
-      if (data[terminationPos + 1] == (byte) 0) {
+      if (terminationPos % 2 == 0 && data[terminationPos + 1] == (byte) 0) {
         return terminationPos;
       }
       terminationPos = indexOfZeroByte(data, terminationPos + 1);
