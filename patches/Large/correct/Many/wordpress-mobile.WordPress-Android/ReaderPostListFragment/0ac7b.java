diff --git a/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderPostListFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderPostListFragment.java
index 65bad05..2f14c9b 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderPostListFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderPostListFragment.java
@@ -678,7 +678,7 @@
     }
 
     private void setupObservables() {
-        mViewModel.getNewsItem().observe((FragmentActivity) getActivity(), new Observer<NewsItem>() {
+        mViewModel.getNewsDataSource().observe((FragmentActivity) getActivity(), new Observer<NewsItem>() {
             @Override public void onChanged(@Nullable NewsItem newsItem) {
                 getPostAdapter().updateNewsCardItem(newsItem);
             }
