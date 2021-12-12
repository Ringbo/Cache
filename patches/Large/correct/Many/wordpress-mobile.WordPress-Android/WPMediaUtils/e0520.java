diff --git a/WordPress/src/main/java/org/wordpress/android/util/WPMediaUtils.java b/WordPress/src/main/java/org/wordpress/android/util/WPMediaUtils.java
index 8d7b3c1..ad28e3b 100644
--- a/WordPress/src/main/java/org/wordpress/android/util/WPMediaUtils.java
+++ b/WordPress/src/main/java/org/wordpress/android/util/WPMediaUtils.java
@@ -28,7 +28,7 @@
         if (isVideo) {
             return null;
         }
-        int resizeWidth = AppPrefs.getImageOptimizeWidth() > 0 ? AppPrefs.getImageOptimizeWidth() : Integer.MAX_VALUE;
+        int resizeWidth = AppPrefs.getImageOptimizeWidth() > 1 ? AppPrefs.getImageOptimizeWidth() : Integer.MAX_VALUE;
         int quality = AppPrefs.getImageOptimizeQuality();
         // do not optimize if original-size and 100% quality are set.
         if (resizeWidth == Integer.MAX_VALUE && quality == 100) {
