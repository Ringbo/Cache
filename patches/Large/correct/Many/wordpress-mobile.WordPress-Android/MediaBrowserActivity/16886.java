diff --git a/src/org/wordpress/android/ui/media/MediaBrowserActivity.java b/src/org/wordpress/android/ui/media/MediaBrowserActivity.java
index 72bdc40..ba93c87 100644
--- a/src/org/wordpress/android/ui/media/MediaBrowserActivity.java
+++ b/src/org/wordpress/android/ui/media/MediaBrowserActivity.java
@@ -563,7 +563,7 @@
 
     @Override
     public void onDeleteMedia(final List<String> ids) {
-        final String blogId = String.valueOf(WordPress.getCurrentBlog().getRemoteBlogId());
+        final String blogId = String.valueOf(WordPress.getCurrentBlog().getLocalTableBlogId());
         List<String> sanitizedIds = new ArrayList<String>(ids.size());
         
         if (mMediaItemFragment != null && mMediaItemFragment.isVisible()) {
@@ -660,7 +660,7 @@
         if (WordPress.getCurrentBlog() == null || mediaId == null) {
             return;
         }
-        String blogId = String.valueOf(WordPress.getCurrentBlog().getRemoteBlogId());
+        String blogId = String.valueOf(WordPress.getCurrentBlog().getLocalTableBlogId());
         Cursor cursor = WordPress.wpDB.getMediaFile(blogId, mediaId);
 
         if (cursor == null || !cursor.moveToFirst()) {
