diff --git a/src/org/wordpress/android/ui/reader/ReaderPostDetailFragment.java b/src/org/wordpress/android/ui/reader/ReaderPostDetailFragment.java
index f847be2..afd1159 100644
--- a/src/org/wordpress/android/ui/reader/ReaderPostDetailFragment.java
+++ b/src/org/wordpress/android/ui/reader/ReaderPostDetailFragment.java
@@ -416,7 +416,7 @@
 
         // retain listView state if a comment has been scrolled to - this enables us to restore
         // the scroll position after comment data is reloaded
-        if (getListView().getFirstVisiblePosition() > 0) {
+        if (getListView() != null && getListView().getFirstVisiblePosition() > 0) {
             mListState = getListView().onSaveInstanceState();
             outState.putParcelable(ARG_LIST_STATE, mListState);
         } else {
