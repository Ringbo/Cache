diff --git a/core/java/android/view/ViewRootImpl.java b/core/java/android/view/ViewRootImpl.java
index c86bc45..9461068 100644
--- a/core/java/android/view/ViewRootImpl.java
+++ b/core/java/android/view/ViewRootImpl.java
@@ -1179,7 +1179,8 @@
             mFullRedrawNeeded = true;
             mLayoutRequested = true;
 
-            if (lp.type == WindowManager.LayoutParams.TYPE_STATUS_BAR_PANEL) {
+            if (lp.type == WindowManager.LayoutParams.TYPE_STATUS_BAR_PANEL
+                    || lp.type == WindowManager.LayoutParams.TYPE_INPUT_METHOD) {
                 // NOTE -- system code, won't try to do compat mode.
                 Point size = new Point();
                 mDisplay.getRealSize(size);
@@ -1273,7 +1274,8 @@
                         || lp.height == ViewGroup.LayoutParams.WRAP_CONTENT) {
                     windowSizeMayChange = true;
 
-                    if (lp.type == WindowManager.LayoutParams.TYPE_STATUS_BAR_PANEL) {
+                    if (lp.type == WindowManager.LayoutParams.TYPE_STATUS_BAR_PANEL
+                            || lp.type == WindowManager.LayoutParams.TYPE_INPUT_METHOD) {
                         // NOTE -- system code, won't try to do compat mode.
                         Point size = new Point();
                         mDisplay.getRealSize(size);
