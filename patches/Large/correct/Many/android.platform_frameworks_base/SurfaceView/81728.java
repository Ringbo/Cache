diff --git a/core/java/android/view/SurfaceView.java b/core/java/android/view/SurfaceView.java
index 160c662..7d48a9a 100644
--- a/core/java/android/view/SurfaceView.java
+++ b/core/java/android/view/SurfaceView.java
@@ -523,7 +523,7 @@
                             mVisibleInsets, mStableInsets, mOutsets, mConfiguration,
                             mNewSurface);
                     if ((relayoutResult & WindowManagerGlobal.RELAYOUT_RES_FIRST_TIME) != 0) {
-                        mReportDrawNeeded = true;
+                        reportDrawNeeded = true;
                     }
 
                     if (DEBUG) Log.i(TAG, "New surface: " + mNewSurface
