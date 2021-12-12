diff --git a/graphics/java/android/graphics/Bitmap.java b/graphics/java/android/graphics/Bitmap.java
index 599406c..abdab39 100644
--- a/graphics/java/android/graphics/Bitmap.java
+++ b/graphics/java/android/graphics/Bitmap.java
@@ -996,7 +996,9 @@
         }
 
         Bitmap bm;
-        if (config != Config.ARGB_8888) {
+        // nullptr color spaces have a particular meaning in native and are interpreted as sRGB
+        // (we also avoid the unnecessary extra work of the else branch)
+        if (config != Config.ARGB_8888 || colorSpace == ColorSpace.get(ColorSpace.Named.SRGB)) {
             bm = nativeCreate(null, 0, width, width, height, config.nativeInt, true, null, null);
         } else {
             if (!(colorSpace instanceof ColorSpace.Rgb)) {
