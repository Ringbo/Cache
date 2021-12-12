diff --git a/library/smoothstreaming/src/main/java/com/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifestParser.java b/library/smoothstreaming/src/main/java/com/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifestParser.java
index 36eb666..cc09b5f 100644
--- a/library/smoothstreaming/src/main/java/com/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifestParser.java
+++ b/library/smoothstreaming/src/main/java/com/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifestParser.java
@@ -715,7 +715,7 @@
       } else if (fourCC.equalsIgnoreCase("AAC") || fourCC.equalsIgnoreCase("AACL")
           || fourCC.equalsIgnoreCase("AACH") || fourCC.equalsIgnoreCase("AACP")) {
         return MimeTypes.AUDIO_AAC;
-      } else if (fourCC.equalsIgnoreCase("TTML")) {
+      } else if (fourCC.equalsIgnoreCase("TTML") || fourCC.equalsIgnoreCase("DFXP")) {
         return MimeTypes.APPLICATION_TTML;
       } else if (fourCC.equalsIgnoreCase("ac-3") || fourCC.equalsIgnoreCase("dac3")) {
         return MimeTypes.AUDIO_AC3;
