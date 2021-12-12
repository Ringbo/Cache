diff --git a/WordPress/src/main/java/org/wordpress/android/ui/uploads/UploadService.java b/WordPress/src/main/java/org/wordpress/android/ui/uploads/UploadService.java
index 3548e94..1a66c68 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/uploads/UploadService.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/uploads/UploadService.java
@@ -602,7 +602,9 @@
             for (MediaModel media: mMediaBatchUploaded) {
                 // we need to obtain the latest copy from the Store, as it's got the remote mediaId field
                 MediaModel currentMedia = mMediaStore.getMediaWithLocalId(media.getId());
-                if (currentMedia.getLocalPostId() == 0) {
+                if (currentMedia.getLocalPostId() == 0
+                        && MediaUploadState.fromString(currentMedia.getUploadState())
+                        == MediaUploadState.UPLOADED) {
                     standAloneMediaItems.add(currentMedia);
                 }
             }
