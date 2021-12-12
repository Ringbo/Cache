diff --git a/library/src/main/java/com/aspsine/swipetoloadlayout/SwipeToLoadLayout.java b/library/src/main/java/com/aspsine/swipetoloadlayout/SwipeToLoadLayout.java
index df2114d..709f97a 100644
--- a/library/src/main/java/com/aspsine/swipetoloadlayout/SwipeToLoadLayout.java
+++ b/library/src/main/java/com/aspsine/swipetoloadlayout/SwipeToLoadLayout.java
@@ -619,7 +619,7 @@
     }
 
     private void scrollSwipingToLoadMoreToDefault() {
-        mAutoScroller.autoScroll(-mFooterOffset, mSwipingToRefreshToDefaultScrollingDuration);
+        mAutoScroller.autoScroll(-mFooterOffset, mSwipingToLoadMoreToDefaultScrollingDuration);
     }
 
     private void scrollReleaseToRefreshToRefreshing() {
@@ -631,7 +631,7 @@
     }
 
     private void scrollRefreshingToDefault() {
-        mAutoScroller.autoScroll(-mHeaderOffset, mSwipingToRefreshToDefaultScrollingDuration);
+        mAutoScroller.autoScroll(-mHeaderOffset, mRefreshCompleteToDefaultScrollingDuration);
     }
 
     private void scrollLoadingMoreToDefault() {
@@ -1295,7 +1295,7 @@
 
         } else if (STATUS.isSwipingToLoadMore(mStatus)) {
             // simply return
-            scrollLoadingMoreToDefault();
+            scrollSwipingToLoadMoreToDefault();
 
         } else if (STATUS.isReleaseToRefresh(mStatus)) {
             // return to header height and perform refresh
