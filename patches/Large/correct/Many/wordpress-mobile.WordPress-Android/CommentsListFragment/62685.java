diff --git a/WordPress/src/main/java/org/wordpress/android/ui/comments/CommentsListFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/comments/CommentsListFragment.java
index c60707a..ce31927 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/comments/CommentsListFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/comments/CommentsListFragment.java
@@ -646,7 +646,7 @@
         mFilteredCommentsView.hideLoadingProgress();
         mFilteredCommentsView.setRefreshing(false);
 
-        if (event.causeOfChange != CommentAction.PUSH_COMMENT) {
+        if (event.causeOfChange == CommentAction.PUSH_COMMENT) {
             for (int commentId : event.changedCommentsLocalIds) {
                 // See how we can use local ids instead
                 CommentModel comment = mCommentStore.getCommentByLocalId(commentId);
