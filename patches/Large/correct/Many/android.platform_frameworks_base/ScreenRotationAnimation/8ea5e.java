diff --git a/services/java/com/android/server/wm/ScreenRotationAnimation.java b/services/java/com/android/server/wm/ScreenRotationAnimation.java
index bb01633..b01ddd3 100644
--- a/services/java/com/android/server/wm/ScreenRotationAnimation.java
+++ b/services/java/com/android/server/wm/ScreenRotationAnimation.java
@@ -69,7 +69,7 @@
         mContext = context;
         mDisplay = display;
 
-        display.getMetrics(mDisplayMetrics);
+        display.getRealMetrics(mDisplayMetrics);
 
         Bitmap screenshot = Surface.screenshot(0, 0);
 
@@ -244,7 +244,7 @@
                 break;
         }
 
-        mDisplay.getMetrics(mDisplayMetrics);
+        mDisplay.getRealMetrics(mDisplayMetrics);
 
         // Initialize the animations.  This is a hack, redefining what "parent"
         // means to allow supplying the last and next size.  In this definition
