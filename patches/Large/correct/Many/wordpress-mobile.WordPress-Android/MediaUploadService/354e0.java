diff --git a/WordPress/src/main/java/org/wordpress/android/ui/media/services/MediaUploadService.java b/WordPress/src/main/java/org/wordpress/android/ui/media/services/MediaUploadService.java
index fb26003..5fddd2e 100755
--- a/WordPress/src/main/java/org/wordpress/android/ui/media/services/MediaUploadService.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/media/services/MediaUploadService.java
@@ -148,7 +148,7 @@
                 if (content != null) {
 
                     // actually replace the media ID with the media uri
-                    MediaUploadReadyProcessor processor = new MediaUploadReadyProcessor();
+                    MediaUploadReadyListener processor = new MediaUploadReadyProcessor();
                     PostModel modifiedPost = processor.replaceMediaFileWithUrlInPost(post, String.valueOf(media.getId()), FluxCUtils.mediaFileFromMediaModel(media));
                     if (modifiedPost != null) {
                         post = modifiedPost;
