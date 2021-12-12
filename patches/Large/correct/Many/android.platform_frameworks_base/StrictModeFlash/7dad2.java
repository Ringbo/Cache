diff --git a/services/java/com/android/server/wm/StrictModeFlash.java b/services/java/com/android/server/wm/StrictModeFlash.java
index 2c62080..71b5952 100644
--- a/services/java/com/android/server/wm/StrictModeFlash.java
+++ b/services/java/com/android/server/wm/StrictModeFlash.java
@@ -39,7 +39,7 @@
 
     public StrictModeFlash(Display display, SurfaceSession session) {
         final DisplayMetrics dm = new DisplayMetrics();
-        display.getMetrics(dm);
+        display.getRealMetrics(dm);
 
         try {
             mSurface = new Surface(session, 0, "StrictModeFlash", -1, 1, 1, PixelFormat.TRANSLUCENT, 0);
