diff --git a/WordPress/src/main/java/org/wordpress/android/ui/posts/adapters/PostsListAdapter.java b/WordPress/src/main/java/org/wordpress/android/ui/posts/adapters/PostsListAdapter.java
index be0fda9..e2b400d 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/posts/adapters/PostsListAdapter.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/posts/adapters/PostsListAdapter.java
@@ -440,7 +440,7 @@
             String errorMessage = null;
 
             UploadError reason = mUploadStore.getUploadErrorForPost(post);
-            if (reason != null) {
+            if (reason != null && !UploadService.hasInProgressMediaUploadsForPost(post)) {
                 if (reason.mediaError != null) {
                     errorMessage = context.getString(post.isPage() ? R.string.error_media_recover_page
                             : R.string.error_media_recover_post);
@@ -518,7 +518,8 @@
 
     private void configurePostButtons(final PostViewHolder holder,
                                       final PostModel post) {
-        boolean canRetry = mUploadStore.getUploadErrorForPost(post) != null;
+        boolean canRetry = mUploadStore.getUploadErrorForPost(post) != null
+                && !UploadService.hasInProgressMediaUploadsForPost(post);
         boolean canShowViewButton = !canRetry;
         boolean canShowStatsButton = canShowStatsForPost(post);
         boolean canShowPublishButton = canRetry || canPublishPost(post);
