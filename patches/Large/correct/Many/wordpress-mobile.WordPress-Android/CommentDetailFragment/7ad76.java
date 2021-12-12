diff --git a/WordPress/src/main/java/org/wordpress/android/ui/comments/CommentDetailFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/comments/CommentDetailFragment.java
index a7aec39..f7bd62f 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/comments/CommentDetailFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/comments/CommentDetailFragment.java
@@ -539,7 +539,7 @@
         if (mComment == null) {
             return;
         }
-        CommentModel updatedComment = mCommentStore.getCommentByLocalId(mComment.getLocalSiteId());
+        CommentModel updatedComment = mCommentStore.getCommentByLocalId(mComment.getId());
         if (updatedComment != null) {
             setComment(updatedComment, mSite);
         }
