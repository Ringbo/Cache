diff --git a/src/org/wordpress/android/ui/media/MediaAddFragment.java b/src/org/wordpress/android/ui/media/MediaAddFragment.java
index d2995fa..a2f5717 100644
--- a/src/org/wordpress/android/ui/media/MediaAddFragment.java
+++ b/src/org/wordpress/android/ui/media/MediaAddFragment.java
@@ -195,7 +195,7 @@
         String fileType = new String(path).replaceAll(".*\\.(\\w+)$", "$1").toLowerCase();
         
         MediaFile mediaFile = new MediaFile();
-        mediaFile.setBlogId(String.valueOf(blog.getRemoteBlogId()));
+        mediaFile.setBlogId(String.valueOf(blog.getLocalTableBlogId()));
         mediaFile.setFileName(fileName + "." + fileType);
         mediaFile.setFilePath(path);
         mediaFile.setUploadState("queued");
@@ -246,7 +246,7 @@
     }
     
     public void addToQueue(String mediaId) {
-        String blogId = String.valueOf(WordPress.getCurrentBlog().getRemoteBlogId());
+        String blogId = String.valueOf(WordPress.getCurrentBlog().getLocalTableBlogId());
         WordPress.wpDB.updateMediaUploadState(blogId, mediaId, "queued");
         startMediaUploadService();
     }
