diff --git a/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderPostListFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderPostListFragment.java
index 0069862..ea038c3 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderPostListFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderPostListFragment.java
@@ -442,7 +442,7 @@
         switch (getPostListType()) {
             case BLOG_PREVIEW:
                 loadBlogOrFeedInfo();
-                animateHeader();
+                animateHeaderDelayed();
                 break;
             case TAG_PREVIEW:
                 updateTagPreviewHeader();
