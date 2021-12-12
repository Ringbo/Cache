diff --git a/WordPress/src/main/java/org/wordpress/android/ui/reader/adapters/ReaderPostAdapter.java b/WordPress/src/main/java/org/wordpress/android/ui/reader/adapters/ReaderPostAdapter.java
index f166a76..b3c3227 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/reader/adapters/ReaderPostAdapter.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/reader/adapters/ReaderPostAdapter.java
@@ -756,7 +756,7 @@
         return (mPosts == null || mPosts.size() == 0);
     }
 
-    public boolean isSavedPostsList() {
+    private boolean isBookmarksList() {
         return (getPostListType() == ReaderPostListType.TAG_FOLLOWED
                 && (mCurrentTag != null && mCurrentTag.isBookmarked()));
     }
@@ -777,7 +777,7 @@
 
     private void showLikes(final ReaderPostViewHolder holder, final ReaderPost post) {
         boolean canShowLikes;
-        if (post.isDiscoverPost() || isSavedPostsList()) {
+        if (post.isDiscoverPost() || isBookmarksList()) {
             canShowLikes = false;
         } else if (mIsLoggedOutReader) {
             canShowLikes = post.numLikes > 0;
@@ -837,7 +837,7 @@
 
     private void showComments(final ReaderPostViewHolder holder, final ReaderPost post) {
         boolean canShowComments;
-        if (post.isDiscoverPost() || isSavedPostsList()) {
+        if (post.isDiscoverPost() || isBookmarksList()) {
             canShowComments = false;
         } else if (mIsLoggedOutReader) {
             canShowComments = post.numReplies > 0;
@@ -903,12 +903,12 @@
 
         AnalyticsTracker.Stat eventToTrack;
         if (post.isBookmarked) {
-            eventToTrack = isSavedPostsList() ? AnalyticsTracker.Stat.READER_POST_UNSAVED_FROM_SAVED_POST_LIST :
-                    AnalyticsTracker.Stat.READER_POST_UNSAVED_FROM_OTHER_POST_LIST;
+            eventToTrack = isBookmarksList() ? AnalyticsTracker.Stat.READER_POST_UNSAVED_FROM_SAVED_POST_LIST
+                    : AnalyticsTracker.Stat.READER_POST_UNSAVED_FROM_OTHER_POST_LIST;
             ReaderPostActions.removeFromBookmarked(post);
         } else {
-            eventToTrack = isSavedPostsList() ? AnalyticsTracker.Stat.READER_POST_SAVED_FROM_SAVED_POST_LIST :
-                    AnalyticsTracker.Stat.READER_POST_SAVED_FROM_OTHER_POST_LIST;
+            eventToTrack = isBookmarksList() ? AnalyticsTracker.Stat.READER_POST_SAVED_FROM_SAVED_POST_LIST
+                    : AnalyticsTracker.Stat.READER_POST_SAVED_FROM_OTHER_POST_LIST;
             ReaderPostActions.addToBookmarked(post);
         }
 
@@ -923,7 +923,7 @@
 
             if (mOnPostBookmarkedListener != null) {
                 mOnPostBookmarkedListener
-                        .onBookmarkedStateChanged(post.isBookmarked, blogId, postId, !isSavedPostsList());
+                        .onBookmarkedStateChanged(post.isBookmarked, blogId, postId, !isBookmarksList());
             }
         }
     }
