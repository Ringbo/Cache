diff --git a/packages/SystemUI/src/com/android/systemui/tv/pip/PipRecentsOverlayManager.java b/packages/SystemUI/src/com/android/systemui/tv/pip/PipRecentsOverlayManager.java
index 5ad0bf6..dd12360 100644
--- a/packages/SystemUI/src/com/android/systemui/tv/pip/PipRecentsOverlayManager.java
+++ b/packages/SystemUI/src/com/android/systemui/tv/pip/PipRecentsOverlayManager.java
@@ -134,7 +134,7 @@
      */
     public void requestFocus(boolean allowRecentsFocusable) {
         mRecentsView.setVisibility(allowRecentsFocusable ? View.VISIBLE : View.GONE);
-        if (!mIsRecentsShown || mIsPipFocusedInRecent) {
+        if (!mIsPipRecentsOverlayShown || !mIsRecentsShown || mIsPipFocusedInRecent) {
             return;
         }
         mIsPipFocusedInRecent = true;
@@ -153,7 +153,7 @@
      * This should be called only by {@link com.android.systemui.recents.tv.RecentsTvActivity}.
      */
     public void clearFocus() {
-        if (!mIsRecentsShown || !mIsPipFocusedInRecent) {
+        if (!mIsPipRecentsOverlayShown || !mIsRecentsShown || !mIsPipFocusedInRecent) {
             return;
         }
         if (!mRecentsView.hasFocus()) {
