diff --git a/packages/SystemUI/src/com/android/systemui/tv/pip/PipRecentsOverlayManager.java b/packages/SystemUI/src/com/android/systemui/tv/pip/PipRecentsOverlayManager.java
index dd12360..fe5d8bc 100644
--- a/packages/SystemUI/src/com/android/systemui/tv/pip/PipRecentsOverlayManager.java
+++ b/packages/SystemUI/src/com/android/systemui/tv/pip/PipRecentsOverlayManager.java
@@ -134,7 +134,8 @@
      */
     public void requestFocus(boolean allowRecentsFocusable) {
         mRecentsView.setVisibility(allowRecentsFocusable ? View.VISIBLE : View.GONE);
-        if (!mIsPipRecentsOverlayShown || !mIsRecentsShown || mIsPipFocusedInRecent) {
+        if (!mIsPipRecentsOverlayShown || !mIsRecentsShown || mIsPipFocusedInRecent
+                || !mPipManager.isPipShown()) {
             return;
         }
         mIsPipFocusedInRecent = true;
@@ -153,7 +154,8 @@
      * This should be called only by {@link com.android.systemui.recents.tv.RecentsTvActivity}.
      */
     public void clearFocus() {
-        if (!mIsPipRecentsOverlayShown || !mIsRecentsShown || !mIsPipFocusedInRecent) {
+        if (!mIsPipRecentsOverlayShown || !mIsRecentsShown || !mIsPipFocusedInRecent
+                || !mPipManager.isPipShown()) {
             return;
         }
         if (!mRecentsView.hasFocus()) {
