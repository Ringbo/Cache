diff --git a/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderPostListFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderPostListFragment.java
index 003b445..b1a7bd4 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderPostListFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderPostListFragment.java
@@ -516,7 +516,7 @@
                 getResources().getDimensionPixelSize(R.dimen.margin_extra_large) + spacingHorizontal);
 
         // add a menu to the filtered recycler's toolbar
-        if (!mAccountStore.hasAccessToken() && (getPostListType() == ReaderPostListType.TAG_FOLLOWED ||
+        if (mAccountStore.hasAccessToken() && (getPostListType() == ReaderPostListType.TAG_FOLLOWED ||
                 getPostListType() == ReaderPostListType.SEARCH_RESULTS)) {
             setupRecyclerToolbar();
         }
