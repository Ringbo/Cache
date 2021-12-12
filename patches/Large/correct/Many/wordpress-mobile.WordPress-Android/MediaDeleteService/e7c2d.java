diff --git a/src/org/wordpress/android/util/MediaDeleteService.java b/src/org/wordpress/android/util/MediaDeleteService.java
index 9117ed7..c31c7b4 100644
--- a/src/org/wordpress/android/util/MediaDeleteService.java
+++ b/src/org/wordpress/android/util/MediaDeleteService.java
@@ -74,7 +74,7 @@
         if (WordPress.getCurrentBlog() == null)
             return null;
         
-        String blogId = String.valueOf(WordPress.getCurrentBlog().getRemoteBlogId());
+        String blogId = String.valueOf(WordPress.getCurrentBlog().getLocalTableBlogId());
         return WordPress.wpDB.getMediaDeleteQueueItem(blogId);
     }
     
