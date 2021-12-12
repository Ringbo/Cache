diff --git a/media/java/android/media/MediaScanner.java b/media/java/android/media/MediaScanner.java
index 6f8b809..fd37bcf 100644
--- a/media/java/android/media/MediaScanner.java
+++ b/media/java/android/media/MediaScanner.java
@@ -1399,7 +1399,8 @@
         long lastModifiedSeconds = file.lastModified() / 1000;
 
         if (!MediaFile.isAudioFileType(fileType) && !MediaFile.isVideoFileType(fileType) &&
-            !MediaFile.isImageFileType(fileType) && !MediaFile.isPlayListFileType(fileType)) {
+            !MediaFile.isImageFileType(fileType) && !MediaFile.isPlayListFileType(fileType) &&
+            !MediaFile.isDrmFileType(fileType)) {
 
             // no need to use the media scanner, but we need to update last modified and file size
             ContentValues values = new ContentValues();
