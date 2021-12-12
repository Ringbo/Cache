diff --git a/src/org/wordpress/android/ui/posts/PostsActivity.java b/src/org/wordpress/android/ui/posts/PostsActivity.java
index ce5d773..b7f1757 100644
--- a/src/org/wordpress/android/ui/posts/PostsActivity.java
+++ b/src/org/wordpress/android/ui/posts/PostsActivity.java
@@ -278,7 +278,7 @@
         int itemId = item.getItemId();
         if (itemId == R.id.menu_refresh) {
             postList.refreshPosts(false);
-            new ApiHelper.RefreshBlogContentTask(this, WordPress.currentBlog).execute(true);
+            new ApiHelper.RefreshBlogContentTask(this, WordPress.currentBlog).execute(false);
             return true;
         } else if (itemId == R.id.menu_new_post) {
             Intent i = new Intent(this, EditPostActivity.class);
