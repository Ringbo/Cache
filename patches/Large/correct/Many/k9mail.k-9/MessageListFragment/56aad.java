diff --git a/src/com/fsck/k9/fragment/MessageListFragment.java b/src/com/fsck/k9/fragment/MessageListFragment.java
index fefa25a..07eb6b1 100644
--- a/src/com/fsck/k9/fragment/MessageListFragment.java
+++ b/src/com/fsck/k9/fragment/MessageListFragment.java
@@ -1098,7 +1098,7 @@
         mPullToRefreshView.setEmptyView(loadingView);
 
         if (isCheckMailSupported()) {
-            if (mSearch.isManualSearch() && mAccount.allowRemoteSearch()) {
+            if (mSearch.isManualSearch() && mSingleAccountMode && mAccount.allowRemoteSearch()) {
                 // "Pull to search server"
                 mPullToRefreshView.setOnRefreshListener(
                         new PullToRefreshBase.OnRefreshListener<ListView>() {
