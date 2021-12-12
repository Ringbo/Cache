diff --git a/core/java/android/widget/AbsListView.java b/core/java/android/widget/AbsListView.java
index 48e7f79..fcfecb3 100644
--- a/core/java/android/widget/AbsListView.java
+++ b/core/java/android/widget/AbsListView.java
@@ -2645,7 +2645,7 @@
                         mScrollDuration);
 
                 mLastSeenPos = lastPos;
-                if (lastPos != mTargetPos) {
+                if (lastPos < mTargetPos) {
                     post(this);
                 }
                 break;
@@ -2671,7 +2671,7 @@
                 final int nextViewHeight = nextView.getHeight();
                 final int nextViewTop = nextView.getTop();
                 final int extraScroll = mExtraScroll;
-                if (nextPos != mBoundPos) {
+                if (nextPos < mBoundPos) {
                     smoothScrollBy(Math.max(0, nextViewHeight + nextViewTop - extraScroll),
                             mScrollDuration);
 
@@ -2704,7 +2704,7 @@
 
                 mLastSeenPos = firstPos;
 
-                if (firstPos != mTargetPos) {
+                if (firstPos > mTargetPos) {
                     post(this);
                 }
                 break;
@@ -2728,7 +2728,7 @@
                 final int lastViewTop = lastView.getTop();
                 final int lastViewPixelsShowing = listHeight - lastViewTop;
                 mLastSeenPos = lastPos;
-                if (lastPos != mBoundPos) {
+                if (lastPos > mBoundPos) {
                     smoothScrollBy(-(lastViewPixelsShowing - mExtraScroll), mScrollDuration);
                     post(this);
                 } else {
