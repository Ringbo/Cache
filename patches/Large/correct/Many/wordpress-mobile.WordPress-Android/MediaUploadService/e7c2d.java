diff --git a/src/org/wordpress/android/util/MediaUploadService.java b/src/org/wordpress/android/util/MediaUploadService.java
index 2e4f9b8..73c2dd8 100644
--- a/src/org/wordpress/android/util/MediaUploadService.java
+++ b/src/org/wordpress/android/util/MediaUploadService.java
@@ -84,7 +84,7 @@
         // Since we won't be able to receive notifications for these, set them to 'failed'.
         
         if(WordPress.getCurrentBlog() != null){
-            String blogId = String.valueOf(WordPress.getCurrentBlog().getRemoteBlogId());
+            String blogId = String.valueOf(WordPress.getCurrentBlog().getLocalTableBlogId());
             WordPress.wpDB.setMediaUploadingToFailed(blogId);
     
             sendUpdateBroadcast(null);
@@ -95,7 +95,7 @@
         if (WordPress.getCurrentBlog() == null)
             return null;
         
-        String blogId = String.valueOf(WordPress.getCurrentBlog().getRemoteBlogId());
+        String blogId = String.valueOf(WordPress.getCurrentBlog().getLocalTableBlogId());
         return WordPress.wpDB.getMediaUploadQueue(blogId);
     }
     
