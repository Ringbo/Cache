diff --git a/WordPress/src/main/java/org/wordpress/android/ui/posts/PostsListFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/posts/PostsListFragment.java
index 903be30..3d61691 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/posts/PostsListFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/posts/PostsListFragment.java
@@ -495,7 +495,7 @@
                 ActivityLauncher.browsePostOrPage(getActivity(), mSite, post);
                 break;
             case PostListButton.BUTTON_PREVIEW:
-                ActivityLauncher.viewPostPreviewForResult(getActivity(), mSite, post, mIsPage);
+                ActivityLauncher.viewPostPreviewForResult(getActivity(), mSite, post);
                 break;
             case PostListButton.BUTTON_STATS:
                 ActivityLauncher.viewStatsSinglePostDetails(getActivity(), mSite, post, mIsPage);
