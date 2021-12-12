diff --git a/packages/SystemUI/src/com/android/systemui/recent/RecentsPanelView.java b/packages/SystemUI/src/com/android/systemui/recent/RecentsPanelView.java
index bec9aa2..0bdf84a 100644
--- a/packages/SystemUI/src/com/android/systemui/recent/RecentsPanelView.java
+++ b/packages/SystemUI/src/com/android/systemui/recent/RecentsPanelView.java
@@ -790,7 +790,7 @@
             if (DEBUG) Log.v(TAG, "Starting activity " + intent);
             context.startActivity(intent, opts.toBundle());
         }
-        if (!usingDrawingCache) {
+        if (usingDrawingCache) {
             holder.thumbnailViewImage.setDrawingCacheEnabled(false);
         }
     }
