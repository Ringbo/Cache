diff --git a/src/org/wordpress/android/ui/media/MediaGalleryPickerActivity.java b/src/org/wordpress/android/ui/media/MediaGalleryPickerActivity.java
index d1153cd..9956dad 100644
--- a/src/org/wordpress/android/ui/media/MediaGalleryPickerActivity.java
+++ b/src/org/wordpress/android/ui/media/MediaGalleryPickerActivity.java
@@ -107,7 +107,7 @@
     private void refereshViews() {
         if (WordPress.getCurrentBlog() == null)
             return;
-        final String blogId = String.valueOf(WordPress.getCurrentBlog().getRemoteBlogId());
+        final String blogId = String.valueOf(WordPress.getCurrentBlog().getLocalTableBlogId());
         Cursor cursor = WordPress.wpDB.getMediaImagesForBlog(blogId, mFilteredItems);
         if (cursor.getCount() == 0) {
             refreshMediaFromServer(0);
@@ -214,7 +214,7 @@
                     MediaGridAdapter adapter = (MediaGridAdapter) mGridView.getAdapter();
                     mHasRetrievedAllMedia = (count == 0);
                     adapter.setHasRetrieviedAll(mHasRetrievedAllMedia);
-                    String blogId = String.valueOf(WordPress.getCurrentBlog().getRemoteBlogId());
+                    String blogId = String.valueOf(WordPress.getCurrentBlog().getLocalTableBlogId());
                     if (WordPress.wpDB.getMediaCountAll(blogId) == 0 && count == 0) {
                         // There is no media at all
                         noMediaFinish();
@@ -229,7 +229,7 @@
                             public void run() {
                                 //mListener.onMediaItemListDownloaded();
                                 mGridAdapter.setRefreshing(false);
-                                String blogId = String.valueOf(WordPress.getCurrentBlog().getRemoteBlogId());
+                                String blogId = String.valueOf(WordPress.getCurrentBlog().getLocalTableBlogId());
                                 Cursor cursor = WordPress.wpDB.getMediaImagesForBlog(blogId, mFilteredItems);
                                 mGridAdapter.swapCursor(cursor);
 
