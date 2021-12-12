diff --git a/WordPress/src/main/java/org/wordpress/android/ui/media/services/MediaUploadService.java b/WordPress/src/main/java/org/wordpress/android/ui/media/services/MediaUploadService.java
index c096357..4e438e4 100755
--- a/WordPress/src/main/java/org/wordpress/android/ui/media/services/MediaUploadService.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/media/services/MediaUploadService.java
@@ -351,13 +351,13 @@
         // updates in one go and save only once
         if (post != null) {
             MediaUploadReadyListener processor = new MediaUploadReadyProcessor();
-            List<MediaModel> mediaList = mCompletedUploads.get(new Long(post.getId()));
+            List<MediaModel> mediaList = mCompletedUploads.get(new Integer(post.getId()));
             if (mediaList != null && !mediaList.isEmpty()) {
                 for (MediaModel media : mediaList) {
                     post = updatePostWithMediaUrl(post, media, processor);
                 }
                 // finally remove all completed uploads for this post, as they've been taken care of
-                mCompletedUploads.remove(new Long(post.getId()));
+                mCompletedUploads.remove(new Integer(post.getId()));
             }
         }
         return post;
