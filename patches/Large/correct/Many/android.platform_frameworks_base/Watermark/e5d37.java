diff --git a/services/java/com/android/server/wm/Watermark.java b/services/java/com/android/server/wm/Watermark.java
index 22126f3..375abe5 100644
--- a/services/java/com/android/server/wm/Watermark.java
+++ b/services/java/com/android/server/wm/Watermark.java
@@ -52,7 +52,7 @@
 
     Watermark(Display display, SurfaceSession session, String[] tokens) {
         final DisplayMetrics dm = new DisplayMetrics();
-        display.getMetrics(dm);
+        display.getRealMetrics(dm);
 
         if (false) {
             Log.i(WindowManagerService.TAG, "*********************** WATERMARK");
