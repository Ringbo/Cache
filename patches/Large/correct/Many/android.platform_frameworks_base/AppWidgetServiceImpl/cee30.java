diff --git a/services/java/com/android/server/AppWidgetServiceImpl.java b/services/java/com/android/server/AppWidgetServiceImpl.java
index 7bc6a88..4d6c058 100644
--- a/services/java/com/android/server/AppWidgetServiceImpl.java
+++ b/services/java/com/android/server/AppWidgetServiceImpl.java
@@ -190,7 +190,9 @@
         WindowManager wm = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);
         int height = wm.getDefaultDisplay().getRawHeight();
         int width = wm.getDefaultDisplay().getRawWidth();
-        mMaxWidgetBitmapMemory = 4 * width * height;
+        // Cap memory usage at 1.5 times the size of the display
+        // 1.5 * 4 bytes/pixel * w * h ==> 6 * w * h
+        mMaxWidgetBitmapMemory = 6 * width * height;
     }
 
     public void systemReady(boolean safeMode) {
