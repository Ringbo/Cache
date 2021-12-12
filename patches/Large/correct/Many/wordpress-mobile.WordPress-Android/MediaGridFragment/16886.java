diff --git a/src/org/wordpress/android/ui/media/MediaGridFragment.java b/src/org/wordpress/android/ui/media/MediaGridFragment.java
index 73dcfca..d966e0a 100644
--- a/src/org/wordpress/android/ui/media/MediaGridFragment.java
+++ b/src/org/wordpress/android/ui/media/MediaGridFragment.java
@@ -258,7 +258,7 @@
         if (WordPress.currentBlog == null)
             return;
 
-        String blogId = String.valueOf(WordPress.getCurrentBlog().getRemoteBlogId());
+        String blogId = String.valueOf(WordPress.getCurrentBlog().getLocalTableBlogId());
 
         int countAll = WordPress.wpDB.getMediaCountAll(blogId);
         int countImages = WordPress.wpDB.getMediaCountImages(blogId);
@@ -405,7 +405,7 @@
         mSearchTerm = searchTerm;
         Blog blog = WordPress.getCurrentBlog();
         if (blog != null) {
-            String blogId = String.valueOf(blog.getRemoteBlogId());
+            String blogId = String.valueOf(blog.getLocalTableBlogId());
             Cursor cursor = WordPress.wpDB.getMediaFilesForBlog(blogId, searchTerm);
             mGridAdapter.changeCursor(cursor);
         }
@@ -466,7 +466,7 @@
         if (blog == null)
             return null;
 
-        String blogId = String.valueOf(blog.getRemoteBlogId());
+        String blogId = String.valueOf(blog.getLocalTableBlogId());
 
         GregorianCalendar startDate = new GregorianCalendar(mStartYear, mStartMonth, mStartDay);
         GregorianCalendar endDate = new GregorianCalendar(mEndYear, mEndMonth, mEndDay);
@@ -498,7 +498,7 @@
         if (blog == null)
             return null;
 
-        String blogId = String.valueOf(blog.getRemoteBlogId());
+        String blogId = String.valueOf(blog.getLocalTableBlogId());
 
         switch (filter) {
             case ALL:
