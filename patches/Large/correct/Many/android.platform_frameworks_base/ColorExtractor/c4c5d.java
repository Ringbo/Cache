diff --git a/core/java/com/android/internal/colorextraction/ColorExtractor.java b/core/java/com/android/internal/colorextraction/ColorExtractor.java
index 04819a5..7204f98 100644
--- a/core/java/com/android/internal/colorextraction/ColorExtractor.java
+++ b/core/java/com/android/internal/colorextraction/ColorExtractor.java
@@ -97,14 +97,14 @@
     }
 
     /**
-     * Retrieve TYPE_NORMAL gradient colors considering wallpaper visibility.
+     * Retrieve gradient colors for a specific wallpaper.
      *
      * @param which FLAG_LOCK or FLAG_SYSTEM
      * @return colors
      */
     @NonNull
     public GradientColors getColors(int which) {
-        return getColors(which, TYPE_NORMAL);
+        return getColors(which, TYPE_DARK);
     }
 
     /**
