diff --git a/library/src/main/java/cn/dreamtobe/kpswitch/util/KeyboardUtil.java b/library/src/main/java/cn/dreamtobe/kpswitch/util/KeyboardUtil.java
index 298224b..c72cd3c 100644
--- a/library/src/main/java/cn/dreamtobe/kpswitch/util/KeyboardUtil.java
+++ b/library/src/main/java/cn/dreamtobe/kpswitch/util/KeyboardUtil.java
@@ -263,7 +263,8 @@
             } else {
 
                 final int phoneDisplayHeight = contentView.getResources().getDisplayMetrics().heightPixels;
-                if (phoneDisplayHeight == actionBarOverlayLayoutHeight) {
+                if (phoneDisplayHeight == actionBarOverlayLayoutHeight &&
+                        actionBarOverlayLayout.getPaddingTop() == 0) {
                     // no space to settle down the status bar, switch to fullscreen,
                     // only in the case of paused and opened the fullscreen page.
                     Log.w(TAG, String.format("skip the keyboard status calculate, the current" +
