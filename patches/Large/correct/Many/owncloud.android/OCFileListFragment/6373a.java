diff --git a/src/com/owncloud/android/ui/fragment/OCFileListFragment.java b/src/com/owncloud/android/ui/fragment/OCFileListFragment.java
index 80a80eb..6f65757 100644
--- a/src/com/owncloud/android/ui/fragment/OCFileListFragment.java
+++ b/src/com/owncloud/android/ui/fragment/OCFileListFragment.java
@@ -625,7 +625,7 @@
     }
 
     private void clearLocalSearchView() {
-        ((FileDisplayActivity) getActivity()).hideSoftKeyboard();
+        ((FileActivity) getActivity()).hideSoftKeyboard();
         mFileListAdapter.clearFilterBySearch();
         if (mSearchView != null) {
             mSearchView.onActionViewCollapsed();
