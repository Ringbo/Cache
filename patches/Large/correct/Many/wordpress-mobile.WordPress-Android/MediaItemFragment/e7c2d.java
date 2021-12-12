diff --git a/src/org/wordpress/android/ui/media/MediaItemFragment.java b/src/org/wordpress/android/ui/media/MediaItemFragment.java
index dfd8d2c..ef3e9c1 100644
--- a/src/org/wordpress/android/ui/media/MediaItemFragment.java
+++ b/src/org/wordpress/android/ui/media/MediaItemFragment.java
@@ -138,7 +138,7 @@
         Blog blog = WordPress.getCurrentBlog();
         
         if (blog != null) {
-            String blogId = String.valueOf(blog.getRemoteBlogId());
+            String blogId = String.valueOf(blog.getLocalTableBlogId());
             
             Cursor cursor;
             
@@ -317,7 +317,7 @@
         int itemId = item.getItemId();
         
         if (itemId == R.id.menu_delete) {
-            String blogId = String.valueOf(WordPress.getCurrentBlog().getRemoteBlogId());
+            String blogId = String.valueOf(WordPress.getCurrentBlog().getLocalTableBlogId());
             boolean canDeleteMedia = MediaUtils.canDeleteMedia(blogId, getMediaId());
             if (!canDeleteMedia) {
                 Toast.makeText(getActivity(), R.string.wait_until_upload_completes, Toast.LENGTH_LONG).show();
