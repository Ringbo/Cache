diff --git a/library/src/main/java/com/aspsine/swipetoloadlayout/SwipeToLoadLayout.java b/library/src/main/java/com/aspsine/swipetoloadlayout/SwipeToLoadLayout.java
index 7121c5f..9be4371 100644
--- a/library/src/main/java/com/aspsine/swipetoloadlayout/SwipeToLoadLayout.java
+++ b/library/src/main/java/com/aspsine/swipetoloadlayout/SwipeToLoadLayout.java
@@ -1075,7 +1075,7 @@
     }
 
     /**
-     * Processed the scrolling(auto or physical) and append the diff values to mTargetOffset
+     * Process the scrolling(auto or physical) and append the diff values to mTargetOffset
      * I think it's the most busy and core method. :) a ha ha ha ha...
      *
      * @param yScrolled
@@ -1091,7 +1091,7 @@
                 mHeaderOffset = mTargetOffset;
                 mFooterOffset = 0;
                 if (mTargetOffset < mRefreshTriggerOffset) {
-                    if (STATUS.isStatusDefault(mStatus)) {
+                    if (STATUS.isReleaseToRefresh(mStatus)) {
                         setStatus(STATUS.STATUS_SWIPING_TO_REFRESH);
                     }
                 } else if (mTargetOffset >= mRefreshTriggerOffset) {
@@ -1108,7 +1108,7 @@
                 mFooterOffset = mTargetOffset;
                 mHeaderOffset = 0;
                 if (-mTargetOffset < mLoadMoreTriggerOffset) {
-                    if (STATUS.isStatusDefault(mStatus)) {
+                    if (STATUS.isReleaseToLoadMore(mStatus)) {
                         setStatus(STATUS.STATUS_SWIPING_TO_LOAD_MORE);
                     }
                 } else if (-mTargetOffset >= mLoadMoreTriggerOffset) {
@@ -1147,7 +1147,7 @@
             mFooterOffset = 0;
             setStatus(STATUS.STATUS_DEFAULT);
         }
-        Log.i(TAG, "mTargetOffset:" + mTargetOffset);
+        Log.i(TAG, "mTargetOffset:" + mTargetOffset + "; Status=" + STATUS.getStatus(mStatus));
         mRefreshCallback.onSwipe(mTargetOffset);
         layoutChildren();
         invalidate();
