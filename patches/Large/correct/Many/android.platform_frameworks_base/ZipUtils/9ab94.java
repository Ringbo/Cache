diff --git a/core/java/android/util/apk/ZipUtils.java b/core/java/android/util/apk/ZipUtils.java
index cdbac18..fa5477e 100644
--- a/core/java/android/util/apk/ZipUtils.java
+++ b/core/java/android/util/apk/ZipUtils.java
@@ -160,7 +160,7 @@
         }
         int maxCommentLength = Math.min(archiveSize - ZIP_EOCD_REC_MIN_SIZE, UINT16_MAX_VALUE);
         int eocdWithEmptyCommentStartPosition = archiveSize - ZIP_EOCD_REC_MIN_SIZE;
-        for (int expectedCommentLength = 0; expectedCommentLength < maxCommentLength;
+        for (int expectedCommentLength = 0; expectedCommentLength <= maxCommentLength;
                 expectedCommentLength++) {
             int eocdStartPos = eocdWithEmptyCommentStartPosition - expectedCommentLength;
             if (zipContents.getInt(eocdStartPos) == ZIP_EOCD_REC_SIG) {
