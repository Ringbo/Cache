diff --git a/core/java/com/android/internal/util/NotificationColorUtil.java b/core/java/com/android/internal/util/NotificationColorUtil.java
index 5c9f1c6..2778d93 100644
--- a/core/java/com/android/internal/util/NotificationColorUtil.java
+++ b/core/java/com/android/internal/util/NotificationColorUtil.java
@@ -557,7 +557,7 @@
     }
 
     public static boolean satisfiesTextContrast(int backgroundColor, int foregroundColor) {
-        return NotificationColorUtil.calculateContrast(backgroundColor, foregroundColor) >= 4.5;
+        return NotificationColorUtil.calculateContrast(foregroundColor, backgroundColor) >= 4.5;
     }
 
     /**
@@ -636,7 +636,7 @@
          */
         public static double calculateContrast(@ColorInt int foreground, @ColorInt int background) {
             if (Color.alpha(background) != 255) {
-                throw new IllegalArgumentException("background can not be translucent: #"
+                Log.wtf(TAG, "background can not be translucent: #"
                         + Integer.toHexString(background));
             }
             if (Color.alpha(foreground) < 255) {
