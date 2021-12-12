diff --git a/library/src/main/java/com/bumptech/glide/load/resource/bitmap/Downsampler.java b/library/src/main/java/com/bumptech/glide/load/resource/bitmap/Downsampler.java
index a516a1b..9091edd 100644
--- a/library/src/main/java/com/bumptech/glide/load/resource/bitmap/Downsampler.java
+++ b/library/src/main/java/com/bumptech/glide/load/resource/bitmap/Downsampler.java
@@ -251,7 +251,8 @@
     }
 
     private static Bitmap.Config getConfig(InputStream is, DecodeFormat format) {
-        if (format == DecodeFormat.ALWAYS_ARGB_8888) {
+        // Changing configs can cause skewing on 4.1, see issue #128.
+        if (format == DecodeFormat.ALWAYS_ARGB_8888 || Build.VERSION.SDK_INT == Build.VERSION_CODES.JELLY_BEAN) {
             return Bitmap.Config.ARGB_8888;
         }
 
