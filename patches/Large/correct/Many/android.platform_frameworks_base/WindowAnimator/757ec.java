diff --git a/services/java/com/android/server/wm/WindowAnimator.java b/services/java/com/android/server/wm/WindowAnimator.java
index afdbc87..2688cff 100644
--- a/services/java/com/android/server/wm/WindowAnimator.java
+++ b/services/java/com/android/server/wm/WindowAnimator.java
@@ -542,7 +542,7 @@
         boolean hasPendingLayoutChanges = false;
         final int numDisplays = mService.mDisplayContents.size();
         for (int displayNdx = 0; displayNdx < numDisplays; ++displayNdx) {
-            final DisplayContent displayContent = mService.mDisplayContents.get(displayNdx);
+            final DisplayContent displayContent = mService.mDisplayContents.valueAt(displayNdx);
             final int pendingChanges = getPendingLayoutChanges(displayContent.getDisplayId());
             if ((pendingChanges & WindowManagerPolicy.FINISH_LAYOUT_REDO_WALLPAPER) != 0) {
                 mBulkUpdateParams |= SET_WALLPAPER_ACTION_PENDING;
