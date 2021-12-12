diff --git a/library/src/main/java/com/google/android/exoplayer2/util/MimeTypes.java b/library/src/main/java/com/google/android/exoplayer2/util/MimeTypes.java
index 4776e4d..e289a5b 100644
--- a/library/src/main/java/com/google/android/exoplayer2/util/MimeTypes.java
+++ b/library/src/main/java/com/google/android/exoplayer2/util/MimeTypes.java
@@ -211,10 +211,10 @@
     } else if (isVideo(mimeType)) {
       return C.TRACK_TYPE_VIDEO;
     } else if (isText(mimeType) || APPLICATION_CEA608.equals(mimeType)
-        || APPLICATION_SUBRIP.equals(mimeType) || APPLICATION_TTML.equals(mimeType)
-        || APPLICATION_TX3G.equals(mimeType) || APPLICATION_MP4VTT.equals(mimeType)
-        || APPLICATION_RAWCC.equals(mimeType) || APPLICATION_VOBSUB.equals(mimeType)
-        || APPLICATION_PGS.equals(mimeType)) {
+        || APPLICATION_CEA708.equals(mimeType) || APPLICATION_SUBRIP.equals(mimeType)
+        || APPLICATION_TTML.equals(mimeType) || APPLICATION_TX3G.equals(mimeType)
+        || APPLICATION_MP4VTT.equals(mimeType) || APPLICATION_RAWCC.equals(mimeType)
+        || APPLICATION_VOBSUB.equals(mimeType) || APPLICATION_PGS.equals(mimeType)) {
       return C.TRACK_TYPE_TEXT;
     } else if (APPLICATION_ID3.equals(mimeType)) {
       return C.TRACK_TYPE_METADATA;
