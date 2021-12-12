diff --git a/src/org/wordpress/android/ui/media/MediaEditFragment.java b/src/org/wordpress/android/ui/media/MediaEditFragment.java
index 3563bf9..56d0745 100644
--- a/src/org/wordpress/android/ui/media/MediaEditFragment.java
+++ b/src/org/wordpress/android/ui/media/MediaEditFragment.java
@@ -179,7 +179,7 @@
         Blog blog = WordPress.getCurrentBlog();
 
         if (blog != null && getActivity() != null) {
-            String blogId = String.valueOf(blog.getRemoteBlogId());
+            String blogId = String.valueOf(blog.getLocalTableBlogId());
 
             Cursor cursor = null;
 
@@ -216,7 +216,7 @@
 
                     @Override
                     public void onSuccess() {
-                        String blogId = String.valueOf(currentBlog.getRemoteBlogId());
+                        String blogId = String.valueOf(currentBlog.getLocalTableBlogId());
                         WordPress.wpDB.updateMediaFile(blogId, mediaId, title, description, caption);
 
                         if (getActivity() != null)
