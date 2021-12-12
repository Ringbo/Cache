diff --git a/src/org/wordpress/android/ui/comments/CommentsListFragment.java b/src/org/wordpress/android/ui/comments/CommentsListFragment.java
index 8c33bb1..d0885b9 100644
--- a/src/org/wordpress/android/ui/comments/CommentsListFragment.java
+++ b/src/org/wordpress/android/ui/comments/CommentsListFragment.java
@@ -954,7 +954,7 @@
 
             if (commentsResult == null) {
 
-                if (model.size() == 1) {
+                if (model != null && model.size() == 1) {
                     WordPress.wpDB.clearComments(WordPress.currentBlog
                             .getId());
                     model.clear();
