diff --git a/pulltorefresh/src/com/markupartist/android/widget/PullToRefreshListView.java b/pulltorefresh/src/com/markupartist/android/widget/PullToRefreshListView.java
index 8fbaeda..5278e7d 100644
--- a/pulltorefresh/src/com/markupartist/android/widget/PullToRefreshListView.java
+++ b/pulltorefresh/src/com/markupartist/android/widget/PullToRefreshListView.java
@@ -170,7 +170,7 @@
                     setVerticalScrollBarEnabled(true);
                 }
                 if (getFirstVisiblePosition() == 0 && mRefreshState != REFRESHING) {
-                    if ((mRefreshView.getBottom() > mRefreshViewHeight
+                    if ((mRefreshView.getBottom() >= mRefreshViewHeight
                             || mRefreshView.getTop() >= 0)
                             && mRefreshState == RELEASE_TO_REFRESH) {
                         // Initiate the refresh
@@ -178,7 +178,7 @@
                         prepareForRefresh();
                         onRefresh();
                     } else if (mRefreshView.getBottom() < mRefreshViewHeight
-                            || mRefreshView.getTop() < 0) {
+                            || mRefreshView.getTop() <= 0) {
                         // Abort refresh and scroll down below the refresh view
                         resetHeader();
                         setSelection(1);
@@ -282,7 +282,7 @@
                 && mRefreshState != REFRESHING) {
             if (firstVisibleItem == 0) {
                 mRefreshViewImage.setVisibility(View.VISIBLE);
-                if ((mRefreshView.getBottom() > mRefreshViewHeight + 20
+                if ((mRefreshView.getBottom() >= mRefreshViewHeight + 20
                         || mRefreshView.getTop() >= 0)
                         && mRefreshState != RELEASE_TO_REFRESH) {
                     mRefreshViewText.setText(R.string.pull_to_refresh_release_label);
