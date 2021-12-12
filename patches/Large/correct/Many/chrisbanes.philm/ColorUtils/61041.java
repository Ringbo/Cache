diff --git a/app/src/main/java/app/philm/in/lib/util/ColorUtils.java b/app/src/main/java/app/philm/in/lib/util/ColorUtils.java
index 0bad783..9ce0bc1 100644
--- a/app/src/main/java/app/philm/in/lib/util/ColorUtils.java
+++ b/app/src/main/java/app/philm/in/lib/util/ColorUtils.java
@@ -16,7 +16,11 @@
      * @return luma value according to to YIQ color space.
      */
     public static final int calculateYiqLuma(int color) {
-        return Math.round((299 * Color.red(color) + 587 * Color.green(color) + 114 * Color.green(color)) / 1000f);
+        return Math.round((
+                299 * Color.red(color) +
+                587 * Color.green(color) +
+                114 * Color.blue(color))
+        / 1000f);
     }
 
     /**
