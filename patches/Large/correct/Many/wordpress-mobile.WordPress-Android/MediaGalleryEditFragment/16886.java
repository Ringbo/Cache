diff --git a/src/org/wordpress/android/ui/media/MediaGalleryEditFragment.java b/src/org/wordpress/android/ui/media/MediaGalleryEditFragment.java
index d55cdb8..e3cb607 100644
--- a/src/org/wordpress/android/ui/media/MediaGalleryEditFragment.java
+++ b/src/org/wordpress/android/ui/media/MediaGalleryEditFragment.java
@@ -68,7 +68,7 @@
         if (WordPress.getCurrentBlog() == null)
             return;
         
-        String blogId = String.valueOf(WordPress.getCurrentBlog().getRemoteBlogId());
+        String blogId = String.valueOf(WordPress.getCurrentBlog().getLocalTableBlogId());
         
         Cursor cursor = WordPress.wpDB.getMediaFiles(blogId, mIds);
         
