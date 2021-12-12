diff --git a/core/java/android/view/ViewRootImpl.java b/core/java/android/view/ViewRootImpl.java
index 24fae8a..5b138fe 100644
--- a/core/java/android/view/ViewRootImpl.java
+++ b/core/java/android/view/ViewRootImpl.java
@@ -1342,7 +1342,7 @@
 
         boolean insetsChanged = false;
 
-        boolean layoutRequested = mLayoutRequested && !mStopped;
+        boolean layoutRequested = mLayoutRequested && (!mStopped || mReportNextDraw);
         if (layoutRequested) {
 
             final Resources res = mView.getContext().getResources();
@@ -1774,7 +1774,7 @@
                 }
             }
 
-            if (!mStopped) {
+            if (!mStopped || mReportNextDraw) {
                 boolean focusChangedDueToTouchMode = ensureTouchModeLocally(
                         (relayoutResult&WindowManagerGlobal.RELAYOUT_RES_IN_TOUCH_MODE) != 0);
                 if (focusChangedDueToTouchMode || mWidth != host.getMeasuredWidth()
@@ -1847,7 +1847,7 @@
             }
         }
 
-        final boolean didLayout = layoutRequested && !mStopped;
+        final boolean didLayout = layoutRequested && (!mStopped || mReportNextDraw);
         boolean triggerGlobalLayoutListener = didLayout
                 || mAttachInfo.mRecomputeGlobalAttributes;
         if (didLayout) {
