diff --git a/core/java/android/widget/AbsListView.java b/core/java/android/widget/AbsListView.java
index 78bbbce..c11c7e1 100644
--- a/core/java/android/widget/AbsListView.java
+++ b/core/java/android/widget/AbsListView.java
@@ -2665,7 +2665,7 @@
                         mScrollDuration);
 
                 mLastSeenPos = lastPos;
-                if (lastPos != mTargetPos) {
+                if (lastPos < mTargetPos) {
                     post(this);
                 }
                 break;
@@ -2691,7 +2691,7 @@
                 final int nextViewHeight = nextView.getHeight();
                 final int nextViewTop = nextView.getTop();
                 final int extraScroll = mExtraScroll;
-                if (nextPos != mBoundPos) {
+                if (nextPos < mBoundPos) {
                     smoothScrollBy(Math.max(0, nextViewHeight + nextViewTop - extraScroll),
                             mScrollDuration);
 
@@ -2724,7 +2724,7 @@
 
                 mLastSeenPos = firstPos;
 
-                if (firstPos != mTargetPos) {
+                if (firstPos > mTargetPos) {
                     post(this);
                 }
                 break;
@@ -2748,7 +2748,7 @@
                 final int lastViewTop = lastView.getTop();
                 final int lastViewPixelsShowing = listHeight - lastViewTop;
                 mLastSeenPos = lastPos;
-                if (lastPos != mBoundPos) {
+                if (lastPos > mBoundPos) {
                     smoothScrollBy(-(lastViewPixelsShowing - mExtraScroll), mScrollDuration);
                     post(this);
                 } else {
